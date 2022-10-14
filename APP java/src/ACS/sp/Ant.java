 

package ACS.sp;

import java.util.*;

 
public abstract class Ant extends Observable implements Runnable
{
     private int m_nAntID;
    
    protected int[][]  m_path;
    protected int      m_nCurNode;
    protected int      m_nStartNode;
    protected double   m_dPathValue;
    protected Observer m_observer;
    protected   Vector   m_pathVect;
    
    private static int s_nAntIDCounter = 0;
    
    
    protected static AntColony s_antColony;
    public static double    nex_best_path ;
    public static double    s_dBestPathValue = 0.1;
    public static Vector    s_bestPathVect  = null;
    public static int[][]   s_bestPath      = null;
    public static int       s_nLastBestPathIteration = 0;
    int path [];
    double k = 0 ; double fibility_s = 0 ;double scu_st = 0 ; double tomp_st = 0 ; double dis_st = 0 ;
    public static void setAntColony(AntColony antColony)
    {
        s_antColony = antColony;
    }
    
    public static void reset()
    {
        s_dBestPathValue =0.0;
        s_bestPathVect = null;
        s_bestPath = null;
        s_nLastBestPathIteration = 0;
      
    }
   
   
    int num_tache =Integer.parseInt(form.nm_tache.getText());
   
    public Ant(int nStartNode, Observer observer)
    {
        s_nAntIDCounter++;
        m_nAntID    = s_nAntIDCounter;
        m_nStartNode = nStartNode;
        m_observer  = observer;
    }

    public void init()
    { 
        final AntGraph graph = s_antColony.getGraph();
        m_nCurNode   = m_nStartNode;
        
        m_path      = new int[graph.nodes()][graph.nodes()];
        m_pathVect  = new Vector(num_tache);
        
        m_pathVect.addElement(new Integer(m_nStartNode));
        m_dPathValue = 0;
    }

    public void start()
    {
        init();
        Thread thread = new Thread(this);
        thread.setName("Ant " + m_nAntID);
        thread.start();
    }

    public void run()
    {
        
        final AntGraph graph = s_antColony.getGraph();
        path= new int [num_tache];
        // repeat while End of Activity Rule returns false
        for(int i = 0; i < num_tache-1; i++)
        {    
            int nNewNode;
            
            // synchronize the access to the graph
            synchronized(graph)
            {   // apply the State Transition Rule
                nNewNode = stateTransitionRule(m_nCurNode);
               
             }
                        
            // add the current node the list of visited nodes
            m_pathVect.addElement(nNewNode);
          
            
            m_path[m_nCurNode][nNewNode] = 1;
                   //     System.out.println("naw" +m_nCurNode +"next "+nNewNode);
            synchronized(graph)
            {
               
                // apply the Local Updating Rule
              
                localUpdatingRule(m_nCurNode, nNewNode);
                
            }
            
            // update the current node
            m_nCurNode = nNewNode;
        }          

         
        
          
        
         for(int i = 0;i < m_pathVect.size()   ; i++){
           
             path[i]=(int)m_pathVect.get(i);
          
   }
         
         
         
          
          
 
         
            double   p_fiab =  Double.parseDouble(form.txt_fiab.getText());
            double   p_cout = Double.parseDouble(form.cout_aff.getText());
            double   p_dis = Double.parseDouble(form.txt_dis.getText());
            double   p_suc = Double.parseDouble(form.txt_scu.getText());
            double   p_temp = Double.parseDouble(form.txt_tomp.getText());
         
         
         
         
         F_scour F =new  F_scour (path ) ;
         m_dPathValue  = F.F_sorce(p_suc,p_temp,p_cout,p_fiab,p_dis );
         
  try {
      form.F_scor.add(m_dPathValue);            
  
  }catch (Exception e){}
         synchronized(graph)
        {
            
      
            // update the best tour value
            if(better(m_dPathValue, s_dBestPathValue)==true)
            {
                
                s_dBestPathValue        = m_dPathValue;
                s_bestPath              = m_path;
                s_bestPathVect          = m_pathVect;
                s_nLastBestPathIteration = s_antColony.getIterationCounter();
               nex_best_path  =s_dBestPathValue;
  
         for(int i = 0;i < m_pathVect.size()   ; i++){
           
             path[i]=(int)m_pathVect.get(i);
                                                      }
                
           
            for(int j = 0; j < path.length; j++)  { 
                 k +=  generates_and_display.cout.get( path[j]);
             
           fibility_s += generates_and_display.fiabilite.get( path[j]);
            scu_st+=generates_and_display.security.get( path[j]);
             tomp_st+=generates_and_display.power.get( path[j]);
            dis_st+=generates_and_display.disponibilite.get( path[j]);
            
            
            
            
            
            }                    
          
             try{
               form.cout_stat.add(k);
               form.fiab_stat.add((fibility_s/path.length));
               form.suc_stat.add((scu_st/path.length));
               form.tomp_stat.add(tomp_st);   
               form.dispo_stat.add(dis_st/path.length);
               
                k = 0 ; fibility_s=0;scu_st = 0 ;tomp_st=0;dis_st=0;}catch(Exception e){}
            }         
               try{
                                form.cout_stat.add(form.cout_stat.get(form.cout_stat.size()-1));
                                form.fiab_stat.add(form.fiab_stat.get(form.fiab_stat.size()-1));
                                form.suc_stat.add(form.suc_stat.get(form.suc_stat.size()-1));
                                form.tomp_stat.add(form.tomp_stat.get(form.tomp_stat.size()-1));
                                form.dispo_stat.add(form.dispo_stat.get(form.dispo_stat.size()-1));
               
               }catch(Exception e){}
                  
            
            
            
        }
        
        // update the observer
        m_observer.update(this, null);
        
    }
    
    protected abstract boolean better(double dPathValue, double dBestPathValue);
    
    public abstract int stateTransitionRule(int r);
    
    public abstract void localUpdatingRule(int r, int s);
    
    public abstract boolean end();
    
    public static int[] getBestPath()
    {
        int nBestPathArray[] = new int[s_bestPathVect.size()];
        for(int i = 0; i < s_bestPathVect.size(); i++)
        {
            nBestPathArray[i] = ((Integer)s_bestPathVect.elementAt(i));
       
           
        }

        return nBestPathArray;
    }
        
    public String toString()
    {
        return "Ant " + m_nAntID + ":" + m_nCurNode;
    }
}


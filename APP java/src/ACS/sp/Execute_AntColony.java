package ACS.sp;

 
import java.util.*;
public final class Execute_AntColony
{
  private static Random s_ran = new Random(System.currentTimeMillis());
  
    public int N_Tache ; 
    public int path_[];  public int pathB_utération[];
   public int f,u,w;
   public int repitiion;
   public int path_mat[][] ;
  public double scor = 0.1 ;
         public   Vector kh_path ;
   public double fs  ;
    
    public Execute_AntColony(double[][] delta,int nAnts,int N_VMS,int N_Tache,int nIterations,int nRepetitions){
    path_ = new int [N_Tache];
    pathB_utération = new int [N_Tache];
       path_mat=new int[nRepetitions][N_Tache];
       double k = 0;double fF = 0;double sc = 0;
        // generate the graph 
       
        AntGraph graph = new AntGraph(N_VMS, delta);
         
        try
        { 
              
             int nNodesInZArray[] = new int[N_VMS];
            
          
            
            Hashtable auxTbl = new Hashtable();
           
            for(int i = 0; i < N_VMS; i++)
            {
                Integer nNode = new Integer((int)(graph.nodes() * s_ran.nextDouble()));
                while(auxTbl.containsKey(nNode))
                    nNode = new Integer((int)(graph.nodes() * s_ran.nextDouble()));
                
                nNodesInZArray[i] = nNode.intValue();
                
                
                auxTbl.put(nNode, nNode);
          
            }
            
          
      
       
               for(int i = 0; i < nRepetitions; i++)
            { 
                AntColony4SP antColony = new AntColony4SP(graph, nNodesInZArray, nAnts, nIterations);
                antColony.start();
                   graph.resetTau();
                   
                   fs = antColony.best_fscor();
                   kh_path = antColony.getBestPathVector();
                   //pathB_utération
                    for(int j = 0; j < path_.length; j++)  { 
                        
                         pathB_utération[j] = (int) kh_path.get(j);
                         
                      //   k += generates_and_display.cout.get( pathB_utération[j]);
                         fF += generates_and_display.fiabilite.get( pathB_utération[j]);
                         sc +=generates_and_display.security.get( pathB_utération[j]);
                                          }

                   if (betterr(fs,scor)==true){
         
                      for(int j = 0; j < path_.length; j++)  { 
                         path_[j] = (int) kh_path.get(j);
                         
                                          }  
                  generates_and_display.meu_fscore = fs ; 
                   scor = fs ;
                   }
                   
                  
                   
                   u = antColony.getLastBestPathIteration();
                   f = antColony.getAnts();
                   w = antColony.getIterationCounter();
                    fF=fF/N_Tache;
                    sc = sc/N_Tache;
             //    form.cout_stat.add(k);
                 form.fiab_stat.add(fF);   
                  form.suc_stat.add(sc); 
          sc = 0 ;
           fF=0;
           k=0;
           form.repp = i ; 
           
         }    
                 
         }
        catch(Exception ex)
        {
            System.out.println("exception");
        }
    }


 
public int[] get_path(){ return path_ ;}
 

  
    public boolean betterr(double dPathValue1, double dPathValue2)
    {
         
       boolean x ; 
        if(dPathValue1>dPathValue2){x = true;}else {x = false;}
        
        
        
        return x;
    }










}


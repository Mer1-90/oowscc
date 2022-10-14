/**
 * Ant4TSP.java
 *
 * @author Created by Omnicore CodeGuide
 */

package ACS.sp;
import static ACS.sp.form.*;
import java.util.*;


public class Ant4TSP extends Ant
{
    private static final double B    =   Double.parseDouble(b.getText());
    private static final double Q0   =   Double.parseDouble(q.getText());
    private static final double R    = 0.2;
     
    
    private static final Random s_randGen = new Random(System.currentTimeMillis());
        
    protected Hashtable m_nodesToVisitTbl;
        
    public Ant4TSP(int startNode, Observer observer)
    {
        super(startNode, observer);
    }
    
    @SuppressWarnings("unchecked")
	public void init()
    {
        super.init();
        
        final AntGraph graph = s_antColony.getGraph();
        
        int nodesToVisit = 0;
        for (int i = 0; i < graph.nodes(); i++)
        	for (int j = 0; j < graph.nodes(); j++)
        		if(graph.delta(i, j) != -1)
        			nodesToVisit++;
        // inizializza l'array di vms  da visitare
         
        
        
        m_nodesToVisitTbl = new Hashtable(nodesToVisit);
        for(int i = 0; i < graph.nodes(); i++)
        	for(int j = 0; j < graph.nodes(); j++) 
        		if(graph.delta(i, j) >= 0)  
        			m_nodesToVisitTbl.put(new Integer(i), new Integer(i));       
        
        // Rimuove la vms corrente
        m_nodesToVisitTbl.remove(new Integer(m_nStartNode));
        
 
    }

     
   /*****************************************///    __________ step 3 _______________ ....         
    
    
    @Override
	public int stateTransitionRule(int nCurNode)
    {
        final AntGraph graph = s_antColony.getGraph();
        
        // generate a random number
        double q    = s_randGen.nextDouble();
        
        
        int nMaxNode = -1;
    
        if(q > Q0)  // Exploitation
        {
    
            double dMaxVal = -1;
            double dVal;
            int nNode;
            
            // search the max of the value as defined in Eq. 16 )
            Enumeration enume = m_nodesToVisitTbl.elements();
            while(enume.hasMoreElements())
            {
                // select a node
                nNode = ((Integer)enume.nextElement()).intValue();
                
                // check on tau
                if(graph.tau(nCurNode, nNode) == 0)
                    throw new RuntimeException("tau = 0");
                
                if(graph.delta(nCurNode, nNode) == Double.MAX_VALUE)
                	continue;
                
                
                
                
                
                // get the value
                dVal = graph.tau(nCurNode, nNode) * Math.pow(graph.etha(nCurNode, nNode), B);
                // check if it is the max
                if(dVal > dMaxVal)
                {
                    dMaxVal  = dVal;
                    nMaxNode = nNode;
                }
            }
        }
        else  // Exploration
        {
            
            double dSum = 0;
            int nNode = -1;
            
            // get the sum at denominator
            Enumeration enume = m_nodesToVisitTbl.elements();
            while(enume.hasMoreElements())
            {
                nNode = ((Integer)enume.nextElement()).intValue();
                if(graph.tau(nCurNode, nNode) == 0)
                    throw new RuntimeException("tau = 0");
                
                if(graph.delta(nCurNode, nNode) == Double.MAX_VALUE)
                	continue;
                
                // Update the sum
                dSum += graph.tau(nCurNode, nNode) * Math.pow(graph.etha(nCurNode, nNode), B);
            }
                    
            
            // get the everage value
            double dAverage = dSum / (double)m_nodesToVisitTbl.size();
            
            // search the node in agreement with eq: 16)
            enume = m_nodesToVisitTbl.elements();
            while(enume.hasMoreElements() && nMaxNode < 0)
            {
                nNode = ((Integer)enume.nextElement()).intValue();
                
                if(graph.delta(nCurNode, nNode) == Double.MAX_VALUE)
                	continue;
                
                // get the value of p as difined in eq : 17)
                double p =(graph.tau(nCurNode, nNode) * Math.pow(graph.etha(nCurNode, nNode), B)) / dSum;
                    
                
                // if the value of p is greater the the average value the node is good
                
                if((graph.tau(nCurNode, nNode) * Math.pow(graph.etha(nCurNode, nNode), B)) > dAverage)
                {
                  
                    nMaxNode = nNode;
                }
                                
            }           
            
            if(nMaxNode == -1) 
                nMaxNode = nNode;
       }
                 
        
        
        
        /************************* delete the selected node from the list of node to visit  ************/
      
        
        m_nodesToVisitTbl.remove(new Integer(nMaxNode));
        
        return nMaxNode;
    }
    
        
        
        
        
        
        
        
        
        
        /*                     Step :  4 Local pheromone level updating. Update the
                               pheromone level between two candidate cloud services for
                               each ant as*/
        
        
    public void localUpdatingRule(int nCurNode, int nNextNode)
    {
        final AntGraph graph = s_antColony.getGraph();
        
        // get the value of the Eq. c)
        double val =((double)1 - R) * graph.tau(nCurNode, nNextNode) +(R * (graph.tau0()));
         // update tau
        graph.updateTau(nCurNode, nNextNode, val);
    }
    
    
    
    
    
    
    
    
    
    public boolean better(double dPathValue1, double dPathValue2)
    {
         
       boolean x ; 
        if(dPathValue1>dPathValue2){x = true;}else {x = false;}
        
        
        
        return x;
    }

    
    
    
    public boolean end()
    {
        return m_nodesToVisitTbl.isEmpty();
    }
}


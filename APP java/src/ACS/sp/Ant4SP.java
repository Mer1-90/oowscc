/**
 * Ant4TSP.java
 *
 * @author Created by Omnicore CodeGuide
 */
package ACS.sp;

import java.util.*;

public class Ant4SP extends Ant4TSP
{
    public Hashtable m_nodesInZTbl;
    private int[] m_nodesInZ;
    
    public Ant4SP(int nStartNode, int[] nodesInZ, Observer observer)
    {
        super(nStartNode, observer);
        
        m_nodesInZ = nodesInZ;
    }
    
    public void init()
    {
        super.init();
        
        // inizializza l'array di citt� da visitare
        m_nodesInZTbl = new Hashtable(m_nodesInZ.length);
        for(int i = 0; i < m_nodesInZ.length; i++)
            m_nodesInZTbl.put(new Integer(m_nodesInZ[i]), new Integer(m_nodesInZ[i]));
        
        // Rimuove la citt� corrente
        m_nodesInZTbl.remove(new Integer(m_nStartNode));
    }
    public int stateTransitionRule(int curNode)
    {
        int nNextNodeToVisit = super.stateTransitionRule(curNode);
        
        // Elimina la citt� selezionata dalla lista
        m_nodesInZTbl.remove(new Integer(nNextNodeToVisit));
                
        return nNextNodeToVisit;
    }

    public boolean end()
    {
        return m_nodesInZTbl.isEmpty();
    }
}


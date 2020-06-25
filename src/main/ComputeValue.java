package main;

import java.util.Iterator;
import java.util.Set;

public class ComputeValue extends AbstractINodeOperator
{

    /**
     * Creates a new ComputeValue object
     */
    public ComputeValue(){super();}


    /**
     * Returns the sum of values of the nodes that can be reached from the root
     */
    public int getValue()
    {
        Set<INode> nodes = searchGraph(root);
        Iterator iter = nodes.iterator();
        int i = 0;
        while (iter.hasNext())
        {
            i+=((INode)iter.next()).getValue();
        }
        return i;
    }


}

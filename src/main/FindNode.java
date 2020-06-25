package main;

import java.util.*;

public class FindNode extends AbstractINodeOperator
{
    protected int value;


    /**
     * Creates a new FindNode object
     */
    public FindNode(){super();}


    /**
     * Sets the value that will be searched for in the graph
     * @param value
     *      The value
     */
    public void setValue(int value) { this.value = value; }


    /**
     * Returns the nodes that can be reached from the root that match the correct value
     */
    public Set<INode> getResults()
    {
        Set<INode> nodes = searchGraph(root);
        Set<INode> correct_nodes = new HashSet<INode>();
        Iterator iter = nodes.iterator();
        while (iter.hasNext())
        {
            INode current = (INode)iter.next();
            if (current.getValue()==this.value)
            {
                correct_nodes.add(current);
            }
        }
        return correct_nodes;
    }


}

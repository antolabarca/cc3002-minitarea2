package main;

import java.util.Set;

public class NumberOfNodes extends AbstractINodeOperator
{

    /**
     * Creates a new NumberOfNodes object
     */
    public NumberOfNodes(){super();}


    /**
     * Returns the amount of nodes in the graph that can be reached from the root
     */
    public int numberOfNodes()
    {
        Set<INode> nodes = searchGraph(root);
        return nodes.size();
    }
}

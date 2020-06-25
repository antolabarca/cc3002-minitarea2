package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NullNode implements INode {

    /**
     * Creates a new null node
     */
    public NullNode() { super(); }


    /**
     * Doesn't actually do anything, it just returns null
     * (NullNodes can't be connected to any other nodes)
     */
    @Override
    public INode connectTo(INode anotherINode)
    {
        return null;
    }


    /**
     * Returns the value of the null node, which is 0
     */
    @Override
    public int getValue()
    {
        return 0;
    }


    /**
     * Returns a list of the nodes connected to the null node, which are none
     */
    @Override
    public List<INode> getConnectedNodes()
    {
        return new ArrayList<INode>();
    }


    /**
     * Checks if this Node is null (in this case it's true)
     */
    @Override
    public boolean isNull() { return true; }
}

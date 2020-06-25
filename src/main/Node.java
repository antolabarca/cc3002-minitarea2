package main;

import java.util.List;
import java.util.ArrayList;

public class Node implements INode
{
    private int value;
    private List<INode> connectedNodes;


    /**
     * Creates a new node
     * @param aValue
     *      The value of the node
     */
    public Node(int aValue)
    {
        value = aValue;
        connectedNodes = new ArrayList<>();
    }


    /**
     * Connects this node to another node
     * @param anotherINode
     *      the node that will be connected to this one
     */
    @Override
    public INode connectTo(INode anotherINode)
    {
        this.connectedNodes.add(anotherINode);
        return this;
    }


    /**
     * Returns the value of this node
     */
    @Override
    public int getValue() { return value;  }


    /**
     * Returns the nodes that are connected to this one
     */
    @Override
    public List<INode> getConnectedNodes() { return connectedNodes;  }


    /**
     * Checks if this Node is null (in this case it's false)
     */
    @Override
    public boolean isNull() { return false; }

}
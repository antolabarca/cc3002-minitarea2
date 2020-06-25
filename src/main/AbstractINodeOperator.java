package main;

import java.util.*;

public abstract class AbstractINodeOperator implements INodeOperator
{
    protected INode root;


    /**
     * Creates a new object from the class
     */
    AbstractINodeOperator()
    {
        root=new NullNode();
    }


    /**
     * Sets the root from which the INode Operator will start searching
     * @param root
     *      the INode root
     */
    public void setRoot(INode root)
    {
        this.root = root;
    }


    /**
     * Returns a Set of all of the INodes that can be reached from a specific inode
     * @param node
     *      the starting node
     */
    public Set<INode> searchGraph(INode node)
    {
        if (node.getConnectedNodes().isEmpty())
        {
            Set<INode> set = new HashSet<INode>();
            if (! node.isNull()) { set.add(node); }
            return set;
        }

        Set<INode> set = new HashSet<INode>();
        set.add(node);
        Iterator iter = node.getConnectedNodes().iterator();
        while (iter.hasNext())
        {
            INode current = (INode) iter.next();
            if (!set.contains(current))
            {
                set.addAll(searchGraph((INode) current));
            }
        }

        return set;
    }


}

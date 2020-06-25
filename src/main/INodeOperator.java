package main;

import java.util.Set;

public interface INodeOperator
{
    void setRoot(INode root);
    Set<INode> searchGraph(INode node);
}

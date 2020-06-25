package main;

import java.util.List;

public interface INode {
    INode connectTo(INode anotherINode);
    int getValue();
    List<INode> getConnectedNodes();
    boolean isNull(); //idk if this is a good thing to do but I can't figure out how
                      //else to prevent null nodes from being added to the list of nodes :(
}

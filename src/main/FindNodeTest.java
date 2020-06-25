package main;

import main.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindNodeTest
{
    private Node root, a, b, c;
    private NullNode n1, n2;

    @Before
    public void setUp()
    {
        root = new Node(2);
        a = new Node(1);
        b = new Node(3);
        c = new Node(4);
        n1 = new NullNode();
        n2 = new NullNode();
        root.connectTo(a).connectTo(b);
        b.connectTo(c);
        a.connectTo(n1).connectTo(n2);
    }

    @Test
    public void testFindNode()
    {
        FindNode v = new FindNode();
        assertEquals(new HashSet<INode>(), v.getResults());
        v.setRoot(root);
        v.setValue(1);
        assertEquals(1, v.getResults().size());
        assertTrue(v.getResults().contains(a));
    }
}

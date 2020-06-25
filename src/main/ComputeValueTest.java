package main;

import main.ComputeValue;
import main.Node;
import main.NullNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeValueTest {
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
    public void TestComputeValue()
    {
        ComputeValue v = new ComputeValue();
        assertEquals(0, v.getValue());
        v.setRoot(root);
        assertEquals(10, v.getValue());
    }
}

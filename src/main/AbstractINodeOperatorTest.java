package main;

import main.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractINodeOperatorTest {
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
    public void testAbstractINodeOperator()
   {
       FindNode v1 = new FindNode();
       Set<INode> set = v1.searchGraph(n1);
       assertTrue(set.isEmpty());
       set = v1.searchGraph(root);
       assertEquals(4, set.size());
       assertTrue(set.contains(root));
       assertTrue(set.contains(a));
       assertTrue(set.contains(b));
       assertTrue(set.contains(c));

       ComputeValue v2 = new ComputeValue();
       set = v2.searchGraph(n1);
       assertTrue(set.isEmpty());
       set = v2.searchGraph(root);
       assertEquals(4, set.size());
       assertTrue(set.contains(root));
       assertTrue(set.contains(a));
       assertTrue(set.contains(b));
       assertTrue(set.contains(c));

       NumberOfNodes v3 = new NumberOfNodes();
       set = v3.searchGraph(n1);
       assertTrue(set.isEmpty());
       set = v3.searchGraph(root);
       assertEquals(4, set.size());
       assertTrue(set.contains(root));
       assertTrue(set.contains(a));
       assertTrue(set.contains(b));
       assertTrue(set.contains(c));
   }
}

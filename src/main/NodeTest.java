package main;

import main.Node;
import main.ComputeValue;
import main.FindNode;
import main.NumberOfNodes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NodeTest
{
    private Node root, a, b, c, d, e;
    /**
     * * Create a graph:
     * root -> { a b}
     * b -> e
     * a -> { c d }
     * c -> e
     * d -> e
     */
     @Before
     public void setUp()
     {
         root = new Node(2);
         a = new Node(1);
         b = new Node(3);
         c = new Node(4);
         d = new Node(2);
         e = new Node(1);
         root.connectTo(a).connectTo(b);
         b.connectTo(e);
         a.connectTo(c).connectTo(d);
         c.connectTo(e);
         d.connectTo(e);
     }

    @Test
    public void testNumberOfNodes()
    {
        NumberOfNodes v = new NumberOfNodes();
        v.setRoot(root);
        //...
        // en total hay 6 nodos conectados a root (directa e indirectamente). Se considera root en el calculo.
        assertEquals(6, v.numberOfNodes());
    }

    @Test public void testComputeValue()
    {
        ComputeValue v = new ComputeValue();
        v.setRoot(root);
        // la suma de los valores de los nodos accesibles desde root es 13, incluyendo el valor de root.
        assertEquals(13, v.getValue());
    }

    @Test public void testFindNodes()
    {
        // La clase FindNode busca los nodos a los cuales tienen un valor particular
        FindNode v = new FindNode();
        v.setRoot(root);
        v.setValue(1);
        assertEquals(2, v.getResults().size());
        assertTrue(v.getResults().contains(a));
        assertTrue(v.getResults().contains(e));
    }
}

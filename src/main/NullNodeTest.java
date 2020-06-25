package main;

import main.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullNodeTest
{
    private NullNode nullNode1;
    private NullNode nullNode2;

    @Before
    public void setUp()
    {
        nullNode1 = new NullNode();
        nullNode2 = new NullNode();
    }

   @Test
   public void testNullNode()
   {
       assertEquals(null, nullNode1.connectTo(nullNode2));
       assertEquals(0, nullNode1.getValue());
       assertEquals(new ArrayList<INode>(), nullNode1.getConnectedNodes());
   }

    @Test
    public void testNumberOfNodes()
    {
        NumberOfNodes v = new NumberOfNodes();
        assertEquals(0, v.numberOfNodes());
    }

    @Test public void testComputeValue()
    {
        ComputeValue v = new ComputeValue();
        assertEquals(0, v.getValue());
    }

    @Test public void testFindNodes()
    {
        FindNode v = new FindNode();
        v.setValue(1);
        assertTrue(v.getResults().isEmpty());
    }

}

package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import vertex.Vertex;

public class VertexTest {
	Vertex v, v2, v3;

	@Test
	public void testAAGetIndex() {
		// testAA will be first

		v = new Vertex("ABC");
		assertEquals(0, v.getIndex());

		v = new Vertex(null);
		assertEquals(1, v.getIndex());
	}

	@Test
	public void testConstructor() {
		
		v = new Vertex("ABC");
		assertEquals("ABC", v.label);

		v = new Vertex(20);
		assertEquals("20", v.label);

		v = new Vertex('D');
		assertEquals("D", v.label);

		// if unallowable type use index to label
		v = new Vertex(3.7);
		String index = String.valueOf(v.getIndex());
		assertEquals(index, v.label);
	}
	
	@Test
	public void testToString() {
		
		v = new Vertex("vertex01");
		String str = "Vertex vertex01";
		assertEquals(str, v.toString());
		
		v = new Vertex(3.7);
		str = "Vertex " + String.valueOf(v.getIndex());
		assertEquals(str, v.toString());
	}

	@Test
	public void testEquals() {
		
		v = new Vertex("Ab");
		v2 = new Vertex("Ab");
		
		assertFalse( v.equals(v2) );
		
		v = v2;
		assertTrue( v.equals(v2) );
	}
	
	@Test
	public void testCost() {
	
		v = new Vertex(0);
		
		assertEquals( -1.0, v.cost, 0.00001);

		v.cost = 2.2;
		assertEquals( 2.2, v.cost, 0.00001);
	}
	
	@Test
	public void testSetCostAll() {
	
		v = new Vertex(0);	// -1.0
		v2 = new Vertex(1);
		v2.cost = 2;		// 2.0
		Vertex.setCostAll(3);
		
		assertEquals( 3.0, v.cost, 0.00001);
		assertEquals( 3.0, v2.cost, 0.00001);
	}

	@Test
	public void testVisited() {
	
		v = new Vertex(0);
		
		assertFalse( v.visited );

		v.visited = true;
		assertTrue( v.visited );
	}
	
	@Test
	public void testSetAllUnvisited() {
	
		v = new Vertex(0);
		v2 = new Vertex(1);
		v.visited = true;
		v2.visited = true;
		
		Vertex.setAllUnvisited();
		
		assertFalse( v.visited );
		assertFalse( v2.visited );
	}

	@Test
	public void testCompareTo() {
	
		v = new Vertex(0);
		v2 = new Vertex(1);
		v.cost = 2.3;
		v2.cost = 4.7;
		
		assertEquals(-1, v.compareTo(v2));
		assertEquals( 1, v2.compareTo(v));
		
		v2.cost = 2.3;
		assertEquals( 0, v.compareTo(v2));
	}
	@Test
	public void testParent() {
	
		v = new Vertex(0);
		v2 = new Vertex(1);
		
		assertNull(v.parent);
		
		v.parent = v2;
		assertEquals( v2, v.parent);
	}
	
	@Test
	public void testGetVertexIndex() {
		v = new Vertex(0);
		int index = v.getIndex();
		v2 = v.getVertexIndex(index);

		assertEquals( v2, v);
		
		v2 = Vertex.getVertexIndex(index);
		assertEquals( v2, v);

		v2 = Vertex.getVertexIndex(1000);
		assertNotEquals( v2, v);
	}
	
	@Test
	public void testZZPrintAll() {
		
		System.out.println("Number = " + Vertex.getNumber());
		Vertex.printAll();
	}

}

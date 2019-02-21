package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	void assertIntEq(int x, int y) {
		assertEquals(x,y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testPut() {
		MapADT<String, Integer> abc = new JavaMap<>();
		abc.put("a", 1);
		abc.put("b", 2);
		abc.put("c", 3);
		assertEquals(abc.size(), 3);
	}
	
	@Test
	public void testGet() {
		MapADT<String, Integer> a = new JavaMap<>();
		a.put("a", 1);
		assertIntEq(a.get("a"), 1);
	}
	
	@Test
	public void testRemove() {
		MapADT<String, Integer> noA = new JavaMap<>();
		noA.put("a", 1);
		noA.remove("a");
		assertEquals(noA.size(), 0);
	}
	
	@Test
	public void testGetKeys() {
		//TODO: figure your shit out
		MapADT<String, Integer> abc = new JavaMap<>();
		abc.put("a", 1);
		abc.put("b", 2);
		abc.put("c", 3);
		assertEquals(abc.getKeys().size(), 3);
	}
	
}

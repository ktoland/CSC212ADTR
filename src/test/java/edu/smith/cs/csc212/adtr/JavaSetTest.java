package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testInsert() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("a");
		abc.insert("b");
		abc.insert("c");
		assertEquals(abc.size(), 3);
	}
	
	@Test
	public void testInsertRepeated() {
		SetADT<String> aaa = new JavaSet<>();
		aaa.insert("a");
		aaa.insert("a");
		aaa.insert("a");
		assertEquals(aaa.size(), 1);
	}
	
	@Test
	public void testSize() {
		SetADT<String> two = new JavaSet<>();
		two.insert("x");
		two.insert("y");
		assertEquals(two.size(), 2);
	}
	
	@Test
	public void testContains() {
		SetADT<String> hasA = new JavaSet<>();
		hasA.insert("c");
		hasA.insert("b");
		hasA.insert("a");
		assertTrue(hasA.contains("a"));
 	}
	
	@Test
	public void testNotContains() {
		SetADT<String> noD = new JavaSet<>();
		noD.insert("c");
		noD.insert("b");
		noD.insert("a");
		assertFalse(noD.contains("d"));
	}
	
	@Test
	public void testRemove() {
		SetADT<String> noA = new JavaSet<>();
		noA.insert("a");
		noA.insert("b");
		noA.remove("a");
		assertFalse(noA.contains("a"));
	}

}

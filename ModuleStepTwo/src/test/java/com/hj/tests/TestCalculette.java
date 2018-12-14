package com.hj.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hj.util.Calculette;

public class TestCalculette {
	
	Calculette c=new Calculette(70,2);

	@Test
	public void testSomme() {
		assertTrue(c.somme()==72);
	}

	@Test
	public void testDifference() {
		assertTrue(c.difference()==68);
	}

	@Test
	public void testDiv() {
		assertTrue(c.div()==35);
	}

	@Test
	public void testMulti() {
		assertTrue(c.multi()==140);
	}

}

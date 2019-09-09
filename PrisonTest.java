package cs146F19.Do.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrisonTest {

	Prison prison;
	
	@Test
	void test() {	
		double start = System.currentTimeMillis();
		prison = new Prison();
		
		assertTrue(prison.isEmpty());
		assertEquals(0, prison.getSize());
		prison.insertPrisoner(6);
		assertFalse(prison.isEmpty());
		assertEquals(1, prison.getFreePrisoner(2));
		assertEquals(1, prison.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start) + " milliseconds");
	}
	
	
	@Test
	void test2() {
		double start2 = System.currentTimeMillis();
		Prison prison = new Prison();
		
		assertTrue(prison.isEmpty());
		assertEquals(0, prison.getSize());
		prison.insertPrisoner(1);
		assertFalse(prison.isEmpty());
		assertEquals(1, prison.getFreePrisoner(9));
		assertEquals(1, prison.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start2) + " milliseconds");
	}
	
	
	@Test 
	void test3() {
		double start3 = System.currentTimeMillis();
		Prison prison = new Prison();
		
		assertTrue(prison.isEmpty());
		assertEquals(0, prison.getSize());
		prison.insertPrisoner(7);
		assertFalse(prison.isEmpty());
		assertEquals(4, prison.getFreePrisoner(7));
		assertEquals(1, prison.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start3) + " milliseconds");
	}
	
	
	@Test
	void test4() {
		double start4 = System.currentTimeMillis();
		Prison prison = new Prison();
		
		assertTrue(prison.isEmpty());
		assertEquals(0, prison.getSize());
		prison.insertPrisoner(12);
		assertFalse(prison.isEmpty());
		assertEquals(2, prison.getFreePrisoner(8));
		assertEquals(1, prison.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start4) + " milliseconds");
	}
	
	
	@Test void test5() {
		double start5 = System.currentTimeMillis();
		Prison prison = new Prison();
		
		assertTrue(prison.isEmpty());
		assertEquals(0, prison.getSize());
		prison.insertPrisoner(5);
		assertFalse(prison.isEmpty());
		assertEquals(3, prison.getFreePrisoner(1));
		assertEquals(1, prison.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start5) + " milliseconds");
	}

}

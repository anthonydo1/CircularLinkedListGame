package cs146F19.Do.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test() {
		
		double start = System.currentTimeMillis();
		CircularLinkedList linkedlist = new CircularLinkedList();
		assertTrue(linkedlist.isEmpty());
		assertEquals(0, linkedlist.getSize());
		linkedlist.insert(6);
		assertFalse(linkedlist.isEmpty());
		assertEquals(1, linkedlist.getFreePrisoner(2));
		assertEquals(1, linkedlist.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start) + " milliseconds");
		
		double start2 = System.currentTimeMillis();
		CircularLinkedList linkedlist2 = new CircularLinkedList();
		assertTrue(linkedlist2.isEmpty());
		assertEquals(0, linkedlist2.getSize());
		linkedlist2.insert(1);
		assertFalse(linkedlist2.isEmpty());
		assertEquals(1, linkedlist2.getFreePrisoner(9));
		assertEquals(1, linkedlist2.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start2) + " milliseconds");
		
		double start3 = System.currentTimeMillis();
		CircularLinkedList linkedlist3 = new CircularLinkedList();
		assertTrue(linkedlist3.isEmpty());
		assertEquals(0, linkedlist3.getSize());
		linkedlist3.insert(7);
		assertFalse(linkedlist3.isEmpty());
		assertEquals(4, linkedlist3.getFreePrisoner(7));
		assertEquals(1, linkedlist3.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start3) + " milliseconds");
		
		double start4 = System.currentTimeMillis();
		CircularLinkedList linkedlist4 = new CircularLinkedList();
		assertTrue(linkedlist4.isEmpty());
		assertEquals(0, linkedlist4.getSize());
		linkedlist4.insert(12);
		assertFalse(linkedlist4.isEmpty());
		assertEquals(2, linkedlist4.getFreePrisoner(8));
		assertEquals(1, linkedlist4.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start4) + " milliseconds");
		
		double start5 = System.currentTimeMillis();
		CircularLinkedList linkedlist5 = new CircularLinkedList();
		assertTrue(linkedlist5.isEmpty());
		assertEquals(0, linkedlist5.getSize());
		linkedlist5.insert(5);
		assertFalse(linkedlist5.isEmpty());
		assertEquals(3, linkedlist5.getFreePrisoner(1));
		assertEquals(1, linkedlist5.getSize());
		System.out.println("Prisoner was freed in " + (System.currentTimeMillis() - start5) + " milliseconds");
		
	}

}

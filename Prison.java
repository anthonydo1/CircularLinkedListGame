package cs146F19.Do.project1;


/**
 * Creates a circular linked list of nodes to determine which position you
 * should stand in to win your freedom if there are n prisoners.
 * @author Anthony Do
 *
 */
public class Prison {
	
	private CircularLinkedList list;
	
	
	/**
	 * Constructs a Prison object with a new CircularLinkedList.
	 */
	public Prison() {
		list = new CircularLinkedList();
	}
	
	
	/**
	 * Calculates and returns the prisoner to be freed.
	 * @param num The number of steps to go over before removing a prisoner.
	 * @return Returns the free prisoner.
	 */
	public Object getFreePrisoner(int num) {
		System.out.println("\nFreeing prisoner...");
		list.printCircularLinkedList();
		Node current = list.getHead();

		while (list.getSize() != 1) {
			for (int i = 0; i < num; i++) {
				current = current.getNext();
			}
			Node temp = current.getNext();
			list.remove(current);
			current = temp;
			
			list.printCircularLinkedList();
		}
		
		System.out.println("Prisoner " + list.getHead().getData() + " was granted freedom.");
		return list.getHead().getData();
	}
	
	
	/**
	 * Inserts n number of nodes into the CircularLinkedList.
	 * @param num The number of nodes to be inserted.
	 */
	public void insertPrisoner(int num) {
		if (num <= 0) num = 1;
		
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
	}
	
	
	/**
	 * Returns whether or not Prison is empty.
	 * @return True/False
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	
	/**
	 * Returns the size of the Prison.
	 * @return The size of the Prison.
	 */
	public int getSize() {
		return list.getSize();
	}
}

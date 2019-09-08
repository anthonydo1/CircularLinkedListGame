package cs146F19.Do.project1;


public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	private int count;
	
	
	/**
	 * Constructs a CircularLinkedList with n number of "prisoners" (nodes).
	 * @param num The number of "prisoners" (nodes) to add to the CircularLinkedList.
	 */
	public CircularLinkedList(int num) {
		if (num <= 0) num = 1;
		
		for (int i = 1; i <= num; i++) {
			this.add(i);
		}
		
		tail.setNext(head);
		head.setPrev(tail);
	}
	
	
	/**
	 * Calculates and returns the prisoner to be freed.
	 * @param num The number of steps to go over before removing a prisoner.
	 * @return Returns the free prisoner.
	 */
	public Object getFreePrisoner(int num) {
		System.out.println("Freeing prisoner...");
		this.printCircularLinkedList();
		Node current = head;

		while (count != 1) {
			for (int i = 0; i < num; i++) {
				current = current.getNext();
			}
			Node temp = current.getNext();
			this.remove(current);
			current = temp;
			
			this.printCircularLinkedList();
		}
		
		return head.getData();
	}
	
	
	/**
	 * Adds a node to the "tail" of the CircularLinkedList.
	 * @param data Data of the Node being created.
	 */
	private void add(int data) {
		Node node = new Node(data);
		
		if (head == null) {
			head = node;
			tail = node;
			node.setNext(node);
			node.setPrev(node);
		} else {
			node.setPrev(tail);
			node.setNext(head);
			tail.setNext(node);
			tail = node;
		}
		
		count++;
	}
	
	
	/**
	 * Removes the Node specified in the CircularLinkedList.
	 * @param node The node to be removed.
	 */
	private void remove(Node node) {
		if (node == head && head.getNext() == head) {
			head = null;
			tail = null;
		} else if (node == head) {
			head.getNext().setPrev(tail);
			head = head.getNext();
			tail.setNext(head);
		} else if (node == tail) {
			tail.getPrev().setNext(head);
			tail = tail.getPrev();
			head.setPrev(tail);
		} else {
			node.getPrev().setNext(node.getNext());
			node.getNext().setPrev(node.getPrev());
		}
		
		count--;
	}
	
	
	
	/**
	 * Prints the CircularLinkedList in output.
	 */
	public void printCircularLinkedList() {
		Node current = head;
		for (int i = 0; i < count; i++) {
			System.out.print(" " + current.getData() + " ->");
			current = current.getNext();
		}
		System.out.print("\n");
	}
	
	
	public static void main(String[] args) {
		CircularLinkedList linkedlist = new CircularLinkedList(6);
		System.out.println("\nPrisoner " + linkedlist.getFreePrisoner(2) + " is granted freedom. Expected: 1 \n");
		System.out.println("-------------------------------------------------");
		
		CircularLinkedList linkedlist2 = new CircularLinkedList(1);
		System.out.println("\nPrisoner " + linkedlist2.getFreePrisoner(9) + " is granted freedom. Expected: 1 \n");
		System.out.println("-------------------------------------------------");
		
		CircularLinkedList linkedlist3 = new CircularLinkedList(7);
		System.out.println("\nPrisoner " + linkedlist3.getFreePrisoner(7) + " is granted freedom. Expected: 4 \n");
		System.out.println("-------------------------------------------------");
		
		CircularLinkedList linkedlist4 = new CircularLinkedList(12);
		System.out.println("\nPrisoner " + linkedlist4.getFreePrisoner(8) + " is granted freedom. Expected: 2 \n");
		System.out.println("-------------------------------------------------");
		
		CircularLinkedList linkedlist5 = new CircularLinkedList(5);
		System.out.println("\nPrisoner " + linkedlist5.getFreePrisoner(1) + " is granted freedom. Expected: 3 \n");
		System.out.println("-------------------------------------------------");
	}
	
}

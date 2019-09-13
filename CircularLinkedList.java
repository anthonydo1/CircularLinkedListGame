package cs146F19.Do.project1;


/**
 * Creates a Circular Linked List.
 * @author Anthony Do
 *
 */
public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	
	/**
	 * Constructs an empty LinkedList.
	 */
	public CircularLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	
	/**
	 * Adds a node to the "tail" of the CircularLinkedList.
	 * @param data Data of the Node being created.
	 */
	public void add(int data) {
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
			head.setPrev(node);
		}
		
		size++;
	}
	
	
	/**
	 * Removes the Node specified in the CircularLinkedList.
	 * @param node The node to be removed.
	 */
	public void remove(Node node) {
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
		
		size--;
	}
	
	
	/**
	 * Returns the head of the CircularLinkedList.
	 * @return The head.
	 */
	public Node getHead() {
		return head;
	}
	
	
	/**
	 * Returns the tail of the CircularLinkedList.
	 * @return The tail.
	 */
	public Node getTail() {
		return tail;
	}
	
	
	/**
	 * Returns the size of the CircularLinkedList.
	 * @return size The size of the CircularLinkedList.
	 */
	public int getSize() {
		return size;
	}
	
	
	/**
	 * Checks if the current CircularLinkedList is empty and return true/false.
	 * @return True or False depending on if list is empty.
	 */
	public boolean isEmpty() {
		if (head != null && size > 0) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * Prints the CircularLinkedList in output.
	 */
	public void printCircularLinkedList() {
		Node current = head;
		for (int i = 0; i < size; i++) {
			System.out.print(" " + current.getData() + " ->");
			current = current.getNext();
		}
		System.out.print("\n");
	}
	
}

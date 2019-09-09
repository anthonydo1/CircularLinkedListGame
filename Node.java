package cs146F19.Do.project1;


/**
 * Models a node.
 * @author Anthony Do
 *
 */
public class Node {
	 
	private int data;
	private Node prev;
	private Node next;
		
	
	/**
	 * Constructs a Node object and sets the data.
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	
	/**
	 * Returns the data.
	 * @return The data.
	 */
	public Object getData() {
		return this.data;
	}
	
	
	/**
	 * Sets the next variable to node.
	 * @param node The node to be set.
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
	
	/**
	 * Sets the prev variable to node.
	 * @param node The node to be set.
	 */
	public void setPrev(Node node) {
		this.prev = node;
	}
	
	
	/**
	 * Returns the next node.
	 * @return The next node.
	 */
	public Node getNext() {
		return next;
	}
	
	
	/**
	 * Returns the previous node.
	 * @return The prev node.
	 */
	public Node getPrev() {
		return prev;
	}
	
}

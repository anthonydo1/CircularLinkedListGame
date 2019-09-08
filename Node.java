package cs146F19.Do.project1;


public class Node {
	 
	private int data;
	private Node prev;
	private Node next;
		
	
	public Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	
	public Object getData() {
		return this.data;
	}
	
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	
	public void setPrev(Node node) {
		this.prev = node;
	}
	
	
	public Node getNext() {
		return next;
	}
	
	
	public Node getPrev() {
		return prev;
	}
	
}

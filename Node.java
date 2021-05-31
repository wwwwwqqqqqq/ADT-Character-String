/**
 * A Node class
 * @author Qin Weiwei
 * @version 1.0
 */
public class Node {
	/**
	 * The element of this node
	 */
	private Object item;
	
	/**
	 * The link to previous node
	 */
	private Node previous;
	
	/**
	 * The link to next node
	 */
	private Node next;

	/**
	 * Constructs a default node.
	 */
	public Node() {
		this(null, null, null);
	} 
	
	/**
	 * Constructs a node with an element and link to a null node.
	 * @param data A reference to this element of this node
	 */
	public Node(Object data) {
		this(data, null, null);
	}  
	
	/**
	 * Constructs a node with an element and a link to next node.
	 * @param data A reference to this element of this node
	 * @param previous The previous reference of this code
	 * @param next The next reference of this node
	 */
	public Node(Object data, Node previous, Node next) {
		this.item = data;
		this.previous = previous;
		this.next = next;
    }
	
	/**
	 * Returns the element of this node.
	 * @return The element of this node
	 */
	public Object getItem() {
		return this.item;
	}
	
	/**
	 * Changes the element of this node.
	 * @param data A reference to an element
	 */
	public void setItem(Object data) {
		this.item = data;
	}
	
	/**
	 * Returns the next reference of this node.
	 * @return A reference to the next node of this node
	 */
	public Node getNext() {
		return this.next;
	}
	
	/**
	 * Changes the next reference of this node
	 * @param node A reference to the next node of this node
	 */
	public void setNext(Node node) {
		this.next = node;
	}  
	
	/**
	 * Returns the previous reference of this node.
	 * @return A reference to the previous node of this node
	 */
	public Node getPrevious() {
		return this.previous;
	}
	
	/**
	 * Changes the previous reference of this node
	 * @param node A reference to the previous node of this node
	 */
	public void setPrevious(Node node) {
		this.previous = node;
	}  
	
	/**
	 * Returns a string representation of this node.
	 * @return A string representation of this node
	 */
	public String toString(){
		return " " + this.item;
	}
}

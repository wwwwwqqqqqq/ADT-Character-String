import java.io.FileNotFoundException;
import java.lang.NullPointerException;
/**
 * Implementation for operations of LinkedString.
 * @author Qin Weiwei
 * @version 1.0
 */

public class LinkedString implements LinkedStringInterface{
	//The number of the node of the linked list
	private int count;
	//The preference to point the assigned place of the list
	private Node head;
	
	/**
	 * Create an empty LinkedString instance.
	 */
	public LinkedString(){
		this.count = 0;
		this.head = null;
	}
	
	/**
	 * Create a LinkedString instance containing a sequence of characters.
	 * @param data A char array to store the characters from the list
	 */
	public LinkedString(char[] data){
		for(int i = 0;i < data.length;i ++) {
			add(data[i]);
		}
	}
	
	/**
	 * Create a LinkedString instance containing same sequence of characters as a String instance.
	 * @param data A string element to be stored in the array
	 */
	public LinkedString(String data){
		char[] a = data.toCharArray();
		for(int i = 0;i < a.length;i ++) {
			add(a[i]);
		}
	}
	
	/**
	 * Get the value at the specified index.
     * @param index An int specified index
     * @return A char value at the specified index
     * @throws IndexOutOfBoundsException If index is less than or equal to 0 or greater than count
	 */
	public char charAt(int index) throws IndexOutOfBoundsException {
		if(index <= 0 || index > count) {
			throw new IndexOutOfBoundsException("Out of bounds");
		}
		return (char)find(index).getItem();
	}
	
	/**
	 * Concatenate the specified linked character string to the end of this linked character string.
	 * @param a A LinkedString list to be concatenate
     * @return A LikedString concatenated by two LinkedString list
	 */
	public LinkedString concat(LinkedString a) {
		char[] newlist = new char[this.length() + a.length()];
		for(int i = 0;i < this.length();i ++) {
			newlist[i] = this.charAt(i + 1);
		}
		for(int j = 0;j < a.length();j ++) {
			newlist[this.length() + j] = a.charAt(j + 1);
		}
		LinkedString combine = new LinkedString(newlist);
		return combine;
	}
	
	/**
	 * Check the list whether empty or not.
	 * returns true if, and only if, length() is 0
	 * @return A boolean value when the list is empty or not
	 */
	public boolean isEmpty() {
		if (count == 0)
            return true;
        else
            return false;
	}
	
	/**
	 * Get the length of the list.
	 * return the length of this linked character string
	 * @return An int value at the specified index
	 */
	public int length() {
		return count;
	}
	
	/**
	 * Get a substring in the LinkedString list.
	 * return a new linked character string that is a substring of this linked character string
     * @param start An int index of the first item in the original string
     * @param end An int index of the last item in the original string
     * @return A substring from the original string
	 */
	public LinkedString substring(int start, int end) {
		char[] sub = new char[end - start + 1];
        for (int i = 0;i < sub.length;i ++){
        	sub[i] = (char)find(i + 1).getItem();
        }
        LinkedString substring = new LinkedString(sub);
        return substring;
	}
	
	/**
	 * Use a specified index to find a list
	 * @param index An int specified index
	 * @return A preference to point the assigned place of the list
	 * @throws IndexOutOfBoundsException
	 */
	public Node find(int index) throws IndexOutOfBoundsException{
		if (index <= 0 || index > count){
            throw new IndexOutOfBoundsException("out of bounds");
        }else {
            Node current = head;
            for (int m = 0; m < index - 1; m ++) {
                current = current.getNext();
            }
            /*int position = 0;
            while(position != index){
            	position ++;
                current = current.getNext();
            }*/
            return current;
        }
	}

	/**
	 * Add specified index at the end of the list.
	 * @param item A char element to set the item of the Node()
	 */
	public void add(char item) {
		if(count == 0) {
			this.head = new Node(item,null,null);
			count = count + 1;
		}else {
			Node newadd = new Node(item,null,find(count));
			find(count).setNext(newadd);
			count = count + 1;
		}
	}
	
	/**
     * Display a string list.
	 */
	public void displayString() {
		Node current = this.head;
		for(int i = 0;i < this.length();i ++) {
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
}


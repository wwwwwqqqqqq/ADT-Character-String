/**
 * Specifications on the design of LinkedString operations. 
 * @author Qin Weiwei
 * @version 1.0
 */
public interface LinkedStringInterface {
	/**
	 * Get the value at the specified index.
     * @param index An int specified index
     * @return A char value at the specified index
     * @throws IndexOutOfBoundsException If index is less than or equal to 0 or greater than count
	 */
	public char charAt(int index) throws IndexOutOfBoundsException;
	
	/**
	 * Concatenate the specified linked character string to the end of this linked character string.
	 * @param a A LinkedString list to be concatenate
     * @return A LikedString concatenated by two LinkedString list
	 */
	public LinkedString concat(LinkedString a);
	
	/**
	 * Check the list whether empty or not.
	 * returns true if, and only if, length() is 0
	 * @return A boolean value when the list is empty or not
	 */
	public boolean isEmpty();
	
	/**
	 * Get the length of the list.
	 * return the length of this linked character string
	 * @return An int value at the specified index
	 */
	public int length();
	
	/**
	 * Get a substring in the LinkedString list.
	 * return a new linked character string that is a substring of this linked character string
     * @param start An int index of the first item in the original string
     * @param end An int index of the last item in the original string
     * @return A substring from the original string
	 */
	public LinkedString substring(int start, int end);
	
}
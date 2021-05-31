import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A helper class.
 * @author Qin Weiwei
 * @version 1.0
 */
public class LinkedStringUtility {
	/**
	* Creates a list of LinkedString objects and operates on them. 
	*/
	public static void start()throws FileNotFoundException{
        try{
        	/**
        	* Create an array list of LinkesString objects using testing data 
        	* stored in a text file.
        	*/
        	//ArrayList<LinkedString> stringList = new ArrayList<LinkedString>();
        	ArrayList<LinkedString> stringList = createList();
        	
        	/**
        	 * Check emptiness of all linked strings.
        	 */
            System.out.println("The list is empty: "+stringList.isEmpty());
            System.out.println("");
            System.out.println("-------------------------------------");
            
            /**
             * Display all linked strings in the array list.
             */
    		System.out.println("Display all linked strings:");
        	displayList(stringList);
        	System.out.println("");
            System.out.println("-------------------------------------");

           /**
            * Retrieve the last character or mid character of each LinkedString object from the array list
            * display them.
            */
            for(int i = 0;i < stringList.size();i ++) {
            	Node mid;
            	Node last;
    			LinkedString precurrent = stringList.get(i);
    			int num1 = (stringList.get(i).length() / 2) + 1;
    			mid = precurrent.find(num1);
    			int num2 = stringList.get(i).length() - 1;
    			last = precurrent.find(num2);
            	System.out.println("The middle character in line" + (i + 1)+" is " + mid);
	            System.out.print("The last character in line" + (i + 1) + " is : " + last);
	            System.out.println();
	            System.out.println("-------------------------------------");
            }
            
            /**
             * Display all linked strings in the array list again to make sure that all objects are not changed.
             */
            System.out.println("Display all linked strings in the array list again:");
            displayList(stringList);
            System.out.println();
            System.out.println("-------------------------------------");
            
			/**
			 * Concatenate a linked string with next linked string
			 * and display the concatenated string
			 * repeat for the entire array list. 
			 */
            System.out.println("After combining line2 and line3,the linked string is:");
            LinkedString combine = stringList.get(1).concat(stringList.get(2));
            combine.displayString();
            System.out.println("-------------------------------------");
            
            /**
             * Display all linked strings in the array list again to make sure that all objects are not changed.
             */
            System.out.println("Display all linked strings in the array list again:");
            displayList(stringList);
            System.out.println();
            System.out.println("-------------------------------------");

            /**
             * Get sub strings and display both substrings and original strings.
             */
            System.out.println("Get index 0 to 2 substring list of line2 is: ");
            stringList.get(1).substring(0,2).displayString();
            System.out.println();
            System.out.println("The original string of line2 is:");
            stringList.get(1).displayString();
            System.out.println();
            System.out.println("-------------------------------------");
            
            /**
             * Get the length of second line.
             */
            System.out.println("The length of line2 is: ");
            System.out.println(stringList.get(1).length());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
	//The rest of the testing methods must be completed by yourself.
	}
	public static ArrayList<LinkedString> createList() throws FileNotFoundException{
		try{
			ArrayList<LinkedString> list = new ArrayList<LinkedString>();
			Scanner file = new Scanner(new File("Test.txt"));
			String a = null;
			while(file.hasNext()) {
				a = file.nextLine();
				LinkedString array = new LinkedString(a);
				list.add(array);
			}
			return list;
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void displayList(ArrayList<LinkedString> list) {
		System.out.println("There are " + list.size() + " members in the list.");
		System.out.println("-------------------------------------");
		for(int i = 0;i < list.size();i ++) {
			Node current;
			LinkedString precurrent = list.get(i);
			System.out.println("There are " + list.get(i).length() + " linked string in line" + (i + 1) + " of the list");
			System.out.println("There are the linked string: ");
			for(int j = 1;j <= precurrent.length();j ++) {
				current = precurrent.find(j);
				System.out.println((char)current.getItem());
			}
		}
	}
	}

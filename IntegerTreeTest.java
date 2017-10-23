// A class used to test the Integer tree

import java.util.Scanner;


public class IntegerTreeTest {

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		IntegerTree myTree = new IntegerTree();
		myTree.setMessages(true);
		
		System.out.print("Enter an integer to add to the tree (0 to quit): ");
		int n = keyboard.nextInt();
		
		while (n != 0)
		{
			myTree.add(new Integer(n));
			
			System.out.print("Enter an integer to add to the tree (0 to quit): ");
			n = keyboard.nextInt();
		}
		
		// System.out.println("\n\n" + myTree);
		keyboard.close();
	}
	
}

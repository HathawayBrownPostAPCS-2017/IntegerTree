
//Implements a BST with IntegerTreeNode nodes

public class IntegerTree

{
private IntegerTreeNode root;  // holds the root of this BST
private boolean messagesOn;    // whether to write messages while traversing

// Constructor: creates an empty BST.
public IntegerTree()
{
 root = null;
 messagesOn = false;
}

/** Turn on or or the message printing  */
public void setMessages (boolean msg)
{  messagesOn = msg;  }

/** Searches for the Integer value in the binary search tree.
 *  
 * @param value Integer to search for
 * @return whether value is found in the tree.
 */
public boolean contains(Integer value)
{
 return contains(root, value);
}

/** Adds the Integer value to the binary search tree, if it is not already there.
 * 
 * @param value Integer to add to the tree
 * @return false if the Integer value is already in the tree; true if it was added.
 */
public boolean add (Integer value)
{
	if (contains(value))
		   return false;
	root = add(root, value);
	return true;
}


// Recursive method to search for the Integer value
private boolean contains (IntegerTreeNode node, Integer value)
{
	if (node == null) 	{  return false; }
	else
	{
		int diff = value.compareTo(node.getValue());
		if (diff == 0)  { return true; }
		else if (diff < 0)
		{
			return contains (node.getLeft(), value);
		}
		else   // diff > 0
		{
			return contains (node.getRight(), value);
		}
	}
}

// Adds value to this BST, 
// Returns the root of the new tree
//
// Precondition: the tree rooted at node does not contain the Integer value
private IntegerTreeNode add(IntegerTreeNode node, Integer value)
{
	return null;
}


/** returns the tree as a String.
 * Order is dependent on the ordering scheme of toString (IntegerTreeNode)
 */
public String toString()
{
	return "[" + toString(root) + "]"; 
}

// Returns a subtree as a String in ______ order
private String toString (IntegerTreeNode node)
{
	if (node == null)  { return ""; } 
	else 
	{
		return node.getValue() + " ";
	}
}


} // End of IntegerTree
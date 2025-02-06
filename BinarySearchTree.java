/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;


/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 4
 * BinarySearchTree.java
 * @author Ntokozo
 */

public class BinarySearchTree 
{
    /* attributes */
    private BinaryNode root;
    private int size;
    
    /* constructor */
    public BinarySearchTree()
    {
        root = null;
    }
    
    /* getter methods for attributes */
    public int getSize()
    {
        return size;
    }
    public BinaryNode getRoot()
    {
        return root;
    }
    
    /* methods from Practical 3 (Phase 2) */
    
    public void insert(String theType, String theTitle, int theReleaseYear)
    {
        // copy your code from Practical 3 here
        BinaryNode[] bN = new BinaryNode[size];
        //bN = bN[theType, theTitle, theReleaseYear];
    }
    
    public void remove(BinaryNode arr[], String title)
    {
        // copy your code from Practical 3 here
        int n = arr.length;
        
        for(int i = 0; i<n-1; i++)
        {
            if(arr[i].equals(title))
            {
                arr[i] = arr[i+1];
            }
        }
    }
    
    public BinaryNode find(BinaryNode arr[], String x)
    {
        // copy your code from Practical 3 here
        int n = arr.length;
        
        for (int i=0; i<n; i++) 
        {
            if (arr[i].getTitle().equalsIgnoreCase(x))
            {
                return arr[i];
            }
        }
        return arr[-1];
    }
   
    
    public void printInOrder(BinaryNode t)
    {
       // copy your code from Practical 3 here
        
    }
   
    /* methods from Practical 4 (Phase 3) */
    

    int findMax(int a, int b)
    {
        if(a >= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public int height(BinaryNode t) // [ 2 marks ]
    {
        //the code below finds the height of the bst tree
        if(t == null)
        {
            return 0;
        }
        
        //returning the height of the bst tree
        return findMax(height(t.getLeft()), height(t.getRight()) + 1);
    }
    
    public boolean isFull(BinaryNode t) // [ 2 marks ]
    {
        //if empty tree
        if(t == null)
        {
            return true;
        }
          
        //if leaf nodes are empty
        if(t.getLeft() == null && t.getRight() == null )
        {
            return true;
        }
        
        // if both left and right subtrees are not null
        // the bst are full
        if((t.getLeft()!=null) && (t.getRight()!=null))
        {
            return (isFull(t.getLeft()) && isFull(t.getRight()));
        }  
        // if none work
        return false;
    }
    
    public boolean isAVLTree(BinaryNode t) // [ 2 marks]
    {
        //code to check if bst is a avl tree
        int lH; // for height of left subtree
        int rH; // for height of right subtree
 
        if (t == null)
        {
            return true;
        }
 
        lH = height(t.getLeft());
        rH = height(t.getRight());
        
        //checking if the left and right height are greater than 1
        if(Math.abs(lH - rH) <= 1 && isAVLTree(t.getLeft()) && isAVLTree(t.getRight()))
        {
            //returning boolean value true if above requirements are met
            return true;
        }

        return false;
    }
    
    
    /* auxiliary methods: you may use the below methods to help you write your code, if necessary */
    public void makeEmpty()
    {
        root = null;
    }
    
    public Boolean isEmpty()
    {
        return root==null;
    }

    private BinaryNode elementAt(BinaryNode t)
    {
        return t == null ? null : t;
    }
}

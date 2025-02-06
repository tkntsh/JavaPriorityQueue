/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 4
 * BinarySearchTreeTester.java
 * @author Ntokozo
 */

public class BinarySearchTreeTester 
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        
        try
        {
            // you may modify the filepath, but not the filename
            File file = new File("C:\\Users\\27614\\Desktop\\TK - learning\\UWC\\3yr bsc com\\2nd year\\CSC211 S1\\pracs\\Template Files for Practical4\\Template Files for Practical4\\netflix_titles_alternative.csv");
            
            Scanner token = new Scanner(file);
            token.nextLine();                       
            while(token.hasNext())                  
            {
              String line = token.nextLine();              
              String tmp[] = line.split(";"); 
              String type = tmp[0];
              String title = tmp[1];
              int releaseYear = Integer.parseInt(tmp[2]);
              bst.insert(type, title, releaseYear);
             }
             token.close();
        }
            
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
      
        /* driver program to test your code: do not modify below*/ 
        System.out.println("What is the height of the BST?"); 
        System.out.println("" + bst.height(bst.getRoot())); // [1 mark if output is correct]
        System.out.println();
        System.out.println("Is the BST an AVL tree?");
        System.out.println(bst.isAVLTree(bst.getRoot())); // [1 mark if output is correct]
        System.out.println();
        System.out.println("Is the BST full?");
        System.out.println(bst.isFull(bst.getRoot())); // [1 mark if output is correct]
        System.out.println();
        System.out.println("In-order traversal of BST:");
        System.out.println();
        bst.printInOrder(bst.getRoot());     // [1 mark if output is correct]
        System.out.println();
        System.out.println("-----end of program-----");
    }
}

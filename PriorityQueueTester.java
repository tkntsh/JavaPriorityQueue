/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 4
 * PriorityQueueTester.java
 * @author Ntokozo
 */

public class PriorityQueueTester 
{
    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue();
    
        try
        {
            File file = new File("netflix_titles_short.csv");
            
            Scanner token = new Scanner(file);
            token.nextLine();                       
            while(token.hasNext())                  
            {
                String line = token.nextLine();              

                String tmp[] = line.split(";"); 
              
                String type = tmp[0];
                String title = tmp[1];
                int releaseYear = Integer.parseInt(tmp[2]);
                int rating = Integer.parseInt(tmp[3]);
              
                PriorityQueueNode node = new PriorityQueueNode(type, title, releaseYear, rating);
                pq.add(node);             
             }
             token.close();
                     
        }
            
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
         
        /* driver program to test your code: do not modify below*/        
        System.out.println("What is the size of the PQ?");
        System.out.println(pq.getSize()); // [ 1 mark if output is correct ]
        System.out.println();
        System.out.println("Formatted tree-representation of the PQ: ");
        System.out.println();
        pq.display(); // [ 1 mark if output is correct ]
        System.out.println();
        System.out.println("-----end of program-----");
    }
}

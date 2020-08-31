/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSortTest;

import java.util.Scanner;

/**
 *
 * @author shrey
 */
public class JavaSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int[] a = {9,14,3,2,43,11,58,22,80,98,14,55,62};        
         int flag = 5;
                 while (flag!=0)
                 {
                     System.out.println("Select 1,2,3,4 or 5 for insertion, bubble, shell,merge or quick sort respectively, enter 0 to exit:" );
                     flag = scan.nextInt();
                     switch(flag){
                         case 1:
                             JavaSort.insertionSort(a);
                             break;
                         case 2:
                             JavaSort.bubbleSort(a);
                             break;
                         case 3:
                             JavaSort.shellsort(a);
                             break;
                         case 4:
                             JavaSort.mergeSort(a);
                             break;
                         case 5:
                             JavaSort.quicksort(a); 
                             break;
                     } 
                     printArray(a);
                   }
                 
                        
                        
                    
                             
         }
    
               
                 
               public static void printArray(int a[])
                    {
                        int n = a.length;
                        for (int i=0; i<n; ++i)
                          System.out.print(a[i] + " {  } ");
                          System.out.println();
                    }
                     
                 }
    

    

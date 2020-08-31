/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSortTest;

/**
 *
 * @author shrey
 */
public class JavaSort {
    
 /** 
   * Simple insertion sort 
   */ 
    public static void insertionSort( int [ ] a )
 { 
        for( int p = 1; p < a.length; p++ )       
           { 
              int tmp = a[ p ]; 
                        
              for(int j=p ; j > 0 && tmp< a[ j - 1 ] ; j-- ) {
                  
               a[ j ] = a[ j - 1 ];           
               a[ j ] = tmp; 
              }
       } 
 }
  public static void bubbleSort(int [] a)
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    // swap temp and arr[i]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
 /** 
   * Shellsort, using a sequence suggested by Gonnet. 
   */ 
    public static void shellsort( int [ ] a ) 
   { 
      for( int gap = a.length / 2; gap > 0; gap = gap == 2 ? 1 : (int) ( gap / 2.2 ) )
            for( int i = gap; i < a.length; i++ ) 
           { 
              int tmp = a[ i ]; 
                

               for( int j = i; j >= gap && tmp< a[j-gap]; j -= gap ) {
                   a[ j ] = a[ j - gap ]; 
                   a[ j ] = tmp; 
            }
          } 
  }
 /** 
   * Mergesort algorithm. 
   * @param a an array of Comparable items. 
   */ 
    public static void mergeSort( int [ ] a ) 
    {
        int [ ] tmpArray; 
        tmpArray =  new int [ a.length ];
        mergeSort( a, tmpArray, 0, a.length - 1 ); 
    }
    /**
      * Internal method that makes recursive calls. 
      * @param a an array of Comparable items. 
      * @param tmpArray an array to place the merged result. 
      * @param left the left-most index of the subarray. 
      * @param right the right-most index of the subarray. 
      */ 
    private static void mergeSort( int [ ] a, int [ ] tmpArray,int left, int right ) 
    { 
        if( left < right ) 
        { 
            int center = ( left + right ) / 2; 
            mergeSort( a, tmpArray, left, center ); 
            mergeSort( a, tmpArray, center + 1, right ); 
            merge( a, tmpArray, left, center + 1, right );
        } 
 }
     private static void merge( int [ ] a, int [ ] tmpArray, int leftPos, int rightPos, int rightEnd ) 
    { 
        int leftEnd = rightPos - 1; 
        int tmpPos = leftPos; 
        int numElements = rightEnd - leftPos + 1; 
        // Main loop 
        while( leftPos <= leftEnd && rightPos <= rightEnd ) 
          if( a[ leftPos ]<=a[ rightPos ] ) 
              tmpArray[ tmpPos++ ] = a[ leftPos++ ]; 
            else 
                tmpArray[ tmpPos++ ] = a[ rightPos++ ]; 

        while( leftPos <= leftEnd )    // Copy rest of first half 
            tmpArray[ tmpPos++ ] = a[ leftPos++ ]; 

        while( rightPos <= rightEnd )  // Copy rest of right half 
            tmpArray[ tmpPos++ ] = a[ rightPos++ ]; 

        // Copy tmpArray back 
        for( int i = 0; i < numElements; i++, rightEnd-- ) 
            a[ rightEnd ] = tmpArray[ rightEnd ]; 
 }
 /** 
   * Quicksort algorithm (driver) 
   */ 
    public static void quicksort( int [ ] a ) 
    { 
        quicksort( a, 0, a.length - 1 ); 
     } 

    /** 
      * Internal quicksort method that makes recursive calls. 
      * Uses median-of-three partitioning and a cutoff. 
      */ 
    @SuppressWarnings("empty-statement")
    public static void quicksort( int [ ] a, int low, int high ) 
    {
        if( low  < high ) 
        {      // Sort low, middle, high 
            int middle = ( low + high ) / 2;
            if( a[ middle ]< a[ low ] )
                swapReferences( a, low, middle ); 
            if( a[ high ]< a[ low ]  ) 
                swapReferences( a, low, high ); 
            if( a[ high ]< a[ middle ] )
                swapReferences( a, middle, high ); 
                // Place pivot at position high - 1            
               swapReferences( a, middle, high - 1 ); 
               int pivot = a[ high - 1 ]; 
                // Begin partitioning 
                int i, j; 
            for( i = low, j = high - 1; ; )
            { 
                while( a[ i ]< pivot ) 
                   ++i  ; 
                while( pivot< a[ --j ] )
                    ; 
                if( i >= j ) 
                    break; 
                swapReferences( a, i, j ); 
            } 
                // Restore pivot 
             swapReferences( a, i, high - 1 ); 

            quicksort( a, low, i - 1 );    // Sort small elements             
            quicksort( a, i + 1, high );   // Sort large elements 
        } 
    }
    private static void swapReferences (int [] a ,int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j]= tmp;
    }

   
}

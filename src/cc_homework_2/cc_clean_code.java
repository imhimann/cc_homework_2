package cc_homework_2;

import java.util.Scanner;

public class cc_clean_code {

	  public static void main(String[] args){
	    
		Scanner n = new Scanner(System.in);
	    
	    while(true){
	    int[] array1 = {1,2,3,4,5,6,7,7,8,9,20,10};
	    for(int i = 0; i < array1.length; i++){
	     System.out.print(array1[i] + ", ");
	    }
	    System.out.println("\nSelect which method to run: " + 
	    				   "\n   a. Swap the first and last elements in the array." +
	                       "\n   b. Shift all elements by one to the right and move the last element into the first position." +
	                       "\n   c. Replace all even elements with 0." +
	                       "\n   d. Replace each element except the first and last by the larger of its two neighbors." );
	    char select = n.nextLine().charAt(0);

	    if( select == 'a')
	    swap(array1);
	    
	    else if( select == 'b')
	    shift(array1);
	    
	    else if ( select == 'c' )
	    replaceEven(array1);
	    
	    else if( select == 'd')
	    replaceMax(array1);
	    
	    else {
	    System.out.println("Invalid selection. Stopping program...");
	    break;
	    } 
	    
	    System.out.println("\n-------------\n");
	    }
	  } //main
	
	  
	  public static void swap(int[] x) {
	   int k, l;
	   k = x[0];                      
	   l = x[x.length-1];             
	   x[0] = l;                      
	   x[x.length-1] = k;
	   
	   for(int i = 0; i < x.length; i++){
	     System.out.print(x[i] + ", ");
	    }
	  }

	  
	  public static void shift(int[] x) {
	   int k = x[x.length-1];                   
	    for( int i = x.length-1; i > 0; i--){
	      x[i] = x[i-1];
	    }
	    x[0] = k;
	    
	    for(int i = 0; i < x.length; i++){
	     System.out.print(x[i] + ", ");
	    }
	  }

	  
	  public static void replaceEven(int[] x){
	    for(int i = 0; i < x.length; i++){
	     if(x[i] % 2 == 0)
	       x[i] = 0;
	    }
	    
	    for(int i = 0; i < x.length; i++){
	     System.out.print(x[i] + ", ");
	    }
	  }

	  
	  public static void replaceMax(int[] x) {
	   int[] r = new int[x.length];
	   r[0] = x[0];
	   r[r.length-1] = x[x.length-1];
	   
	   for(int i = 1; i < x.length-1; i++){
	     if(x[i-1] > x[i+1])                          
	       r[i] = x[i-1];
	     
	     else if( x[i-1] < x[i+1])                   
	       r[i] = x[i+1];
	   }
	   for(int i = 0; i < r.length; i++){
	     x[i] = r[i];
	     System.out.print(x[i] + ", ");
	    }  
	  }
}
	  


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set; 
  
class dynamic_solution 
{ 
	public static void main (String[] args)  
        { 
    		int denomination[] = {1,5,10,25}; 
        	int m = denomination.length; 
        	int C = 91; 
        	System.out.println ( "Minimum denomination required is " + minimumCoins(denomination, m, C)); 
    	} 
    
        static int minimumCoins(int denomination[], int m, int C) 
    	{
    	    int res_arr[] = new int[C + 1]; 
    	    res_arr[0] = 0; 
    	  
    	    for (int i = 1; i <= C; i++) 
    	    	res_arr[i] = Integer.MAX_VALUE; 
    	  
    	    for (int i = 1; i <= C; i++) 
    	    { 
    	    	for (int j = 0; j < m; j++) 
    	        if (denomination[j] <= i) 
    	        { 
    	    	    int sub_res = res_arr[i - denomination[j]]; 
    	            if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res_arr[i]) 
    	                       res_arr[i] = sub_res + 1; 
    	        } 
    	              
    	    } 
    	    return res_arr[C]; 
    	} 
}

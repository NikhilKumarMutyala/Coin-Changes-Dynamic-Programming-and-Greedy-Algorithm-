public class greedy_solution 
{
	static void findMin(int cost, int[] coins) 
	{ 
	    int coinlist[]=new int[20];
	    int i, k = 0; 
	    int count=0;
	  
	    for (i = 4 - 1; i >= 0; i--) 
	    { 
	    	while (cost >= coins[i]) 
		{ 
	            cost -= coins[i]; 
	            coinlist[k++] = coins[i]; 
	        } 
	    } 
	    
	    for (i = 0; i < k; i++) 
	    { 
	    	count++;
	       
	    }
	    System.out.println(count); 
	    
	    for (i = 0; i < k; i++) 
	    { 
	        System.out.println(coinlist[i]); 
	    } 
	} 

	public static void main(String[] args) 
	{
		int coins[] = { 1,5,10,25 }; 
		int n = 83; 
		  
 		System.out.println("The minimal no. of changes for "+n);
 
                findMin(n,coins); 
	}
}

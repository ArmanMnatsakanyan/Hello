import java.util.*;

public class Arman2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];

		Random rand = new Random();
		int i =0;
		int a =0;
		//int j=0;

		for ( i = 0; i < n; i++) {
			//for ( j = 0; j < n; j++)
				array[i] = rand.nextInt(10);

		}

		for ( i = 0; i < n; i++) {
			//for ( j = 0; j < n; j++) {
				System.out.print(array[i]);
				System.out.print(" ");

			}
			System.out.println();
		
	
	    int max = array[0];
	    
	    	for (i=0;i<n;i++){
	    		if (max < array[i]){
	    		
	    			max = array[i];
	    
	    a = i;
	    			
	    	}
	    	
	    		
	    		
	    		
	        		
	    }
	    
	    	
	    	System.out.print("Max: " + max + " " + a);
			System.out.print(" "); 	
	    
	}
		
		/*if (i)	
		for (i=0;i<n;i++){
			
			for (j=0;j<n;j++){
			
				if (min > array[i][j])}{
					i++;
					j++;
					
					
					System.out.print("min: array[i][j]");
				System.out.print(" ");*/
					
					
		
		}
		
			
			
			
		

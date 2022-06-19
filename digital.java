package program1;

public class digital {

	 void print(int [][] mat)

	   {    
	      for(int i = 0; i < 5; i++) {
	        for (int j = 0; j < 5; j++) {
	            if (i % 2 == 0) {
	                if (mat[i][j] == 1)
	                    System.out.print("-");
	                else
	                  System.out.print(" ");
	            }
	            else {
	                if (mat[i][j] == 1)
	                    System.out.print("|");
	                else
	                    System.out.print(" ");
	            }
	           
	        }
	        
	         System.out.println();
	        
	        
	    }
	   }
	void digit0()
	{
	   
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 0, 0, 0, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit1()
	{
	    
	    int[][] mat = { { 0, 0, 0, 0, 0 },
	                    { 0, 0, 1, 0, 0 },
	                    { 0, 0, 0, 0, 0 },
	                    { 0, 0, 1, 0, 0 },
	                    { 0, 0, 0, 0, 0 } };
	  print(mat);
	}
	void digit2()
	{
	   
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 0 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit3()
	{
	   
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit4()
	{
	    
	   int[][] mat = { { 0, 0, 0, 0, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 0, 0, 0, 0 } };
	   print(mat);
	}
	void digit5()
	{
	    
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 0 },
	                    { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit6()
	{
	    
	    
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 0 },
	                    { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit7()
	{
	    
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 0, 0, 0, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 0, 0, 0, 0 } };
	    print(mat);
	}
	void digit8()
	{
	    
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	void digit9()
	{
	    
	    int[][] mat = { { 0, 1, 0, 1, 0 },
	                    { 1, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 },
	                    { 0, 0, 0, 0, 1 },
	                    { 0, 1, 0, 1, 0 } };
	    print(mat);
	}
	 

	void checkDigit(int num)
	{
	    
	    if (num == 0)
	        digit0();
	 
	    
	    else if (num == 1)
	        digit1();
	 
	   
	    else if (num == 2)
	        digit2();
	 
	   
	    else if (num == 3)
	        digit3();
	 
	   
	    else if (num == 4)
	        digit4();
	 
	    
	    else if (num == 5)
	        digit5();
	 
	    
	    else if (num == 6)
	        digit6();
	 
	    
	    else if (num == 7)
	        digit7();
	 
	   
	    else if (num == 8)
	        digit8();
	 
	    
	    else if (num == 9)
	        digit9();
	}
	
}

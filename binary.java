package program1;

public class binary {

	 public int convertBinary(long num) {
	     int decimalNumber = 0, i = 0;
	     long remainder;
	    
	     while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	   }
	
}

package program1;

import java.util.Scanner;
public class Abdlrahman {

	public static void main(String[] args) {
	     binary b = new binary(); 
	     digital d=new digital();
	     Scanner input =new Scanner(System.in); 
	     System.out.println("Enter the binary number");
	     int num = input.nextInt();
	    
	  
	     int decimal=b.convertBinary(num);
	     System.out.println("The decimal number is :"+decimal);
	     int count=0;
	     int temp=decimal;
	     while(temp > 0){
	         
	            temp=temp/10;
	            count++;
	        }
	  
	     int arr[]=new int[count];
	     System.out.println("The digital number is : ");
	        int i=0;  

	         while(decimal > 0){
	         
	         arr[i]=decimal%10;
	         decimal=decimal/10;
	         i++;
	         
	     }
	     
	      for( i=count-1;i>=0;i--){
	        
	         d.checkDigit(arr[i]);
	         
	     }
	    }             
	    
	}


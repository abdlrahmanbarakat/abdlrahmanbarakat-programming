package abdlrahman;

public class Main {

	public static void goodMorning(String name, double x , double y )
	{
	System.out.println("Good morning "+ name +" ,university time, the time now is "+ x*y +" am");	
	}
	public static double goodEvening(double x, double y)
	{
	return x+y;
	}
	
	
	public static double programming(double x, double y, double z)
	{
		return x+y+z;
	}
	public static double  networking(double x, double  y, double z)
	{
		return x-y-z;
	}
	public static double english(double x, double y, double z)
	{
		return x*y*z;
	}
	
	public static double softskills(double x, double y, double z)
	{
		if (y==0)
		{
		 System.out.println("Try another numbers");
		 return 0.0;
		}
		else if (z==0)
		{
		 System.out.println("I am talking seriously try another numbers");
		 return 0.0;
		}
		else
			return x/y/z;
		
	}
	public static void main(String[] args) {
		
		String name;
	    name = "abdlrahman";
		
	    goodMorning( name ,2.5,3.5);
        
       
        char time = '+'; 
        switch (time)
        {
        case '+': System.out.println("It's programming lecture time "+ name +", the time now is "+ programming(1.5 ,5, 2.5) +" am"); break;
        case '-': System.out.println("It's networking lecture time "+ name +", the time now is "+ networking(13.5 , 1.5 ,1) +" am"); break;
        case '*': System.out.println("It's English lecture time "+ name +", the time now is "+ english(1.5 ,2, 0.5) +" pm"); break;
        case '/': System.out.println("It's soft skills lecture time "+ name +", the time now is "+ softskills(8.5,1,2) +" pm"); break;
        default:  System.out.println("does not accept, try again :( ");
        }
        
        System.out.println("Good evening "+ name +", finish university for today, the time now is "+ goodEvening(4,2.2) + " pm");        
        
	}


}
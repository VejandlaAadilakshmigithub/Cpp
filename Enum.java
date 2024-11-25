enum Month 
{
	JANUARY,FEBRUARY,MARCH 
} 
public class Enum
{
	enum Color { RED,BLUE,BLACK } 

     public static void main(String[] args) 
	{
		enum Week {SUNDAY, MONDAY, TUESDAY }
		
		System.out.println(Month.FEBRUARY);
		System.out.println(Color.RED);
		System.out.println(Week.SUNDAY);
	}
}
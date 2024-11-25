/* class Super 
{
	  private int x;
	  private int y;
	  
	    public Super(int x, int y) 
		{
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() 
		{
			return x;
		}

		public int getY() 
		{
			return y;
		}  
}

 class Sub extends Super  
{
   public Sub()
   {
	 super(100,200);
   }

   public void showData()
   {
	   System.out.println("x values is :"+getX());
	   System.out.println("y value is :"+getY());
   }
   
	  
}


public class SingleLevelDemo
{
	public static void main(String[] args) 
	{
		Sub s = new Sub();	
		s.showData();
	}

}*/
 class Parent 
{
   public void bike()
   {
	   System.out.println("Honda Bike");
   }
}


class Child extends Parent 
{
  public void car()
  {
	  System.out.println("Audi Car");
  }
}



public class SingleLevelDemo {

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.bike();
		c.car();

	}

}
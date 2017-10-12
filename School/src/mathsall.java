
public class mathsall {

	static int x = 9;
	static int y= 10;
	
	public static void  main(String[] args) {
		
		mathsall ma = new mathsall();
  int z=ma.add1();
  int z1=ma.sub();
  int z3=ma.mathsall();
  
  System.out.println("add" + z);
  System.out.println("sub" + z1);
  System.out.println("multi" + z3);
  

	}
		
		
	public  int add1()
	{
		return(x+y);
	}
		
		
	public int sub()
	{
		return (y-x);
		
	}

	int mathsall()
	{
		return(x*y);
	}
}

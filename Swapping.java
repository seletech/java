class Swapping 
{
	public static void main(String[] args) 
	{
		
		int x = 10;
		int y = 20;

		System.out.println("x = "+x+" & y = "+y);

		//swapping
    
    //with using temp variable
    int temp;
    temp = x;
    x = y;
    y = temp;
	
    
		//without using temp variable 
		y = x + y; // 10+20 = 30 y
		x = y -	x; // 30-10=20
		y = y - x; // 30-20 =10

		System.out.println("x = "+x+" & y = "+y);
	}
	
}

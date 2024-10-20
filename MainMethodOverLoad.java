class MainMethodOverLoad 
{
	public static void main(int a,int b) 
	{
		System.out.println(a+b);
	}
	public static void main(int a,double b) 
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		main(10,20);
		main(4,3.8);
	}
}

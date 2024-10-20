class Multiplication 
{
	public static void multiply(double a,double b)
	{
		System.out.println(a*b);
	}
	public static void multiply(double a,int b)
	{
		System.out.println(a*b);
	}
	public double multiply(int a,double b)
	{
		double c = a*b;
		return c;
	}
	public static void main(String[] args) 
	{
		multiply(3.6,6.7);
		multiply(4.8,3);
		Multiplication m = new Multiplication();
		System.out.println(m.multiply(2,3.3));
	}
}

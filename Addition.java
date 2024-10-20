class Addition 
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public double add(int a,double b)
	{
		double e=a+b;
		return e;
	}
	public double add(double a,double b,int c)
	{
		double d=a+b+c;
		return d;
	}
	public static void main(String[] args) 
	{
		Addition a = new Addition();
		System.out.println(a.add(10,20));
		System.out.println(a.add(10,6.8));
		System.out.println(a.add(5.6,8.7,30));
	}
}


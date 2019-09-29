class ArrayCopy{
	public static void main(String args[])
	{
		int a[]={32,45,76,89};
		int b[]=new int[4];
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		
		for(int j=0;j<b.length;j++)
			System.out.println("b["+j+"]="+b[j]);
	}
}

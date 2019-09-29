public class math2 {
	public static void main(String[] args) {
		int res1, res2, res3;
		int n1 = 12, n2 = 24, n3 = 16, n4 = 3;
		double d1, d2, d3, d4, d5, d6, d7;
		double v1 = 10.0, v2 = 3.1416;
		
		res1 = n1 / n4;
		d1 = n1 / n4;
		res2 = n3 / n4;
		d2 = n3 / n4;
		d3 = v1 / n4;
		d4 = v1 / v2;
		res3 = n1 / n2;
		d5 = (double)n1 / n2;
		d6 = n1 / (double)n2;
		d7 = (double)(n1/n2);
		
	    System.out.println("res1:"+res1);
		System.out.println("d1:"+d1);
		System.out.println("res2:"+res2);
		System.out.println("d1:"+d2);
		System.out.println("d1:"+d3);
		System.out.println("d1:"+d4);
		System.out.println("res3:"+res3);
		System.out.println("d1:"+d5);
		System.out.println("d1:"+d6);
		System.out.println("d1:"+d7);
	}
}

public class Wrapper {

	public static void main(String[] args) {
		
	String x="100";
	System.out.println(x+20);	
//String to integer
	int i = Integer.parseInt(x);
	System.out.println(i+20);	
		
	String y="12.33";
	System.out.println(y+20);

	double d = Double.parseDouble(y)+20;
	System.out.println(d);
		
	//int to string
	int a=200;
	System.out.println(a+20);
	String str = String.valueOf(a);
	System.out.println(str+20);	
		
		
	}

}

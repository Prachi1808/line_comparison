package main;

public class LineComparisonUC2 {
	
	public static void main(String[] args) {
		
		String s1 = "x1";
		String s2 = "y1";
		String s3 = "x2";
		String s4 = "y2";
		System.out.println("s1 == s2"); //true
	       
        System.out.println("s3 == s4"); //false
        
        System.out.println("s1 == s3"); //false
        
        System.out.println("s2 == s4"); //true
   
       System.out.println(s1.equals(s2)); //true
       System.out.println(s3.equals(s4)); //false
       System.out.println(s1.equals(s3)); //false
       System.out.println(s2.equals(s4)); //true
	}

}

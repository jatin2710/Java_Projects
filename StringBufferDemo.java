package javafullstackcourse;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer obj = new StringBuffer("Hello");
		obj = obj.append(" World");
		
		//obj = obj.reverse();	
		
		StringBuffer obj1 = new StringBuffer("Hello");
		int val = obj.compareTo(obj1); 
		System.out.println(val); 
		
		obj.length();
		System.out.println(obj.charAt(2));
		System.out.println(obj);
		
		
	}

}
package files;

public class staticBlock{
	static int num;
	static String name;
	static {     // used to initiate static variables , loads when class is loaded into memory
		num =25;
		name = "parth";
	}
	static {    // used to initiate static variables , loads when class is loaded into memory
		num=26;
		name="oggy";
	}
	static void disp() {         // static function can only access static vars
		System.out.println(num);
		System.out.println(name);
	}
	public static void main(String args[]) {
		disp();       // static functions & vars can be directly used without creating object.
		
		System.out.println("------------------"); 
		
		staticBlock s1 = new staticBlock();
		staticBlock s2 = new staticBlock();
		
		s1.num = 77;           //  values changed using s1 object
		s1.name = "Tom";
		
		System.out.println(s2.num);   // num & name are static so they are created only once and value is already given using s1 object 
		System.out.println(s2.name);
		
		
	}
}
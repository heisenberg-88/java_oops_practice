package files;

class person{    //singletone class
	
	static person pe = new person();
	private person() {
		System.out.println("Only one object is created , this is singletone class");
	}
	static person printans() {
		return pe;
	}
}


public class singletone_class{
	public static void main(String args[]) {
		
		person p1 = person.printans();
		
	}
}
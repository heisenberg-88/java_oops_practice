package files;

class rld{
	rld(){
		System.out.println("rld class constructor is called");
	}
	rld(int n){
		System.out.println("rld constructor with int parameter is called "+n);
	}
}

public class test extends rld{
	int k;
	test(){
		super();
		System.out.println("constructor called");
	}
	test(int n){
		this();
		System.out.println("this number is " + n);
		k=n;
	}
	test(int a,int b){
		super(a+b);
	}

	public static void main(String args[]) {
		test t1 = new test(5);
		System.out.println(t1.k);
		test t2 = new test(1,2);
	}
}
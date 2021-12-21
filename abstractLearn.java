abstract class animals{
	abstract public void animalSound();
}


public class abstractLearn extends animals{
	public void animalSound() {
		System.out.println("abstract use done");
	}
	public static void main(String args[]) {
		animals obj = new abstractLearn();
		obj.animalSound();
	}
}
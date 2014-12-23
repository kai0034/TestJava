
public class Cat extends Animal {
	
	public Cat(){
		System.out.println("Cat created.");
	}

	public static void testClassMethod(){
		System.out.println("The static method in Cat");
	}
	
	public void testInstanceMethod(){
		System.out.println("The instance method in Cat");
	}
}

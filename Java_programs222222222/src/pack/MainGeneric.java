package pack;

public class MainGeneric<T> {
    @SuppressWarnings("deprecation")
	public static <T> T createInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();  // Create a new instance of the class
    }

    public static void main(String[] args) throws Exception {
        Dog dog = createInstance(Dog.class);  // Create an instance of Dog class
        System.out.println(dog.getClass().getSimpleName());  // Output: Dog
        Dog dog1 = createInstance(new Dog("Rotweeler").getClass());
        Dog dog2 = new Dog("Pitbull");
        System.out.println("dog------>" + dog1.getClass()+" "+dog2.toString());
    }
}

// A simple class Dog
class Dog {
	String str ="";
	
	public Dog() {
		System.out.println("Default Dog");
	}
    public Dog(String str) {
      
    	this.str = str;
    	System.out.println("Dog created! "+ str);
    }
	@Override
	public String toString() {
		return "Dog [str=" + str + "]";
	}
    
}

public class Main {

	public static void main(String[] args) {
		// TODO Here we will create new animals objects
		System.out.println("Animals");

		Dog dog = new Dog("Test", 5, "Dog");

		String result = dog.identifyYourself();

		System.out.println(result);

		Parrot parrot = new Parrot("Qwerty", 2, "Asdf");

	}

}

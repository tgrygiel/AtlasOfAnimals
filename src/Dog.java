
public class Dog {
	private String name;
	private int age;
	private String type;

	public static int iloscPilok = 0;


	public String getName() {
		return name;
	}

	public Dog setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Dog setAge(int age) {
		this.age = age;
		return this;
	}

	public String getType() {
		return type;
	}

	public Dog setType(String type) {
		this.type = type;
		return this;
	}

	public Dog(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public void wzocPilke(){
		iloscPilok++;
		System.out.println("przynesc pilke " + name);
		System.out.println("mam pilok: " + iloscPilok);

	}


	public void eat(String typeOfFood) {
		System.out.println("Time to eat: " + typeOfFood);
	}

	public String identifyYourself() {
		return "Dog's name: " + this.name
				+ "Dog's age" + this.age;
	}
}

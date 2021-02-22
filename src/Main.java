import java.util.ArrayList;
import java.util.Arrays;

import Vehicles.Car;
import Vehicles.CarType;
import Vehicles.Plane;
import Vehicles.Vehicle;
import inheritance.Point;
import inheritance.Point3d;
import queue.Queue;
import stack.ArrayStack;

public class Main {

	public static void main(String[] args) {
		// TODO Here we will create new animals objects
		System.out.println("Animals");

		Dog dog = new Dog("Test", 5, "Dog");

		String result = dog.identifyYourself();

		System.out.println(result);

		Parrot parrot = new Parrot("Qwerty", 2, "Asdf");
		
		
		Point p1 = new Point(1,1);
		Point3d p2 = new Point3d(1, 10, 3);

		p2.changePointPosition(10);
		p2.changePointPosition(12);
		p2.goToDungeons();
		System.out.println(p2);
		
		
		Car car1 = new Car("Fiat", "Panda", 220, 120, 5);
		Car car2 = new Car("Mercedes", "C klasa", 250, 200, 5);
		Car car3 = new Car("Opel", "Zafira", 200, 130, 7);
		Plane plane1 = new Plane("Boeing", "747", 5000, 3000, 10000);
		Vehicle car4 = new Car("aa", "bb", 300, 400, 2);
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(10);
//		vehicles.add(car1);
//		vehicles.add(car2);
//		vehicles.add(car3);
//		vehicles.add(plane1);		
//				
//		if(vehicles.get(3) instanceof Plane) {
//			Plane p = (Plane)vehicles.get(3);
//			p.fly(2000, 3000);
//		}
		
		Queue queue = new Queue();
		System.out.println(queue);
		ArrayStack stack = new ArrayStack();
		stack.push("Adam");
		stack.push("Ela");
		stack.push("Radek");
		stack.push("Marysia");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.size());
	}

}

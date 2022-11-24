import java.util.Scanner;
public class RunAnimal{
public static void main (String args []){
Scanner SC = new Scanner(System.in);

System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
String input = SC.nextLine();

	if (input.equalsIgnoreCase("B")){
	Bird bird = new Bird();
	bird.eat();
	bird.sleep();
	bird.sound();
	}

	else if(input.equalsIgnoreCase("C")){
	Cat cat = new Cat();
	cat.eat();
	cat.sleep();
	cat.sound();
	}

	else if(input.equalsIgnoreCase("D")){
	Dog dog = new Dog();
	dog.eat();
	dog.sleep();
	dog.sound();
	}

	else {
	System.out.println("Invalid Input");
		}
	}
}
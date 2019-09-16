package ex01;
import java.util.*;


interface Animal {
	abstract void cry() ;
	abstract String getAnimalName();
}
class Dog implements Animal{
	public void cry() {
		System.out.println("ÍôÍôÍô");
	}
	public String getAnimalName() {
		return "¹·";
	}
}
class Cat implements Animal{
	public void cry() {
		System.out.println("ß÷ß÷ß÷");
	}
	public String getAnimalName() {
		return "Ã¨";
	}
}
class Simulator{
	void playSound(Animal animal){
		System.out.println(animal.getAnimalName());
		animal.cry();
	}
}
public class Text01 {
	public static void main(String args[]) {
		Simulator simulator= new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
	}
}





package Abstraction;

public abstract class Shape {
	
	//1.abstract keyword is used to obtain abstraction 0-100%.
	//2.We can not create object of abstract methods and interface.
	//3.Abstract class have both abstract and non abstract methods thats why we achieve 0-100% abstraction.
	//4.But Interface all methods are abstract only thats why we achieve 100% abstraction.
	
	
    //5.We can create constructor in abstract class but not in interface.
	//6.To call an abstract class constructor we have to create object of child/base/inherited class.
	//7.if all the methods are abstract in nature in a abstract class we get 100% abstraction.
	//8.If we use final keyword in our methods it can not be overridden in child class.
	//9.Partial abstraction-Abstract+Non Abstract Methods
	//Abstraction: It is a process of hiding the implementation details
	//We can achieve abstraction by two ways 1.Using Abstract class and 2.Interface
	
	Shape(){
		System.out.println("shape class constructor");
	}
	
	int color;
	
	abstract void drawing(); //abstract method
	
	public void fill() {     //non-abstract method
		
		System.out.println("Shape--fill");
	}
	
	
	
	
	

}

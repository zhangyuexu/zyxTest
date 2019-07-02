package com.zyx.abstractclass;
/**
 * 将抽象类类型作为方法的参数进行传递
 */
public class TestArguments {
	public static void main(String[] args) {
		//调用operatorAnimal，传递子类对象
		Dog dog=new Dog();
		operatorAnimal(dog);
		operatorAnimal(new Cat());
		
	}
	/**
	 * 方法operatorAnimal参数是一个抽象类，调用这个方法，传递的是Animal的对象，但是抽象类没有对象，因为抽象类不能new
	 * 只能传递其子类的对象(多态)
	 * 可以传递抽象类的任意的子类对象
	 */
	public static void operatorAnimal(Animal a){
		a.eat();
	}
}

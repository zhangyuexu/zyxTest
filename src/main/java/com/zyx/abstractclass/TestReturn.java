package com.zyx.abstractclass;

public class TestReturn {

	public static void main(String[] args) {
		GetAnimal g=new GetAnimal();
		Animal a=g.getAnimal(0);//方法返回的是Animal对象，return new Dog()
		a.eat();


	}

}

package com.zyx.abstractclass;

public class TestReturn {

	public static void main(String[] args) {
		GetAnimal g=new GetAnimal();
		Animal a=g.getAnimal(0);//�������ص���Animal����return new Dog()
		a.eat();


	}

}

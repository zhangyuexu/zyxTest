package com.zyx.abstractclass;

public class GetAnimal {
	/**
	 * 定义一个方法，方法的返回值是抽象类类型
	 * 以为抽象类是没有对象的，因此返回的是其子类的对象
	 * @param id
	 * @return
	 */
	public Animal getAnimal(int id){
		if(id==0)
			return new Dog();
		return new Cat();
	}

}

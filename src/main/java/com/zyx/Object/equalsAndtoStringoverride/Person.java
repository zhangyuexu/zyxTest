package com.zyx.Object.equalsAndtoStringoverride;

public class Person {
	private String name;
	private int age;
	
	public Person(){}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 重写父类Object中的equals方法，因为父类Object中的equals比较的是两个对象的内存地址，即return this==obj
	 * 但是两个对象比较内存地址没意义，所以我们重写equals方法,比较两个对象的内容
	 */

	@Override
	public boolean equals(Object obj) {
		/**
		 * 这句话中this表示谁调用就是谁(即p1)，obj是传递过来的对象(p2),此时p2由Person类提升为父类Object类型了，所以obj就不能再使用子类p2中特有的内容了
		 * 这就体现出多态的一个弊端：多态中，父类不能调用子类特有的内容(属性)
		 * 所以如果要调用子类特有的属性，必须要做向下转型(Person)obj
		 */
		//this.name ==obj.name;
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(obj instanceof Person){
			Person p=(Person)obj;
			return (this.name==p.name)&&(this.age==p.age);
		}
		return false;
	}
	/**
	 * 重写父类Object中的toString方法，因为没有必要返回给用户对象的内存地址看
	 * 要求：toString方法中返回类中的成员变量的值。注意，toString方法中不能写类中静态的成员变量，因为，静态根本就不属于对象，静态跟对象没关系。
	 */
	public String toString(){
		
		return name +","+ age;
	}

}

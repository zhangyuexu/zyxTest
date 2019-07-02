package com.zyx.Object.equalsAndtoStringoverride;

public class TestEquals {

	public static void main(String[] args) {
		
		Person p1=new Person("张三",28);
		Person p2=new Person("李四",28);
		Person p3=new Person("张三",28);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println(p1);//等价于p1.toString，因为打印默认调用的就是toString方法

	}

}

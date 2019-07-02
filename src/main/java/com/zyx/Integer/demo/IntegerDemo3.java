package com.zyx.Integer.demo;

public class IntegerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=500;//这是自动装箱
		Integer b=500;
		System.out.println(a==b);//这是比较两个对象的地址
		System.out.println(a.equals(b));//Integer类继承Object，它重写了equals方法，比较的是对象的数据，跟String类一样
		System.out.println("=====================");
		//只要数据在byte范围内，JVM为了节省内存不会重新new对象
		Integer aa=127;//Integer aa=new Integer(127);
		Integer bb=127;//bb=aa;
		System.out.println(aa==bb);//true
		System.out.println(aa.equals(bb));//true

	}

}

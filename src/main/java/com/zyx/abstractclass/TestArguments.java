package com.zyx.abstractclass;
/**
 * ��������������Ϊ�����Ĳ������д���
 */
public class TestArguments {
	public static void main(String[] args) {
		//����operatorAnimal�������������
		Dog dog=new Dog();
		operatorAnimal(dog);
		operatorAnimal(new Cat());
		
	}
	/**
	 * ����operatorAnimal������һ�������࣬����������������ݵ���Animal�Ķ��󣬵��ǳ�����û�ж�����Ϊ�����಻��new
	 * ֻ�ܴ���������Ķ���(��̬)
	 * ���Դ��ݳ������������������
	 */
	public static void operatorAnimal(Animal a){
		a.eat();
	}
}

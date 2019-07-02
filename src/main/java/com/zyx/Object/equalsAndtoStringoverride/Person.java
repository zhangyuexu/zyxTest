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
	 * ��д����Object�е�equals��������Ϊ����Object�е�equals�Ƚϵ�������������ڴ��ַ����return this==obj
	 * ������������Ƚ��ڴ��ַû���壬����������дequals����,�Ƚ��������������
	 */

	@Override
	public boolean equals(Object obj) {
		/**
		 * ��仰��this��ʾ˭���þ���˭(��p1)��obj�Ǵ��ݹ����Ķ���(p2),��ʱp2��Person������Ϊ����Object�����ˣ�����obj�Ͳ�����ʹ������p2�����е�������
		 * ������ֳ���̬��һ���׶ˣ���̬�У����಻�ܵ����������е�����(����)
		 * �������Ҫ�����������е����ԣ�����Ҫ������ת��(Person)obj
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
	 * ��д����Object�е�toString��������Ϊû�б�Ҫ���ظ��û�������ڴ��ַ��
	 * Ҫ��toString�����з������еĳ�Ա������ֵ��ע�⣬toString�����в���д���о�̬�ĳ�Ա��������Ϊ����̬�����Ͳ����ڶ��󣬾�̬������û��ϵ��
	 */
	public String toString(){
		
		return name +","+ age;
	}

}

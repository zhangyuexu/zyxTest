package com.zyx.abstractclass;

public class GetAnimal {
	/**
	 * ����һ�������������ķ���ֵ�ǳ���������
	 * ��Ϊ��������û�ж���ģ���˷��ص���������Ķ���
	 * @param id
	 * @return
	 */
	public Animal getAnimal(int id){
		if(id==0)
			return new Dog();
		return new Cat();
	}

}

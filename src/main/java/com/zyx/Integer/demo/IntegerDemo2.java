package com.zyx.Integer.demo;
/**
 * Integer���е�����������
 * ����������������2����̬��Ա����
 */
public class IntegerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Integer���е�2����̬��Ա����
	 * MAX_VALUE
	 * MIN_VALUE
	 * 
	 * Integer��������3����̬�����������Ƶ�ת��
	 * ʮ����ת�ɶ�����  toBinaryString(int)
	 * ʮ����ת�ɰ˽���  toOctalString(int)
	 * ʮ����ת��ʮ������  toHexString(int)
	 * ������������������ֵ������String��ʽ����
	 */
	public static void function(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.toBinaryString(99));
		System.out.println(Integer.toOctalString(99));
		System.out.println(Integer.toHexString(99));
	}

}

package com.zyx.Integer.demo;
/**
 * Integer��װ��������int,�����ṩ�����ķ���
 * ���ַ���ת�ɻ�������int
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		function1();

	}
	/**
	 * Integer�๹�췽��
	 * Integer(String s)
	 * �����ָ�ʽ���ַ��������ݵ�Integer��Ĺ��췽����
	 * ����Integer���󣬰�װ����һ���ַ���
	 * �����췽���е��ַ�����ת�ɻ����������ͣ����÷Ǿ�̬����int intValue() //֮�����ǷǾ�̬����������Ϊͨ�����췽��new�����ˣ�����ֻ�ܵ��Ǿ�̬����
	 */
	public static void function1(){
		Integer in=new Integer("100");
		int i=in.intValue();
		System.out.println(i);
	}
	/**
	 * �ַ���װ������
	 * Integer���еľ�̬����int parseInte(String s)
	 */
	public static void function2(){
		int i=Integer.parseInt("-13");
		System.out.println(i/2);
	}
	/**
	 * ����ת���ַ��������ַ�ʽ��
	 * 1���ַ���ƴ�ӣ��κ�����+"" ����ת���ַ���
	 * 2��Integer���еľ�̬����toString()�����toString()��������дObject��toString��������˼�ˣ����������
	 */
	public static void function3(){
		int i=5;
		//String s=i+"";
		String s=Integer.toString(i);
		System.out.println(s);
	}

}

package com.zyx.String.demo;

public class RegexDemo {

	public static void main(String[] args) {
		checkQQ();
		checkTel();
		checkMail();
		//split_1();
		//split_2();
		replaceAll_1();

	}
	/**
	 * ���QQ���Ƿ�Ϸ���
	 * 0���ܿ�ͷ��ȫ�����֣�λ��5-10λ
	 * \\d��ʾ0-9�����֣�\\Dƥ�䲻������
	 */
	public static void checkQQ(){
		String QQ="123456";
		boolean b=QQ.matches("[1-9][0-9]{4,9}");//�ȼ�[1-9][\\d]{4,9}
		System.out.println(b);
	}
	/**
	 * ����ֻ����Ƿ�Ϸ���
	 * ��һλ������1��ͷ���ڶ�λ��34578��ȡ������9λ��0-9������
	 */
	public static void checkTel(){
		String telNum="13400865946";
		boolean b=telNum.matches("1[34578][\\d]{9}");
		System.out.println(b);
	}
	/**
	 * ��������Ƿ�Ϸ���
	 * 12356@qq.com
	 * mym_ail@sina.com
	 * nihao@163.com
	 * wodemai@yahoo.com.cn
	 * 
	 * @ǰ�棬�����֡���ĸ���»��ߣ��Ҳ�����1��
	 * @���棬�����֡���ĸ
	 * .��������ĸ
	 */
	public static void checkMail(){
		String telNum="134006my@163.com";
		boolean b=telNum.matches("[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+");
		System.out.println(b);
	}
	/**
	 * String�෽��split���ַ��������и�
	 */
	public static void split_1(){
		String str="12-25-36-94";
		String[] arr=str.split("-");
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String�෽��split���ַ��������и�
	 * ���տո�����и�
	 */
	public static void split_2(){
		String str="hi   I am     java hello   world  !";
		String[] arr=str.split(" +");//x+����x����һ�λ��߶��
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String�෽��split���ַ��������и�
	 * ����.�����и�
	 */
	public static void split_3(){
		String str="192.168.1.2";
		String[] arr=str.split("\\.");//��������ʽ����.���������ַ������Բ���ֱ�Ӱ�.���иת���ַ�������һ��\\
		for(String s:arr){
			System.out.println(s);
		}
	}
	/**
	 * String�෽��replaceAll(��������滻������ַ���)
	 * "Hello12345World6789012"���ַ�����������ַ��滻��
	 */
	public static void replaceAll_1(){
		String s="Hello12345World6789012";
		//s=s.replaceAll("[\\d]","#" );
		s=s.replaceAll("[\\d]+", "#");
		System.out.println(s);
	}
}

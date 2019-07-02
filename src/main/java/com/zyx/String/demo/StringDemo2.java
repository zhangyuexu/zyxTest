package com.zyx.String.demo;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function();
	}
	public static void function(){
		/**
		 * String��ĳ��÷���,������API�ĵ���
		 * char charAt(int index) 
		 * String concat(String str) ��ָ���ַ������ӵ����ַ����Ľ�β��
		 * boolean contains(CharSequence s) �����ַ�����ָ���� CharSequence �Ƚϡ�
		 * boolean contentEquals(StringBuffer sb) �����ַ�����ָ���� StringBuffer �Ƚϡ�
		 * boolean startsWith(String prefix) 
		 * boolean startsWith(String prefix, int toffset)���Դ��ַ�����ָ��������ʼ�����ַ����Ƿ���ָ��ǰ׺��ʼ��
		 * boolean endsWith(String suffix)
		 * boolean equals(Object anObject) 
		 * boolean equalsIgnoreCase(String anotherString) ���� String ����һ�� String �Ƚϣ������Ǵ�Сд��
		 * byte[] getBytes() ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ����
		 * byte[] getBytes(Charset charset) ʹ�ø����� charset ���� String ���뵽 byte ����
		 * int indexOf(int ch) ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
		 * int indexOf(String str) ����ָ�����ַ����ڴ��ַ����е�һ�γ��ִ�������
		 * int lastIndexOf(int ch)
		 * int lastIndexOf(String str)
		 * boolean isEmpty() 
		 * int length() 
		 * boolean matches(String regex) ��֪���ַ����Ƿ�ƥ�������������ʽ��
		 * String replace(char oldChar, char newChar)
		 * String replace(CharSequence target, CharSequence replacement)
		 * String replaceAll(String regex, String replacement) ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ�����
		 * String replaceFirst(String regex, String replacement) ʹ�ø����� replacement �滻���ַ���ƥ�������������ʽ�ĵ�һ�����ַ�����
		 * String[] split(String regex) 
		 * String[] split(String regex, int limit) 
		 * String substring(int beginIndex) ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ�����
		 * String substring(int beginIndex, int endIndex) 
		 * char[] toCharArray() �����ַ���ת��Ϊһ���µ��ַ�����
		 * String toLowerCase() 
		 * String toUpperCase()
		 * String toString() ���ش˶��������Ѿ���һ���ַ���������
		 * String trim()�����ַ����ĸ���������ǰ���հ׺�β���հס�
		 * String valueOf(boolean b) 
		 * String valueOf(char c) 
		 * String valueOf(char[] data) 
		 * String valueOf(char[] data, int offset, int count) 
		 * String valueOf(int i) 
		 * String valueOf(Object obj) 
		 */
		//valueOf������ת��
		int m=2;
		String s1=String.valueOf(m);
		System.out.println(s1);
		
		String s2=String.valueOf(true);
		System.out.println(s2);
		
		char[] ch={'I','l','o','v','e'};
		String s3=String.valueOf(ch);
		System.out.println(s3);
		
		Person p=new Person("����",22);
		String s4=String.valueOf(p);
		System.out.println(s4);
	}

}

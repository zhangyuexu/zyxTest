package com.zyx.String.demo;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringDemo1 {
	/**String��ĸ���Ҳ��Object
	 * һ�ж��Ƕ����ַ���Ҳ�Ƕ���
	 * String���������ַ���������࣬���е�""����String��Ķ���
	 * �ַ�����һ��������һ�����������ܸı䡣�ַ����ı�����һ��final���ַ�����,private final char value[];
	 * �ַ������巽ʽ��������ֱ��=��ʹ��String��Ĺ��췽��
	 * String���кܶ����صĹ��췽�������������ַ�����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		function();
	}
	public static void function() throws Exception{
		/**
		 * String��Ĺ��췽��String(byte[] bytes),����һ���ֽ�����������һ���ַ���
		 */
		byte[] bytes={97,98,99,100};
		String s=new String(bytes);
		System.out.println(s);
		/**
		 * String(byte[] bytes, int offset, int length) 
		 * ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String��
		 * String(byte[] bytes, int offset, int length, Charset charset)
		 *  ͨ��ʹ��ָ���� charset ����ָ���� byte �����飬����һ���µ� String��
		 */
		byte[] bytes1={65,66,67,68,69};
		String s1=new String(bytes1,1,2,"UTF-8");
		System.out.println(s1);
		/**
		 * String(char[] value) ʹ���ַ�����������һ���ַ���
		 * String(char[] value, int offset, int count) 
		 * 
		 */
		char[] value={'I','l','o','v','e'};
		String s2=new String(value);
		System.out.println(s2);
	}
}

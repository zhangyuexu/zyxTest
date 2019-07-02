package com.zyx.String.demo;

public class StringBufferTest {
	public static void main(String[] args) {
		//function();
		int[] arr={34,12,89,68};
		System.out.println(function2(arr));
	}
	/**
	 * StringBuffer��ķ���
	 * StringBuffer append(�������� ����) 
	 * append�����������ֵ��Դ����return this;��˭������������ͷ���˭
	 * StringBuffer delete(int start, int end) �Ƴ������е����ַ����е��ַ���
	 * StringBuffer deleteCharAt(int index) �Ƴ�������ָ��λ�õ� char��
	 * StringBuffer insert(int index, ��������) ���������͵����ݲ��뵽��������ָ��������
	 * StringBuffer replace(int start, int end, String str) ʹ�ø��� String �е��ַ��滻�����е����ַ����е��ַ��� 
	 * StringBuffer reverse() �����ַ��������䷴ת��ʽȡ����
	 * String substring(int start)  ����һ���µ� String�����������ַ����е�ǰ���������ַ������С�
	 * String substring(int start, int end) ����һ���µ� String�������������е�ǰ���������ַ�������
	 * String toString() ����һ����String,���������ǽ�һ���ɱ���ַ���������������һ�����ɱ���ַ�������
	 */
	public static void function(){
		StringBuffer sb=new StringBuffer();
		sb.append(6).append(false).append('a').append(2.2);//��ʱ��sb���õ�append�����Է��صĻ���sb���StringBuffer�����
		System.out.println(sb);
		sb.delete(1, 5);
		//sb.delete(0, sb.length());//���ǰѻ�����������ַ�ȫ����ɾ����
		//System.out.println(sb);
		sb.replace(1, 5, "Q");
		System.out.println(sb);
		String s=sb.toString();//���������ǽ�һ���ɱ���ַ���������������һ�����ɱ���ַ�������
		System.out.println(s);
		
	}
	
	/**
	 * ԭʼ��ʽ��int[] arr={34,12,89,68};��int[]��ÿ��Ԫ��ת���ַ���
	 * �����ʽ��[34,12,,89,68]
	 */
	public static String function2(int[] arr){
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		String s=sb.toString();
		return s;
	}
}

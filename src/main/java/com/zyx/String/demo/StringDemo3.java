package com.zyx.String.demo;
/**
 * ���ַ����д�д��ĸ��Сд��ĸ�����ֵĸ���
 * @author ASUS
 *
 */
public class StringDemo3 {
	public static void main(String[] args) {
		getCount("haogLJjgljg99723680Nmljgm");
	}
	public static void getCount(String s){
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);//���ﲻ�ð��ַ���ת���ַ����飬��Ϊ�ַ�����������ַ����飬���Ծ������������
			//����д��ĸ��65-90 Сд��ĸ��97-122 ������48-57
			if(c>=65&&c<=90){
				bigCount++;
			}
			if(c>=97&&c<=122){
				smallCount++;
			}
			if(c>=48&&c<=57){
				numberCount++;
			}
		}
		System.out.println("��д��ĸ�ĸ�����"+bigCount);
		System.out.println("Сд��ĸ�ĸ�����"+smallCount);
		System.out.println("���ֵĸ�����"+numberCount);
	}
}

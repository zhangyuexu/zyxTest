package com.zyx.Integer.demo;

public class IntegerDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=500;//�����Զ�װ��
		Integer b=500;
		System.out.println(a==b);//���ǱȽ���������ĵ�ַ
		System.out.println(a.equals(b));//Integer��̳�Object������д��equals�������Ƚϵ��Ƕ�������ݣ���String��һ��
		System.out.println("=====================");
		//ֻҪ������byte��Χ�ڣ�JVMΪ�˽�ʡ�ڴ治������new����
		Integer aa=127;//Integer aa=new Integer(127);
		Integer bb=127;//bb=aa;
		System.out.println(aa==bb);//true
		System.out.println(aa.equals(bb));//true

	}

}

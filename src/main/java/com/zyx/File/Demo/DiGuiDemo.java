package com.zyx.File.Demo;

/*
 *  �����ĵݹ����
 *    �����Լ������Լ�
 *  �ʺ���,��������������岻��,�������е�ʱ��,�������еķ���������仯
 *  ע��:
 *     �ݹ�һ��Ҫ�г���, ��������ó���ͣ��
 *     �ݹ�������ܹ���
 *     ���췽��,��ֹ�ݹ�
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		/*int sum = getSum(3);
		System.out.println(sum);*/
		System.out.println(getJieCheng(5));
		System.out.println(getFBNQ(12));
	}
	/*
	 *  �����ݹ�,����쳲���������
	 *  
	 */
	public static int getFBNQ(int month){
		if( month == 1)
			return 1;
		if( month == 2)
			return 1;
		return getFBNQ(month-1)+getFBNQ(month-2);
	}
	
	/* 
	 *  ����׳� 5!
	 *   5*4*3*2*1
	 */
	public static int getJieCheng(int n){
		if ( n == 1)
			return 1;
		return n * getJieCheng(n-1);
	}
			
	/*
	 *  ���� 1+2+3+100�� = 5050
	 *  �������:
	 *    n+(n-1)+(n-2)
	 *    100+(100-1)+(99-1)+...1
	 */
	public static int getSum(int n){
		if( n == 1)
			return 1;
		return n + getSum(n-1);
	}
	
}

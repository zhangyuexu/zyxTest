/*
 *  JDK1.5�µ�����,�����Ŀɱ����
 *  ǰ��: ����������������ȷ��,�����ĸ�������
 *  �ɱ�����﷨: ��������...������
 *  �ɱ����,���ʾ���һ������
 */
public class VarArgumentsDemo {
	public static void main(String[] args) {
		//����һ�����пɱ�����ķ���,���ݲ���,��������
	//	getSum();
		int sum = getSum(5,34,3,56,7,8,0);
		System.out.println(sum);
		
		function1(1,2,3);
	}
	/*
	 * �ɱ������ע������
	 * 1. һ��������,�ɱ����ֻ����һ��
	 * 2. �ɱ����,����д�ڲ����б�����һλ
	 */
	 public static void function1(int a,int b, int...c){}
	 
	 public static void function2(Object...o){
		 
	 }
	
	/*
	 * ���巽��,����10��������
	 * �����Ŀɱ����ʵ��,�ɱ����,���ʾ���һ������
	 */
	public static int getSum(int...a){
		int sum = 0 ;
		for(int i : a){
			sum = sum + i;
		}
		return sum;
	}
	
	/*
	 * ���巽��,����3��������
	 */
	/*public static int getSum(int a,int b ,int c){
		return a+b+c;
	}*/
	
	/*
	 * ���巽��,����2��������
	 */
	/*public static int getSum(int a,int b){
		return a+b;
	}*/
}
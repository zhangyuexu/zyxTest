package com.zyx.set.demo;
/**
 * ����Ĺ�ϣֵ����ʵ����һ����ͨ��ʮ��������
 * ������Object��������public int hashCode()
 *
 */
public class HashDemo {

	public static void main(String[] args) {
		Person p=new Person();
		int i=p.hashCode();
		System.out.println(i);
		
		/**
		 * String��̳�Object����д�����hashCode����
		 *  public int hashCode() {
              int h = hash;//hashĬ��ֵΪ0
              if (h == 0 && value.length > 0) {
                char val[] = value;

                for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
              }
              hash = h;
            }
            return h;
        }

		 */
		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}

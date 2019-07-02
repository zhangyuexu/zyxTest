package com.zyx.set.demo;
/**
 * 对象的哈希值，其实就是一个普通的十进制正数
 * 父类是Object，方法是public int hashCode()
 *
 */
public class HashDemo {

	public static void main(String[] args) {
		Person p=new Person();
		int i=p.hashCode();
		System.out.println(i);
		
		/**
		 * String类继承Object，重写父类的hashCode方法
		 *  public int hashCode() {
              int h = hash;//hash默认值为0
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

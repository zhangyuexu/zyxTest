package com.zyx.Arrays.demo;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function1();
		int[] arr={56,65,11,18,88,100,66,99,37,60};
		int[] newArr=test(arr);
		System.out.println(Arrays.toString(newArr));
	}
	/**
	 * static void sort(����)
	 * ����������
	 */
	public static void function1(){
		int[] arr={5,1,4,6,8,9,0};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	/**
	 * static int binarySearch(���飬������Ԫ��)
	 * ����Ķ��ֲ���
	 */
	public static void function2(){
		int[] arr={5,1,4,6,8,9,0};
		int index=Arrays.binarySearch(arr, 6);
		System.out.println(index);
	}
	/**
	 * static String toString(����)
	 * ���������ַ���
	 */
	public static void function3(){
		int[] arr={5,1,4,6,8,9,0};
		String s=Arrays.toString(arr);//Դ�뻹����StringBufferʵ�ֵ�
		System.out.println(s);
	}
	
	public static int[] test(int[] arr){
		//
		Arrays.sort(arr);
		int[] result=new int[3];
		System.arraycopy(arr, arr.length-3, result, 0, 3);//System�����и����鿽������arraycopy
		return result;
	}

}

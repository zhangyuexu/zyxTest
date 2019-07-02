package com.zyx.set.demo;
/**
 * 两个Person对象p1、p2
 * 问题：
 * 1、如果两个对象的hashCode(哈希值)相同，那么两个对象equals一定返回true吗？
 * 正确答案：不一定
 * 
 * 2、如果两个对象equals返回true，那么两个对象的hashCode(哈希值)一定相同吗？
 * 正确答案：一定
 * 
 * 这是Sun公司规定的，hashCode 的常规协定是： 

在 Java 应用程序执行期间，在对同一对象多次调用 hashCode 方法时，必须一致地返回相同的整数，前提是将对象进行 equals 比较时所用的信息没有被修改。从某一应用程序的一次执行到同一应用程序的另一次执行，该整数无需保持一致。 
如果根据 equals(Object) 方法，两个对象是相等的，那么对这两个对象中的每个对象调用 hashCode 方法都必须生成相同的整数结果。 
如果根据 equals(java.lang.Object) 方法，两个对象不相等，那么对这两个对象中的任一对象上调用 hashCode 方法不 要求一定生成不同的整数结果。但是，程序员应该意识到，为不相等的对象生成不同整数结果可以提高哈希表的性能。 
 *
 */
public class HashDemo2 {

}

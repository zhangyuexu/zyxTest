import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  集合操作的工具类
 *  java.lang.Object
      java.util.Collections
 *    Collections类完全在 collection上进行操作，Collections类中的方法都是静态方法，完全供你调用。
 *    它包含在 collection 上操作的多态算法，即“包装器”，包装器返回由指定 collection 支持的新 collection，以及少数其他内容。
 *    
 *    addAll(Collection<? super T> c, T... elements) 将所有指定元素添加到指定 collection 中。
 *    binarySearch(List<? extends Comparable<? super T>> list, T key)使用二分搜索法搜索指定列表，以获得指定对象。
 *    copy(List<? super T> dest, List<? extends T> src)  将所有元素从一个列表复制到另一个列表。
 *    disjoint(Collection<?> c1, Collection<?> c2) 如果两个指定 collection 中没有相同的元素，则返回 true。
 *    emptyList() 返回空的列表（不可变的）。
 *    emptyMap()  返回空的 map（不可变的）。
 *    emptySet() 返回空的 set（不可变的）。
 *    enumeration(Collection<T> c) 返回一个指定 collection 上的枚举。
 *    fill(List<? super T> list, T obj) 使用指定元素替换指定列表中的所有元素。
 *    max(Collection<? extends T> coll) 根据元素的自然顺序，返回给定 collection 的最大元素。
 *    min(Collection<? extends T> coll) 根据元素的自然顺序 返回给定 collection 的最小元素。
 *    replaceAll(List<T> list, T oldVal, T newVal) 使用另一个值替换列表中出现的所有某一指定值。
 *    reverse(List<?> list) 反转指定列表中元素的顺序。
 *    shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
 *    shuffle(List<?> list, Random rnd) 使用指定的随机源对指定列表进行置换。
 *    sort(List<T> list) 根据元素的自然顺序 对指定列表按升序进行排序。
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		function_2();
	}
	/*
	 * Collections.shuffle方法
	 * 对List集合中的元素,进行随机排列
	 */
	public static void function_2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(11);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);	
		System.out.println(list);
		
		//调用工具类方法shuffle对集合随机排列
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	/*
	 * Collections.binarySearch静态方法
	 * 对List集合进行二分搜索,方法参数,传递List集合,传递被查找的元素
	 */
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//调用工具类静态方法binarySearch
		int index = Collections.binarySearch(list, 16);
		System.out.println(index);
	}
	
	/*
	 *  Collections.sort静态方法
	 *  对于List集合,进行升序排列
	 */
	public static void function(){
		//创建List集合
		List<String> list = new ArrayList<String>();
		list.add("ewrew");
		list.add("qwesd");
		list.add("Qwesd");
		list.add("bv");
		list.add("wer");
		System.out.println(list);
		//调用集合工具类的方法sort
		Collections.sort(list);
		System.out.println(list);
	}
}

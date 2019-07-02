import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  ���ϲ����Ĺ�����
 *  java.lang.Object
      java.util.Collections
 *    Collections����ȫ�� collection�Ͻ��в�����Collections���еķ������Ǿ�̬��������ȫ������á�
 *    �������� collection �ϲ����Ķ�̬�㷨��������װ��������װ��������ָ�� collection ֧�ֵ��� collection���Լ������������ݡ�
 *    
 *    addAll(Collection<? super T> c, T... elements) ������ָ��Ԫ����ӵ�ָ�� collection �С�
 *    binarySearch(List<? extends Comparable<? super T>> list, T key)ʹ�ö�������������ָ���б��Ի��ָ������
 *    copy(List<? super T> dest, List<? extends T> src)  ������Ԫ�ش�һ���б��Ƶ���һ���б�
 *    disjoint(Collection<?> c1, Collection<?> c2) �������ָ�� collection ��û����ͬ��Ԫ�أ��򷵻� true��
 *    emptyList() ���ؿյ��б����ɱ�ģ���
 *    emptyMap()  ���ؿյ� map�����ɱ�ģ���
 *    emptySet() ���ؿյ� set�����ɱ�ģ���
 *    enumeration(Collection<T> c) ����һ��ָ�� collection �ϵ�ö�١�
 *    fill(List<? super T> list, T obj) ʹ��ָ��Ԫ���滻ָ���б��е�����Ԫ�ء�
 *    max(Collection<? extends T> coll) ����Ԫ�ص���Ȼ˳�򣬷��ظ��� collection �����Ԫ�ء�
 *    min(Collection<? extends T> coll) ����Ԫ�ص���Ȼ˳�� ���ظ��� collection ����СԪ�ء�
 *    replaceAll(List<T> list, T oldVal, T newVal) ʹ����һ��ֵ�滻�б��г��ֵ�����ĳһָ��ֵ��
 *    reverse(List<?> list) ��תָ���б���Ԫ�ص�˳��
 *    shuffle(List<?> list) ʹ��Ĭ�����Դ��ָ���б�����û���
 *    shuffle(List<?> list, Random rnd) ʹ��ָ�������Դ��ָ���б�����û���
 *    sort(List<T> list) ����Ԫ�ص���Ȼ˳�� ��ָ���б������������
 */
public class CollectionsDemo {

	public static void main(String[] args) {
		function_2();
	}
	/*
	 * Collections.shuffle����
	 * ��List�����е�Ԫ��,�����������
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
		
		//���ù����෽��shuffle�Լ����������
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	/*
	 * Collections.binarySearch��̬����
	 * ��List���Ͻ��ж�������,��������,����List����,���ݱ����ҵ�Ԫ��
	 */
	public static void function_1(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(15);
		list.add(20);
		//���ù����ྲ̬����binarySearch
		int index = Collections.binarySearch(list, 16);
		System.out.println(index);
	}
	
	/*
	 *  Collections.sort��̬����
	 *  ����List����,������������
	 */
	public static void function(){
		//����List����
		List<String> list = new ArrayList<String>();
		list.add("ewrew");
		list.add("qwesd");
		list.add("Qwesd");
		list.add("bv");
		list.add("wer");
		System.out.println(list);
		//���ü��Ϲ�����ķ���sort
		Collections.sort(list);
		System.out.println(list);
	}
}

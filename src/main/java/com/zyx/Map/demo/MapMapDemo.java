package com.zyx.Map.demo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *  Map���ϵ�Ƕ��,Map�д洢�Ļ���Map����
 *  Ҫ��:
 *    ���ǲ���  
 *      Java������
 *        001  ����
 *        002  ����
 *      
 *      Java��ҵ��
 *        001  ����
 *        002  ����
 *  ���������ݽ��ж���Ĵ洢
 *   001 ����  ��ֵ��
 *   Java������: �洢ѧ�ź������ļ�ֵ��
 *   Java��ҵ��:
 *   ���ǲ���: �洢���ǰ༶
 *   
 *   ������Map   <ѧ��,����>
 *   ���ǲ���Map  <�༶����, ������Map>
 */
public class MapMapDemo {
	public static void main(String[] args) {
		//��������༯��
		HashMap<String, String> javase = new HashMap<String, String>();
		//�����ҵ�༯��
		HashMap<String, String> javaee = new HashMap<String, String>();
		//��༶������,�洢ѧ����Ϣ
		javase.put("001", "����");
		javase.put("002", "����");
		
		javaee.put("001", "����");
		javaee.put("002", "����");
		//���崫�ǲ��ͼ�������,���ǰ༶����,ֵ�������༶����
		HashMap<String, HashMap<String,String>> czbk =
				new HashMap<String, HashMap<String,String>>();
		czbk.put("������", javase);
		czbk.put("��ҵ��", javaee);
		
		//keySet(czbk);
		entrySet(czbk);
	}
	
	public static void entrySet(HashMap<String,HashMap<String,String>> czbk){
		//����czbk���Ϸ���entrySet����,��czbk���ϵļ�ֵ�Թ�ϵ����,�洢��Set����
		Set<Map.Entry<String, HashMap<String,String>>> 
		                         classNameSet = czbk.entrySet();
		//����������Set����
		Iterator<Map.Entry<String, HashMap<String,String>>> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next����,ȡ������czbk���ϵļ�ֵ�Թ�ϵ����
			Map.Entry<String, HashMap<String,String>> classNameEntry =  classNameIt.next();
			//classNameEntry���� getKey,getValue
			String classNameKey = classNameEntry.getKey();
			//��ȡֵ,ֵ��һ��Map����
			HashMap<String,String> classMap = classNameEntry.getValue();
			//���ð༶����classMap����entrySet,��ֵ�Թ�ϵ����洢Set����
			Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
			//����Set����
			Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
			while(studentIt.hasNext()){
				//studentIt����next��ȡ�����ǰ༶���ϵļ�ֵ�Թ�ϵ����
				Map.Entry<String, String> studentEntry = studentIt.next();
				//studentEntry���� getKey getValue
				String numKey = studentEntry.getKey();
				String nameValue = studentEntry.getValue();
				System.out.println(classNameKey+".."+numKey+".."+nameValue);
			}
		}
			System.out.println("==================================");
		
		for (Map.Entry<String, HashMap<String, String>> me : czbk.entrySet()) {
			String classNameKey = me.getKey();
			HashMap<String, String> numNameMapValue = me.getValue();
			for (Map.Entry<String, String> nameMapEntry : numNameMapValue.entrySet()) {
				String numKey = nameMapEntry.getKey();
				String nameValue = nameMapEntry.getValue();
				System.out.println(classNameKey + ".." + numKey + ".." + nameValue);
			}
		}
	}
	
	public static void keySet(HashMap<String,HashMap<String,String>> czbk){
		//����czbk���Ϸ���keySet�����洢��Set����
		Set<String> classNameSet = czbk.keySet();
		//����Set����
		Iterator<String> classNameIt = classNameSet.iterator();
		while(classNameIt.hasNext()){
			//classNameIt.next��ȡ��������Set����Ԫ��,czbk���ϵļ�
			String classNameKey = classNameIt.next();
			//czbk���ϵķ���get��ȡֵ,ֵ��һ��HashMap����
			HashMap<String,String> classMap = czbk.get(classNameKey);
			//����classMap���Ϸ���keySet,���洢��Set����
			Set<String> studentNum = classMap.keySet();
			Iterator<String> studentIt = studentNum.iterator();
	   
     	   while(studentIt.hasNext()){
				//studentIt.next��ȡ��������classMap�ļ�,ѧ��
				String numKey = studentIt.next();
				//����classMap�����е�get������ȡֵ
				String nameValue = classMap.get(numKey);
				System.out.println(classNameKey+".."+numKey+".."+nameValue);
			}
		}
		
		System.out.println("==================================");
	    for(String className: czbk.keySet()){
	       HashMap<String, String> hashMap = czbk.get(className);	
	       for(String numKey : hashMap.keySet()){
	    	   String nameValue = hashMap.get(numKey);
	    	   System.out.println(className+".."+numKey+".."+nameValue);
	       }
	    }
	}

}

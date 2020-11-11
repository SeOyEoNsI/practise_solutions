package week07;

import java.util.*;

public class HashSetTest3 {
	public static void main(String[] args) {
		TreeSet<Integer> low = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		// �ΰ��� HashSet ��ü�� �����Ѵ�

		for (int i=0;i<10 ;i++ )	{
			low.add(i);
			even.add(i*2);
		}

		TreeSet<Integer> intersection = new TreeSet<Integer>(low); 
		TreeSet<Integer> difference = new TreeSet<Integer>(low); 
		TreeSet<Integer> total = new TreeSet<Integer>(low); 

		intersection.retainAll(even);
		difference.removeAll(even);
		total.addAll(even);

		System.out.println("���� 1 : " + low);
		System.out.println("���� 2 : " + even);
		System.out.println();
		System.out.println("�� ���� : " + total);
		System.out.println("���� ���� : " + intersection);
		System.out.println("�� ���� : "+ difference);
		System.out.println();

		System.out.println("�������տ��� ���� ���� ���� : "+Collections.min(intersection));
		System.out.println("�����տ��� ���� ū ���� : "+Collections.max(difference));
		System.out.println();

		Iterator<Integer> it = intersection.iterator();
		int sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("���� ������ ���� : "+sum);

		it = difference.iterator();
		sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("�� ������ ���� : "+sum);
	}
}

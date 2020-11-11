package week07;

import java.util.*;

public class LinkedListTest3 {
	public static void main(String[] args) {
		LinkedList<Integer> low = new LinkedList<Integer>();
		LinkedList<Integer> even = new LinkedList<Integer>();
		// �ΰ��� HashSet ��ü�� �����Ѵ�

		for (int i=0;i<10 ;i++ )	{
			low.add(i);
			even.add(i*2);
		}

		LinkedList<Integer> intersection = new LinkedList<Integer>(low); 
		LinkedList<Integer> difference = new LinkedList<Integer>(low); 
		LinkedList<Integer> total = new LinkedList<Integer>(low);

		intersection.retainAll(even);
		difference.removeAll(even);
		total.addAll(even);

		System.out.println("Ȧ��  : " + low);
		System.out.println("¦��  : "+ even);
		System.out.println();
		System.out.println("��  : " + total);
		System.out.println("����  : " + intersection);
		System.out.println("��  : "+ difference);
		System.out.println();

		System.out.println("���뿡�� ���� ���� ���� : "+Collections.min(intersection));
		System.out.println("������ ���� ū ���� : "+Collections.max(difference));
		System.out.println();

		Iterator<Integer> it = intersection.iterator();
		int sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("������ ���� : "+sum);

		it = difference.iterator();
		sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("���� ���� : "+sum);
	}
}
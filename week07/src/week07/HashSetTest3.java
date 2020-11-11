package week07;

import java.util.*;

public class HashSetTest3 {
	public static void main(String[] args) {
		TreeSet<Integer> low = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		// 두개의 HashSet 객체를 생성한다

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

		System.out.println("집합 1 : " + low);
		System.out.println("집합 2 : " + even);
		System.out.println();
		System.out.println("합 집합 : " + total);
		System.out.println("공통 집합 : " + intersection);
		System.out.println("차 집합 : "+ difference);
		System.out.println();

		System.out.println("공통집합에서 가장 작은 값은 : "+Collections.min(intersection));
		System.out.println("차집합에서 가장 큰 값은 : "+Collections.max(difference));
		System.out.println();

		Iterator<Integer> it = intersection.iterator();
		int sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("공통 집합의 합은 : "+sum);

		it = difference.iterator();
		sum=0;
		while(it.hasNext()){
			sum = sum + it.next();
		}
		System.out.println("차 집합의 합은 : "+sum);
	}
}

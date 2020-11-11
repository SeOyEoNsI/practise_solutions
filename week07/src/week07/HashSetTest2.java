package week07;

import java.util.*;
class HashSetTest2 {
  public static void main(String[] args) {
    HashSet<Integer> low = new HashSet<Integer>();
    HashSet<Integer> even = new HashSet<Integer>();
    // 두개의 HashSet 객체를 생성한다
    for (int i=0;i<5 ;i++ )	{
      low.add(i);
      even.add(i*2);
    }
    System.out.println("low 집합 :  "+low);
    System.out.println("even 집합 : "+even);
    HashSet<Integer> union = new HashSet<Integer>(low);    
    HashSet<Integer> difference = new HashSet<Integer>(even);  
    HashSet<Integer> intersection = new HashSet<Integer>(low);  
    union.addAll(even);
    difference.removeAll(low);
    intersection.retainAll(even);
    System.out.println("합 집합 :    "+union);
    System.out.println("차 집합 :    "+difference);
    System.out.println("교 집합 :    "+intersection);
  }
}

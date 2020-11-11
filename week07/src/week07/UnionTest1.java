package week07;

import java.util.*;
class UnionTest1{
  public static void main(String[] args) {
  
   LinkedHashSet<Integer> low = new LinkedHashSet<Integer>();
   LinkedHashSet<Integer> even = new LinkedHashSet<Integer>();
   int d;
   
 //  TreeSet<Integer> low = new TreeSet<Integer>();
 //  TreeSet<Integer> even = new TreeSet<Integer>();
   
   
 //  HashSet<Integer> low = new HashSet<Integer>();
 //  HashSet<Integer> even = new HashSet<Integer>();
   
    // 두개의 TreeSet 객체를 생성한다
    for (int i=0;i<10 ;i++ )	{
		do {
			d = (int) ((Math.random() * 100.0) + 1.0);
		} while (low.contains(d));
      low.add(d);
      System.out.print(" low"+d);
 
		do {
			d = (int) ((Math.random() * 100.0) + 1.0);
		} while (even.contains(d));
      even.add(d);
      System.out.print(" even"+d);

    }
    System.out.println();
    // 두개의 TreeSet 객체에 요소(Integer 객체)를 추가한다

   // LinkedHashSet<Integer> union = new LinkedHashSet<Integer>(low);  
   //    TreeSet<Integer> union = new TreeSet<Integer>(low);  
 //   HashSet<Integer> union = new HashSet<Integer>(low);  
    TreeSet<Integer> union = new TreeSet<Integer>(low); 
    
    // low 객체를 이용하여 union 객체를 생성
    union.addAll(even);
    // union 객체에 even 객체의 모든 요소를 추가한다. 단 집합의 특성상 중복되는
    // 요소는 저장되지 않는다
 //   System.out.println("LinkedHashSet을 이용한 합집합");
    System.out.println();

    System.out.println("low 집합 :  "+low);
    System.out.println("even 집합 : "+even);
    System.out.println();
    System.out.println("union 합집합 : "+union);
    
    System.out.println("union 최대 : "+ Collections.max(union));
   // Collections.max(union);
    /*
    Iterator<Integer> unionit = union.iterator();
    // iterator() 메소드를 이용하여 Iterator 형의 객체 evenit를 생성
    
    System.out.print("union 집합 : ");
    while(unionit.hasNext()) {
      Integer o = unionit.next();
      int k = System.identityHashCode(o);
      int k1 = k%128;
      System.out.print(o+" ");
      System.out.print(k+" ");
      System.out.println(k1+" ");
      // Iterator 메소드를 이용하여 출력한다
      
    }
    
    
    for(int i = 0; i<10; i++) {
    	Random k = new Random();
    	Random k1 = new Random(200);
        System.out.print(k.nextInt(200)+ ",");
//        System.out.println();
        System.out.print(k1.nextInt(200)+ ",");
    } */
  }
}

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
   
    // �ΰ��� TreeSet ��ü�� �����Ѵ�
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
    // �ΰ��� TreeSet ��ü�� ���(Integer ��ü)�� �߰��Ѵ�

   // LinkedHashSet<Integer> union = new LinkedHashSet<Integer>(low);  
   //    TreeSet<Integer> union = new TreeSet<Integer>(low);  
 //   HashSet<Integer> union = new HashSet<Integer>(low);  
    TreeSet<Integer> union = new TreeSet<Integer>(low); 
    
    // low ��ü�� �̿��Ͽ� union ��ü�� ����
    union.addAll(even);
    // union ��ü�� even ��ü�� ��� ��Ҹ� �߰��Ѵ�. �� ������ Ư���� �ߺ��Ǵ�
    // ��Ҵ� ������� �ʴ´�
 //   System.out.println("LinkedHashSet�� �̿��� ������");
    System.out.println();

    System.out.println("low ���� :  "+low);
    System.out.println("even ���� : "+even);
    System.out.println();
    System.out.println("union ������ : "+union);
    
    System.out.println("union �ִ� : "+ Collections.max(union));
   // Collections.max(union);
    /*
    Iterator<Integer> unionit = union.iterator();
    // iterator() �޼ҵ带 �̿��Ͽ� Iterator ���� ��ü evenit�� ����
    
    System.out.print("union ���� : ");
    while(unionit.hasNext()) {
      Integer o = unionit.next();
      int k = System.identityHashCode(o);
      int k1 = k%128;
      System.out.print(o+" ");
      System.out.print(k+" ");
      System.out.println(k1+" ");
      // Iterator �޼ҵ带 �̿��Ͽ� ����Ѵ�
      
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

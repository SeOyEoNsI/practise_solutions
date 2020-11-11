package week08;

class T1_1 extends Thread{
	int from, to; 
	long sum;
	T1_1(int from, int to){
		this.from=from;
		this.to=to;
	}
	long getSum(){    
		return sum;
	}
	public void run(){      
		for(int i=from;i<=to;i++)
			sum+=i;
	}
}
public class ThreadTest2_1{
	public static void main(String[] args){
		T1_1 st1=new T1_1(1,300000);
		T1_1 st2=new T1_1(300001,600000);
		T1_1 st3=new T1_1(600001,900000);
		long st = System.nanoTime();
		st1.start();
		st2.start();
		st3.start();
		try{
			st1.join();
			st2.join();
			st3.join();
		}catch(InterruptedException ie){ }
		long sum=st1.getSum()+st2.getSum()+ st3.getSum();
		long et = System.nanoTime();

		System.out.println("Thread 합계 = \t\t"+sum);
		System.out.println("실행시간(스레드이용) = \t"+(et-st));
		long sum2 =0;
		long s1 = System.nanoTime();
		for(int i=1;i<=900000;i++) {
			sum2+=i;
		}
		long e1 = System.nanoTime();
		System.out.println("\n전체계산 합계 = \t\t"+sum2);
		System.out.println("실행시간(전체)= \t\t"+(e1-s1));
		
		System.out.println("\n실행시간차이= \t\t"+((et-st)-(e1-s1)));
	}
}
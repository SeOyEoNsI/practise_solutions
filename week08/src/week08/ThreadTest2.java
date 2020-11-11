package week08;

class T1 extends Thread{
	int from, to; 
	long sum;
	T1(int from, int to){
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
public class ThreadTest2{
	public static void main(String[] args){
		T1 st1=new T1(1,300000);
		T1 st2=new T1(300001,600000);
		T1 st3=new T1(600001,900000);
		st1.start();
		st2.start();
		st3.start();
		try{
			st1.join();
			st2.join();
			st3.join();
		}catch(InterruptedException ie){ }
		long sum=st1.getSum()+st2.getSum()+ st3.getSum();
		System.out.println("1-300000ÀÇ ÇÕ = \t\t "+st1.getSum());
		System.out.println("300001-600000ÀÇ ÇÕ = \t"+st2.getSum());
		System.out.println("600001-900000ÀÇ ÇÕ = \t"+st3.getSum());

		System.out.println("ÃÑÇÕ = \t\t\t"+sum);
		long sum2 =0;
		for(int i=1;i<=900000;i++) {
			sum2+=i;
		}
		System.out.println("ÃÑÇÕ2 = \t\t\t"+sum2);

	}
}
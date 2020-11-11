package week06;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Dformat1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy년 M월 dd일 a HH시 mm분 ss초");
		SimpleDateFormat format2 = new SimpleDateFormat ( "yy년 MM월 dd일 a HH시 mm분 ss초");
		SimpleDateFormat format3 = new SimpleDateFormat ( "dd-M-yyyy a HH:mm:ss");
		SimpleDateFormat format4 = new SimpleDateFormat ( "M-dd-yyyy a HH:mm:ss ");
		SimpleDateFormat format5 = new SimpleDateFormat ( "yy-MM-dd EEEE a HH:mm:ss ");
		SimpleDateFormat format6 = new SimpleDateFormat ( "yyyy-M-dd a HH:mm:ss ");
		SimpleDateFormat format7 = new SimpleDateFormat ( "yyyy/MM/dd a HH:mm:ss ");
		SimpleDateFormat format8 = new SimpleDateFormat ( "G yyyy-M-dd EEEE HH:mm:ss a");
		SimpleDateFormat format9 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss a");
		SimpleDateFormat format10 = new SimpleDateFormat ( "yy/MMMM/dd HH:mm:ss a");
		
		TimeZone tz;
		Date time = new Date();
		
		tz = TimeZone.getTimeZone("Asia/Seoul");
		format1.setTimeZone(tz);
		String time1 = format1.format(time);
		System.out.println(tz.getDisplayName());
		System.out.println(time1);
		System.out.println();
				
		tz = TimeZone.getTimeZone("Europe/Paris");
		format2.setTimeZone(tz);				
		String time2 = format2.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time2);
		System.out.println();
		
		tz = TimeZone.getTimeZone("US/Eastern");
		format3.setTimeZone(tz);				
		String time3 = format3.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time3);
		System.out.println();
		
		tz = TimeZone.getTimeZone("Canada/Pacific");
		format4.setTimeZone(tz);
		String time4 = format4.format(time);
		System.out.println(tz.getDisplayName());
		System.out.println(time4);
		System.out.println();
				
		tz = TimeZone.getTimeZone("Brazil/East");
		format5.setTimeZone(tz);				
		String time5 = format5.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time5);
		System.out.println();
		
		tz = TimeZone.getTimeZone("Europe/Moscow");
		format6.setTimeZone(tz);				
		String time6 = format6.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time6);
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Qatar");
		format7.setTimeZone(tz);
		String time7 = format7.format(time);
		System.out.println(tz.getDisplayName());
		System.out.println(time7);
		System.out.println();
				
		tz = TimeZone.getTimeZone("Africa/Johannesburg");
		format8.setTimeZone(tz);				
		String time8 = format8.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time8);
		System.out.println();
		
		tz = TimeZone.getTimeZone("Australia/Sydney");
		format9.setTimeZone(tz);				
		String time9 = format9.format(time);						
		System.out.println(tz.getDisplayName());
		System.out.println(time9);
		System.out.println();
		
		tz = TimeZone.getTimeZone("Asia/Shanghai");
		format10.setTimeZone(tz);
		String time10 = format10.format(time);
		System.out.println(tz.getDisplayName());
		System.out.println(time10);
				
	}

}


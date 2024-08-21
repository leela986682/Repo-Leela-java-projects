package jlab;
import java.util.*;
import java.text.*;
public class DayFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String datE=sc.nextLine();
		String regex = "[ \\]";
		//String[] Arr = 
		//System.out.println("Day is :"+Date());
	}
	public static String Date() {
		SimpleDateFormat ft = new SimpleDateFormat("E");
		Calendar co = Calendar.getInstance();
		co.add(Calendar.YEAR,-9);
		co.add(Calendar.MONTH,0);
		co.add(Calendar.DAY_OF_WEEK,-2);
	// String S = "Sun";
	 String d = ft.format(co.getTime());
		{
		if(d.equalsIgnoreCase("Sun")) return "Sunday";
		else    if(d.equalsIgnoreCase("Mon")) return "Monday";
		else    if(d.equalsIgnoreCase("Thu")) return "Thuesday";
		else	if(d.equalsIgnoreCase("Wed")) return "Wednesday";
		else	if(d.equalsIgnoreCase("Thr")) return "Thursday";
		else	if(d.equalsIgnoreCase("Fri")) return "Friday";
		else return "Saturday";
		}
		
	}
}

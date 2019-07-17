package com.brainmentors.salaryslip;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
	private Formatting() {}

	public static String currencyFormat(BigDecimal bg) {
		Locale locale=new Locale("en", "IN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(bg.doubleValue());
		
	}

	public static String dateFormat() {

		Date date = new Date();

		Locale locale =new Locale("en", "IN");
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,locale);
		return df.format(date);
		
	
	
	}
//	import java.text.SimpleDateFormat;  
//	import java.util.Date;  
//	public static String dateFormat() {
//	
//	  
////		
//	    Date date = new Date();  
//	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
//	    String strDate = formatter.format(date);  
//	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
//	  
//		}  


}
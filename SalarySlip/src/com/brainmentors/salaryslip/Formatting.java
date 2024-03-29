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
}
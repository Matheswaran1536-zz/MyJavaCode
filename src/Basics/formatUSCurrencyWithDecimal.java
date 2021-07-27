package Basics;

import p
import java.util.Currency;
import java.util.Locale;


public class formatUSCurrencyWithDecimal {
	
	public void FormatUSCurrencyWithDecimal(String value)
	{

	 

	String value1="0";
	Double ABC= 123.23;
	String formattedCurrency = "";
	String digits="";
	String amount = value;
	int position = amount.indexOf("/");
	if (position > 0) {
	     amount= amount.substring(0, position);
	}
	formattedCurrency = amount.replace("$ ","").replace("$","").replace(",","").replace("%","");
	
	value1= formattedCurrency;
	System.out.print("Formatted Currency - "+value1);
	
	Locale locale = new Locale("en","US");
	Currency currency = Currency.getInstance(locale);
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	double deci = Double.parseDouble(value1);
	String output = numberFormat.format(deci);
	
	System.out.print("\nLocale Currency - "+output);
	
	
	
	}
	public static void main(String[] args) {
		
		
		//System.out.print("Hello World");
		
		formatUSCurrencyWithDecimal obj = new formatUSCurrencyWithDecimal();
		obj.FormatUSCurrencyWithDecimal("14,000.00");

	}

}

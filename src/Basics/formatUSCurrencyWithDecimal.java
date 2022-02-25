package Basics;


import java.text.NumberFormat; 
import java.util.Currency;
import java.util.Locale;


public class formatUSCurrencyWithDecimal {
	
	public String FormatUSCurrencyWithDecimal(String value)
	{
	 
	String formattedCurrency = "";
	String amount = value;
	int position = amount.indexOf("/");
	if (position > 0) {
	     amount= amount.substring(0, position);
	}
	formattedCurrency = amount.replace("$ ","").replace("$","").replace(",","").replace("%","");
	
	
	double amt = Double.parseDouble(formattedCurrency);
	
	Locale locale = new Locale("en","US");
	Currency currency = Currency.getInstance(locale);
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	String output = numberFormat.format(amt);
	System.out.print(output);
	return output;
	
	
	}
	public static void main(String[] args) {
		
		
		formatUSCurrencyWithDecimal obj = new formatUSCurrencyWithDecimal();
		obj.FormatUSCurrencyWithDecimal("14,0003");

	}

}

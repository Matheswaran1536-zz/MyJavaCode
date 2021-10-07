package Basics;


import java.text.NumberFormat; 
import java.util.Currency;
import java.util.Locale;


public class RemoveDecimalFromCurrency {
	
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
	
	
	int position1 = output.indexOf(".");
	System.out.print(position1);
	String amount1 = output.substring(0,position1);
	System.out.print(amount1);
	
	
	
	
	
	
	return output;
	
	
	}
	public static void main(String[] args) {
		
		
		RemoveDecimalFromCurrency obj = new RemoveDecimalFromCurrency();
		obj.FormatUSCurrencyWithDecimal("$14,000.23");

	}

}

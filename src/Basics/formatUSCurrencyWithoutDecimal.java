package Basics;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class formatUSCurrencyWithoutDecimal {

	public String FormatUSCurrencyWithDecimal(String value)
	{

	 

	int amt=0;
	String formattedCurrency = "";
	String amount = value;
	int position = amount.indexOf("/");
	if (position > 0) {
	     amount= amount.substring(0, position);
	}
	formattedCurrency = amount.replace("$ ","").replace("$","").replace(",","").replace("%","");
	
	 amt = Integer.parseInt(formattedCurrency);
	
	
	//System.out.print("Formatted Currency - "+amt);
	
	Locale locale = new Locale("en","US");
	Currency currency = Currency.getInstance(locale);
	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
	
	String output = numberFormat.format(amt);
	//System.out.print("\nLocale Currency - "+output);
	
	return output;
	
	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		formatUSCurrencyWithoutDecimal obj = new formatUSCurrencyWithoutDecimal();
		obj.FormatUSCurrencyWithDecimal("14,001");


	}

}

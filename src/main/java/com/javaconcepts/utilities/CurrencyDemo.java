package com.javaconcepts.utilities;

import java.util.*;

public class CurrencyDemo {
	/* The "Currency" class encapsulates information about a currency. */
	public static void main(String[] args) {

		// getInstance
		Currency currency = Currency.getInstance(Locale.US);
		System.out.println("Currency: " + currency.toString());
		System.out.println("Currency for given currency code INR: " + Currency.getInstance("INR"));

		// symbol
		System.out.println("Symbol: " + currency.getSymbol());
		System.out.println("Symbol for Locale: " + currency.getSymbol(Locale.ENGLISH));

		// getDefaultFractionalDigits
		System.out.println("Default fractional digits: " + currency.getDefaultFractionDigits());

		// getCurrencyCode
		System.out.println("Currency Code: " + currency.getCurrencyCode());

		// getDisplayName
		System.out.println("Display Name: " + currency.getDisplayName());

		// getNumericCode
		System.out.println("Numeric Code: " + currency.getNumericCode());

		// getAvailableCurrencies
		Set<Currency> allAvailableCurrencies = Currency.getAvailableCurrencies();
		System.out.println("**************************************************************");
		System.out.println("Available Currencies: ");
		for (Currency eachAvailableCurrency : allAvailableCurrencies) {
			System.out.println(eachAvailableCurrency);
		}
		System.out.println("**************************************************************");
	}

}

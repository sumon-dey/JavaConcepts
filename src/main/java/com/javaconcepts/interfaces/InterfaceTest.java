package com.javaconcepts.interfaces;

public class InterfaceTest {

	public static void main(String[] args) {

		IElementLocator locator;
		locator = new ChromeWebUIAutomation();
		System.out.println(locator.locateText());
		locator = new MobileUIAutomation();
		System.out.println(locator.locateText());
		System.out.println("**********************************************");
		IElementAction action;
		action = new ChromeWebUIAutomation();
		action.clickIcon();
		action = new MobileUIAutomation();
		action.clickIcon();
		System.out.println("**********************************************");

	}

}

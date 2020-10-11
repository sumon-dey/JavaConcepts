package com.javaconcepts.interfaces;

// This class implemented the abstract method of its superclass
public class ChromeWebUIAutomation extends WebUIAutomation {

	@Override
	public String locateText() {
		return "Web UI (Chrome) -> Text is located successfully in Chrome browser";
	}

}

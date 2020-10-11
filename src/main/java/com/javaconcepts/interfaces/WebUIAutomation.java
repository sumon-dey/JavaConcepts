package com.javaconcepts.interfaces;

// A class can implement multiple interfaces
// This class has to be declared abstract since it has not implemented the locateText() 
// method and expects it's subclasses to implement this
public abstract class WebUIAutomation implements IElementLocator, IElementAction {

	@Override
	public abstract String locateText();

	@Override
	public String locateLink() {
		return "Web UI -> Link is located successfully";
	}

	@Override
	public String locateRadioButton() {
		return "Web UI -> RadioButton is located successfully";
	}

	@Override
	public String locateIcon() {
		return "Web UI -> Icon is located successfully";
	}

	@Override
	public String locateCheckbox() {
		return "Web UI -> Checkbox is located successfully";
	}

	@Override
	public void typeText() {
		System.out.println("Web UI -> Text is typed successfully");
	}

	@Override
	public void clickLink() {
		System.out.println("Web UI -> Link is clicked successfully");
	}

	@Override
	public void clickRadioButton() {
		System.out.println("Web UI -> RadioButton is clicked successfully");
	}

	@Override
	public void clickIcon() {
		System.out.println("Web UI -> Icon is clicked successfully");
	}

	@Override
	public void clickCheckbox() {
		System.out.println("Web UI -> Checkbox is clicked successfully");
	}

}

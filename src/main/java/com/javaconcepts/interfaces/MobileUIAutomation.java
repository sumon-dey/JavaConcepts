package com.javaconcepts.interfaces;

// A class can implement multiple interfaces
public class MobileUIAutomation implements IElementLocator, IElementAction {

	@Override
	public String locateText() {
		return "Mobile UI -> Text is located successfully";
	}

	@Override
	public String locateLink() {
		return "Mobile UI -> Link is located successfully";
	}

	@Override
	public String locateRadioButton() {
		return "Mobile UI -> RadioButton is located successfully";
	}

	@Override
	public String locateIcon() {
		return "Mobile UI -> Icon is located successfully";
	}

	@Override
	public String locateCheckbox() {
		return "Mobile UI -> Checkbox is located successfully";
	}

	@Override
	public void typeText() {
		System.out.println("Mobile UI -> Text is typed successfully");
	}

	@Override
	public void clickLink() {
		System.out.println("Mobile UI -> Link is clicked successfully");
	}

	@Override
	public void clickRadioButton() {
		System.out.println("Mobile UI -> RadioButton is clicked successfully");
	}

	@Override
	public void clickIcon() {
		System.out.println("Mobile UI -> Icon is clicked successfully");
	}

	@Override
	public void clickCheckbox() {
		System.out.println("Mobile UI -> Checkbox is clicked successfully");
	}

}

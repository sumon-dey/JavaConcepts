package com.javaconcepts.interfaces;

public class InterfaceVariablesDemo {

	public static void main(String[] args) {
		AskMe askMe = new AskMe();
		Question question = new Question();
		askMe.answer(question.ask());
		askMe.answer(question.ask());
		askMe.answer(question.ask());
		askMe.answer(question.ask());
		askMe.answer(question.ask());
	}

}

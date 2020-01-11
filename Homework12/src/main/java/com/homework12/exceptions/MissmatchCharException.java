package com.homework12.exceptions;

public class MissmatchCharException extends Exception {
	public MissmatchCharException() {
		super("Вы ввели неправильное слово и проиграли");
	}
}

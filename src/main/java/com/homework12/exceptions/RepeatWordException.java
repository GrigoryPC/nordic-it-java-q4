package com.homework12.exceptions;

public class RepeatWordException extends Exception {
	public RepeatWordException() {
		super("Вы ввели повторное слово и проиграли");
	}
}

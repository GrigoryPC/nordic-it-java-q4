package com.homework12;

import java.util.HashSet;
import java.util.Scanner;

public class GameWordMain {
	public static void main(String... args) throws Exception {

		System.out.println("Добро пожаловать в \"Игру в слова\"!");
		System.out.println("Играют два игрока.");
		System.out.println("Нужно вводить слово из символов стартового слова");

		var scanner = new Scanner(System.in);
		var history = new HashSet<String>();

		System.out.println("Введите стартовое слово для игры");
		var chars = scanner.nextLine();
		var x = 0;

		while (x != 1) {
			System.out.println("Первый игрок введите слово :");
			var textFirst = scanner.nextLine();
			if ("".equals(textFirst)) {
				System.out.println("Вы ничего не ввели и проиграли");
				break;
			}
			if (checkContainsFirst(chars, textFirst)) {
				if (!history.contains(textFirst)) {
					history.add(textFirst);
				} else {
					System.out.println("Вы ввели повторное слово и проиграли");
					break;
				}
			} else {
				System.out.println("Вы ввели неправильное слово и проиграли");
				break;
			}

			System.out.println("Второй игрок введите слово :");
			var textSecond = scanner.nextLine();
			if ("".equals(textSecond)) {
				System.out.println("Вы ничего не ввели и проиграли");
				break;
			}
			if (checkContainsSecond(chars, textSecond)) {
				if (!history.contains(textSecond)) {
					history.add(textSecond);
				} else {
					System.out.println("Вы ввели повторное слово и проиграли");
					break;
				}
			} else {
				System.out.println("Вы ввели неправильное слово и проиграли");
				break;
			}
		}
	}

	private static boolean checkContainsFirst(String chars, String textFirst) {
		for (var i = 0; i < textFirst.length(); i++) {
			var c = textFirst.charAt(i);

			var index = chars.indexOf(c);
			if (index < 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkContainsSecond(String chars, String textSecond) {
		for (var i = 0; i < textSecond.length(); i++) {
			var c = textSecond.charAt(i);

			var index = chars.indexOf(c);
			if (index < 0) {
				return false;
			}
		}
		return true;
	}

}

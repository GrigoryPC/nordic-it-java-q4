package com.calculator4;

import java.util.Scanner;

public class calculator4 {

	public static void main(String[] args) {
		// CALCULATOR 4 homework (cycle)
		var scanner = new Scanner(System.in);

		System.out.println("Введите математическую операцию");
		var operaciya = scanner.nextLine();

		switch (operaciya) {
		case ("+"): {
			System.out.println("Вы ввели знак суммы");
			break;
		}
		case ("-"): {
			System.out.println("Вы ввели знак разности");
			break;
		}
		case ("*"): {
			System.out.println("Вы ввели знак умножения");
			break;
		}
		case ("/"): {
			System.out.println("Вы ввели знак деления");
			break;
		}
		case ("%"): {
			System.out.println("Вы ввели знак для получения остатка от деления");
			break;
		}
		case ("div"): {
			System.out.println("Вы ввели функцию для получения деления с десятичной частью");
			break;
		}
		case ("^"): {
			System.out.println("Вы ввели знак возведения в степень");
			break;
		}
		default: {
			var i = 1;
			while (i < 3) {
				System.out.println("Вы ввели недопустимую операцию, попробуйте еще раз");
				i = i + 1;
				operaciya = scanner.nextLine();
			}
			return;
		}
		}

		System.out.println("Введите число 1");
		var number1 = scanner.nextInt();

		System.out.println("Введите число 2");
		var number2 = scanner.nextInt();

		switch (operaciya) {
		case ("/"): {
			switch (number2) {
			case (0): {
				System.out.println("Деление на 0 запрещено");
				break;
			}
			default: {
				var resultat = number1 / number2;
				System.out.println("Результата равен " + resultat);
			}
			}
			break;
		}

		case ("+"): {
			var resultat = number1 + number2;
			System.out.println("Результата равен " + resultat);
			break;
		}
		case ("-"): {
			var resultat = number1 - number2;
			System.out.println("Результата равен " + resultat);
			break;
		}
		case ("*"): {
			var resultat = number1 * number2;
			System.out.println("Результата равен " + resultat);
			break;
		}
		case ("%"): {
			var resultat = number1 % number2;
			System.out.println("Результата равен " + resultat);
			break;
		}
		case ("div"): {
			switch (number2) {
			case (0): {
				System.out.println("Деление на 0 запрещено");
				break;
			}
			default: {
				var resultat = (double)number1 / (double)number2;
				System.out.println("Результата равен " + resultat);
			}
			}
			break;
		}
		case ("^"): {
			if (number2 == 0) {
				var resultat = 1;
				System.out.println("Результата равен " + resultat);
			} else {
				var resultat = number1;
				for (var n = 1; n < number2; n = n + 1) {
					resultat = resultat * number1;
				}
				System.out.println("Результата равен " + resultat);
			}
			break;
		}
		default: {
			System.out.println("Произошла ошибка в вычислениях");
		}
		}

	}

}

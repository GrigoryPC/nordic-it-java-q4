package com.calculator6;

import java.util.Scanner;

public class calculator6 {

	public static void main(String[] args) {
		// CALCULATOR 6 homework (methodcycle)
		var scanner = new Scanner(System.in);
		operaciyaRequest();
		var operaciya = scanner.nextLine();

		operaciyaCheck(operaciya);

		var number1 = requestNumber1(scanner);
		var number2 = requestNumber2(scanner);

		operaciyaVichisleniya(operaciya, number1, number2);
	}

	public static void operaciyaRequest() {
		System.out.println("Введите математическую операцию");
	}

	public static void operaciyaVichisleniya(String operaciya, int number1, int number2) {
		switch (operaciya) {
		case ("/"): {
			switch (number2) {
			case (0): {
				delenieNull();
				break;
			}
			default: {
				var resultat = number1 / number2;
				printResult(resultat);
			}
			}
			break;
		}
		case ("+"): {
			var resultat = number1 + number2;
			printResult(resultat);
			break;
		}
		case ("-"): {
			var resultat = number1 - number2;
			printResult(resultat);
			break;
		}
		case ("*"): {
			var resultat = number1 * number2;
			printResult(resultat);
			break;
		}
		case ("%"): {
			var resultat = number1 % number2;
			printResult(resultat);
			break;
		}
		case ("div"): {
			switch (number2) {
			case (0): {
				delenieNull();
				break;
			}
			default: {
				var resultat = (double) number1 / (double) number2;
				printResultDouble(resultat);
			}
			}
			break;
		}
		case ("^"): {
			operaciyaStepen(number1, number2);
			break;
		}
		default: {
			resultError();
		}
		}
	}

	public static void operaciyaCheck(String operaciya) {
		switch (operaciya) {
		case ("+"): {
			printSumma();
			break;
		}
		case ("-"): {
			printRaznost();
			break;
		}
		case ("*"): {
			printUmnozhenie();
			break;
		}
		case ("/"): {
			printDelenie();
			break;
		}
		case ("%"): {
			printOstatok();
			break;
		}
		case ("div"): {
			printDelenieDiv();
			break;
		}
		case ("^"): {
			printStepen();
			break;
		}
		default: {
			requestOperaciyaError();
			return;
		}
		}
	}

	public static void resultError() {
		System.out.println("Произошла ошибка в вычислениях");
	}

	public static void operaciyaStepen(int number1, int number2) {
		if (number2 == 0) {
			var resultat = 1;
			printResult(resultat);
		} else {
			var resultat = number1;
			for (var n = 1; n < number2; n = n + 1) {
				resultat = resultat * number1;
			}
			printResult(resultat);
		}
	}

	public static void printResultDouble(double resultat) {
		System.out.println("Результата равен " + resultat);
	}

	public static void printResult(int resultat) {
		System.out.println("Результата равен " + resultat);
	}

	public static void requestOperaciyaError() {
		System.out.println("Вы ввели недопустимую операцию, попробуйте еще раз");
	}

	public static void delenieNull() {
		System.out.println("Деление на 0 запрещено");
	}

	public static int requestNumber2(Scanner scanner) {
		System.out.println("Введите число 2");
		var number2 = scanner.nextInt();
		return number2;
	}

	public static int requestNumber1(Scanner scanner) {
		System.out.println("Введите число 1");
		var number1 = scanner.nextInt();
		return number1;
	}

	public static void printStepen() {
		System.out.println("Вы ввели знак возведения в степень");
	}

	public static void printDelenieDiv() {
		System.out.println("Вы ввели функцию для получения деления с десятичной частью");
	}

	public static void printOstatok() {
		System.out.println("Вы ввели знак для получения остатка от деления");
	}

	public static void printDelenie() {
		System.out.println("Вы ввели знак деления");
	}

	public static void printUmnozhenie() {
		System.out.println("Вы ввели знак умножения");
	}

	public static void printRaznost() {
		System.out.println("Вы ввели знак разности");
	}

	public static void printSumma() {
		System.out.println("Вы ввели знак суммы");
	}

}
package com.homework12zoo;

import java.util.HashSet;
import java.util.Scanner;
import com.homework12zoo.exceptions.NoInputException;
import com.homework12zoo.exceptions.WrongNumberCageException;

public class ZooMain {
  public static void main(String... args) throws Exception {


    System.out.println("Добро пожаловать в \"Планирование зоопарка\"!");
    System.out.println("Необходимо наполнить три варьера разными животными");
    System.out.println("Для каждого варьера определенный класс и количество животных");

    var scanner = new Scanner(System.in);
    var cage1 = new HashSet<String>();
    var cage2 = new HashSet<String>();
    var cage3 = new HashSet<String>();

    try {
      System.out.println("Напишите не более 4 млекопитающих для клетки номер 1");
      var name = scanner.nextLine();
      if (!"".equals(name)) {
        cage1(scanner, cage1, name);
      } else {
        System.out.println("Ввод животных для клетки 1 закончен");
      }
      System.out.println("Напишите не более 3 птиц для клетки номер 2");
      var name2 = scanner.nextLine();
      if (!"".equals(name2)) {
        cage2(scanner, cage2, name2);
      } else {
        System.out.println("Ввод животных для клетки 2 закончен");
      }

      System.out.println("Напишите не более 5 земноводных для клетки номер 3");
      var name3 = scanner.nextLine();
      if (!"".equals(name3)) {
        cage3(scanner, cage3, name3);
      } else {
        System.out.println("Ввод животных для клетки 3 закончен ");
      }

      System.out.println("Если хотите удалить животных из клетки, то выберите её номер от 1 до 3");

      var choose = scanner.nextInt();

      removeCageChoose(choose);

      remove1(scanner, cage1, choose);

      remove2(scanner, cage2, choose);

      remove3(scanner, cage3, choose);

    } catch (NoInputException ex) {
      System.out.println("Вы ничего не ввели");
    } catch (WrongNumberCageException ex) {
      System.out.println("Вы ввели неверный номер клетки");
    }
  }

  public static void removeCageChoose(int choose) throws Exception {
    if (choose > 4) {
      throw new WrongNumberCageException();
    }
  }

  private static void remove3(Scanner scanner, HashSet<String> cage3, int choose) throws Exception {
    if (choose == 3) {
      System.out.println("Напишите имя животного, которое хотите удалить из клетки 3");
      var nameZoo3 = scanner.nextLine();
      if (!"".equals(nameZoo3)) {
        cage3.remove(nameZoo3);
      } else {
        throw new NoInputException();
      }
    }
  }

  private static void remove2(Scanner scanner, HashSet<String> cage2, int choose) throws Exception {
    if (choose == 2) {

      System.out.println("Напишите имя животного, которое хотите удалить из клетки 2");
      var nameZoo2 = scanner.nextLine();
      if (!"".equals(nameZoo2)) {
        cage2.remove(nameZoo2);
      } else {
        throw new NoInputException();
      }
    }
  }

  private static void remove1(Scanner scanner, HashSet<String> cage1, int choose) throws Exception {
    if (choose == 1) {
      System.out.println("Напишите имя животного, которое хотите удалить из клетки 1");
      var nameZoo1 = scanner.nextLine();
      if (!"".equals(nameZoo1)) {
        cage1.remove(nameZoo1);
      } else {
        throw new NoInputException();
      }
    }
  }

  private static void cage3(Scanner scanner, HashSet<String> cage3, String name3) {
    for (var i = 0; i < 4; i++) {
      cage3.add(name3);
      name3 = scanner.nextLine();
      if ("".equals(name3)) {
        System.out.println("Ввод животных для клетки 3 закончен");
        return;
      }
    }
  }

  private static void cage2(Scanner scanner, HashSet<String> cage2, String name2) {
    for (var i = 0; i < 2; i++) {
      cage2.add(name2);
      name2 = scanner.nextLine();
      if ("".equals(name2)) {
        System.out.println("Ввод животных для клетки 2 закончен");
        return;
      }
    }
  }

  private static void cage1(Scanner scanner, HashSet<String> cage1, String name) {
    for (var i = 0; i < 3; i++) {
      cage1.add(name);
      name = scanner.nextLine();
      if ("".equals(name)) {
        System.out.println("Ввод животных для клетки 1 закончен");
        return;
      }
    }
  }
}

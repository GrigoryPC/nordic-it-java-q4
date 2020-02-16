package com.classwork.homework26;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework26Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Homework26Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    var scanner = new Scanner(System.in);

    System.out.println("Введите число для проверки");
    var a = scanner.nextInt();

    System.out.println(SimpleNumeric.isSimple(a));
  }
}

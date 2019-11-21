
package com.lesson14;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson14 {
  public static void main(String[] args) {
    // lesson 14

    var words = new ArrayList<String>();
    var scanner = new Scanner(System.in);

    var inputString = scanner.nextLine();
    while (!"".equals(inputString)) {
      words.add(inputString);
      inputString = scanner.nextLine();

    }

//    words.sort(new AlphabetComparator());
    words.sort(String.CASE_INSENSITIVE_ORDER);
    
    for (var word : words) {
      System.out.println(word);
    }
  }
}


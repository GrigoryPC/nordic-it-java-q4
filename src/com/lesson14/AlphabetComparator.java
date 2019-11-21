package com.lesson14;

import java.util.Comparator;

public class AlphabetComparator implements Comparator<String> {

  @Override
  public int compare(String a, String b) {
    var aLength = a.length();
    var bLength = b.length();
    
    return aLength < bLength ? -1:0;
    
//    if (aLength < bLength) {
//      return -1;
//    }
//  if (aLength > bLength) {
//  return 1;
//  }
//   
//    return 0;
//    return a.compareTo(b);
  }

}

package com.classwork.lesson26;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.classwork.homework26.SimpleNumeric;

@ExtendWith(SpringExtension.class)
public class SimpleNumericTests {

  @Test
  @DisplayName("Проверка для null")
  public void SimpleNumericTestNull() {
    boolean result = SimpleNumeric.isSimple(null);
    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка для числа 1")
  public void SimpleNumericTest1() {
    boolean result = SimpleNumeric.isSimple(1);
    assertThat(result).isFalse();
  }

  @Test
  @DisplayName("Проверка для числа 2")
  public void SimpleNumericTest2() {
    boolean result = SimpleNumeric.isSimple(2);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка для числа  3")
  public void SimpleNumericTest3() {
    boolean result = SimpleNumeric.isSimple(3);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка для числа 81")
  public void SimpleNumericTest81() {
    boolean result = SimpleNumeric.isSimple(81);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка для числа 371")
  public void SimpleNumeric371() {
    boolean result = SimpleNumeric.isSimple(371);
    assertThat(result).isTrue();
  }

  @Test
  @DisplayName("Проверка для нуля")
  public void SimpleNumericTest0() {
    boolean result = SimpleNumeric.isSimple(0);
    assertThat(result).isFalse();
  }

}

package br.com.costa.vinicius.api_spring_boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.costa.vinicius.utils.SimpleMath;

class SimpleMathTests {

   private SimpleMath math;

   @BeforeEach
   void setup() {
      math = new SimpleMath();
   }

   @Test
   @DisplayName("Should test sum operation")
   void sum() {
      double actual = math.sum(8D, 2D);
      double expected = 10D;

      assertEquals(expected, actual);
   }

   @Test
   @DisplayName("Should test subtract operation")
   void testSubtract() {
      double actual = math.subtract(5D, 3D);
      double expected = 2D;

      assertEquals(expected, actual);
   }

   @Test
   @DisplayName("Should test multiply operation")
   void testMultiply() {
      double actual = math.multiply(5D, 3D);
      double expected = 15D;

      assertEquals(expected, actual);
   }

   @Test
   @DisplayName("Should test divide operation")
   void testDivide() {
      double actual = math.divide(6D, 3D);
      double expected = 2D;

      assertEquals(expected, actual);
   }

   @Test
   @DisplayName("Should test divided by operation and throw exception")
   void testDivideByZero() {
      Exception exception = assertThrows(ArithmeticException.class, () -> {
         math.divide(5D, 0D);
      });

      assertEquals("Divisão por zero não é permitida.", exception.getMessage());
   }

   @Test
   @DisplayName("Should test power operation")
   void testPower() {
      double actual = math.power(2D, 3D);
      double expected = 8D;

      assertEquals(expected, actual);
   }
}

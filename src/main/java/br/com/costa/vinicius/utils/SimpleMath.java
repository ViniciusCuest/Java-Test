package br.com.costa.vinicius.utils;

public class SimpleMath {
   public Double sum(double num1, double num2) {
      return num1 + num2;
   }

   public Double subtract(double num1, double num2) {
      return num1 - num2;
   }

   public Double multiply(double num1, double num2) {
      return num1 * num2;
   }

   public Double divide(double num1, double num2) {
      if (num2 == 0) {
         throw new ArithmeticException("Divisão por zero não é permitida.");
      }
      return num1 / num2;
   }

   public Double power(double base, double exponent) {
      return Math.pow(base, exponent);
   }
}
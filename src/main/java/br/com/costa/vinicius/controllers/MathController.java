package br.com.costa.vinicius.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.costa.vinicius.utils.SimpleMath;

@RestController
public class MathController {
   SimpleMath math = new SimpleMath();

   private double parseDouble(String number) {
      try {
         return Double.parseDouble(number);
      } catch (NumberFormatException e) {
         throw new IllegalArgumentException("Parâmetro inválido: " + number);
      }
   }

   @GetMapping("/sum/{firstNumber}/{secondNumber}")
   public Double getEndpoint(
         @PathVariable String firstNumber,
         @PathVariable String secondNumber) {

      double n1 = Double.parseDouble(firstNumber);
      double n2 = Double.parseDouble(secondNumber);

      return math.sum(n1, n2);

   }

   @GetMapping("/subtract/{firstNumber}/{secondNumber}")
   public Double subtract(
         @PathVariable String firstNumber,
         @PathVariable String secondNumber) {
      return math.subtract(parseDouble(firstNumber), parseDouble(secondNumber));
   }

   @GetMapping("/multiply/{firstNumber}/{secondNumber}")
   public Double multiply(
         @PathVariable String firstNumber,
         @PathVariable String secondNumber) {
      return math.multiply(parseDouble(firstNumber), parseDouble(secondNumber));
   }

   @GetMapping("/divide/{firstNumber}/{secondNumber}")
   public Double divide(
         @PathVariable String firstNumber,
         @PathVariable String secondNumber) {
      return math.divide(parseDouble(firstNumber), parseDouble(secondNumber));
   }

   @GetMapping("/power/{base}/{exponent}")
   public Double power(
         @PathVariable String base,
         @PathVariable String exponent) {
      return math.power(parseDouble(base), parseDouble(exponent));
   }
}

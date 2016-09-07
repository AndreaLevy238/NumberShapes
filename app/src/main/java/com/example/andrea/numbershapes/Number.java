package com.example.andrea.numbershapes;

public class Number
{
   private int number;

   public Number(int number)
   {
      this.number = number;
   }

   public boolean isTriangular()
   {
      if (number < 1)
      {
         return false;
      }
      int x = 1;
      int triangularNumber = 1;
      while (triangularNumber < number)
      {
         x++;
         triangularNumber += x;
      }
      return number == triangularNumber;
   }

   public boolean isSquare()
   {
      if (number < 0)
      {
         return false;
      }
      Double squareRoot = Math.sqrt(number);
      return squareRoot == Math.floor(squareRoot);
   }

   public String testNumber()
   {
      boolean isTriangular = isTriangular();
      boolean isSquare = isSquare();
      if (isSquare && isTriangular)
      {
         return " is both triangular and square.";
      }
      if (isSquare)
      {
         return " is only square.";
      }
      if (isTriangular)
      {
         return " is only triangular.";
      }
      return " is neither triangular nor square.";
   }

}

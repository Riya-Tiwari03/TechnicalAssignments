import java.util.*;

public class Multiple {
  
  // mrthod to check if a number is multiple of 3 or 5 or both
    public static void fizzBuzz(int n){
      
      // for multiples of 3
      
      if(n % 3 == 0){
        System.out.println("Fizz");
      }
      
      // for multiples of 5
      
      if(n % 5 == 0){
        System.out.println("Buzz");
      }
      
      //numbers which are multiples of both 3 and 5
      
      if(n%3 == 0 && n%5==0){
        System.out.println("FizzBuzz"); 
      }
      
    }
  
  //main method
    public static void main(String[] args) {
      // loop to check for every number
      for(int i = 1; i <= 100; i++){
        // calling the method to check the number
        fizzBuzz(i);
      }
      
  }
}
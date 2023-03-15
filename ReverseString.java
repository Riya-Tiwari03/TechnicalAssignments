import java.util.*;
  
  class ReverseString {
        // Main Method
      public static void main(String[] args)
      {
        // Scanner to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        // taking input
        String s = input.nextLine();
        
        //converting string to character array
        char[] ch = s.toCharArray();
  
        // printing the character array in reverse
        for (int i = ch.length - 1; i >= 0; i--)
            System.out.print(ch[i]);
    
      }
  }

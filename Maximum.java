import java.util.*;

class Maximum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }
        
        int max = arr[0];
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum of all the elements in this array is: " + max);
        
    }
}
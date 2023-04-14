import java.util.Scanner;
public class array {
    public static void main(String[] args) {        
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
        //Initialize array         
        int temp = 0;    
             
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}

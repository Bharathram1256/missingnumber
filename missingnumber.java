import java.util.Scanner;

public class missingnumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        try {
            for(int i=0;i<size1;i++){
                arr1[i]=sc.nextInt();
            }
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("a problem.");

        }

        // sample input
        // int[] arr1 = {1,3,4,5,6,8};   
        //code to display the arr1.
        for(int k = 0;k<arr1.length;k++){
            if(k==arr1.length-1){
                System.out.print(arr1[k]);
            }
            else{
                System.out.print(arr1[k]+",");
            }
        }

        int miss = arr1[arr1.length-1]-arr1.length;// this is for the size of the numbers that are missed in the arr1.initializing it with 0.
        int arr2[] = new int[miss]; //this is initilizing the arr2.

        //loop will continue until (last element of the arr1-1) times
        try {    
        for(int i = 0,j = 0; i<arr1.length;i++) {
            if(arr1[i]==i+1){
                System.out.println("this"+i+"is in order.");

            }
            else{

                arr2[j]=i+1;
                j+=1;
            }
        } 
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("array is not in ascending order");
        }
        //code to display the arr2.
        for(int k=0;k<miss;k++){
            System.out.println(arr2[k]);
        }
        
        

    }
}




// Question 2: Find missing numbers in array -

// Skill Mapping: Basic

// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

// Sample input: arrNum = {1, 2, 4, 5, 6}

// Output: 3

// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

// Output: 4, 7, 9, 12, 13
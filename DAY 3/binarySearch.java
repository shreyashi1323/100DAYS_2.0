import java.util.Arrays;
import java.util.Scanner;
public class binarySearch {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
      }

      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }

      System.out.println("enter the no you want to search:");
      int key=sc.nextInt();
      System.out.println("index for keu is:" + binarySearch(arr,key));
    }
  

     public static int binarySearch(int arr[],int key){ 
      int start=0,end=arr.length-1;
      
      while(start<=end){
        int  mid =(start+end)/2;

        //comparisons
        if(arr[mid]==key){
           return mid;
        }

        else if(arr[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

      }
      return -1;
    }

    
}

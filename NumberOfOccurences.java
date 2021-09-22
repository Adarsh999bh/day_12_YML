
import java.util.Scanner;
public class NumberOfOccurences{
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] array=new int[n];//array to store elements
        int[] visited=new int[n];//visited elements
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            visited[i]=0;
        }
        int count;
        for(int i=0;i<n;i++){
            count=0;
            //check if the element is already visited
            if(visited[i]!=1){
                for(int j=0;j<n;j++){
                    if(array[i]==array[j]){
                        //if found same elements incriment count also set visited of that particular index to 1
                        count+=1;
                        visited[j]=1;
                    }
                }
                //set visited of i as 1 cuz its already visited
                visited[i]=1;
                System.out.println("element "+array[i]+" occurred "+count+" times.");
            }
        }
    }
}
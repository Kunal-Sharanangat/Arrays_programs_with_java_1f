
import java.util.*;
public class Cal_sum_array_element {

    public static void main(String args[])
    {
        int arr[]=new int[5],i,sum=0;
        Scanner S=new Scanner(System.in);
        System.out.println("enter five values in array:");

        for(i=0;i<arr.length;i++)
        {
            arr[i]=S.nextInt();
        }

        for(i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
        }


        System.out.println("Sum of array elements=" +sum);

    }
    
}

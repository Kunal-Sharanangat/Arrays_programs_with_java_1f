import java.util.*;
public class Find_maxValue_withought_Sorting {
        public static void main(String args[])
        {
            int arr[]=new int[5],i,max;

            Scanner s=new Scanner(System.in);
            System.out.println("enter five values in array:");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=s.nextInt();
            }
              
            max=arr[0];
            for(i=0;i<arr.length;i++)
            {
                   if(arr[i]>max)
                   {
                    max=arr[i];
                   }
            }

            System.out.println("Maximum value from arrays is=" +max);



        }
    }
    

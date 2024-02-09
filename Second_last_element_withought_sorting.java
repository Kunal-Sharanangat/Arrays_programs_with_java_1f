import java.util.*;
public class Second_last_element_withought_sorting {
        public static void main(String args[])
    {
        int arr[]=new int[5],i,seclast=0;

        System.out.println("enter five values in the arrays:");
        Scanner s=new Scanner(System.in);

        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        int max=arr[0];                                     //All code will run properly if we 
                                                            //gives 5 4 3 2 1  then it gives output is 0 that is not proper;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {   
                seclast=max;
                max=arr[i];
            }
        }

        System.out.println("second last element is= "+ seclast);
    }
}


import java.util.*;
public class Second_largest_element_withought_sorting {
    public static void main(String args[])
    {
        int arr[]=new int[5],i,j,temp,seclast;

        System.out.println("enter five values in the arrays:");
        Scanner s=new Scanner(System.in);

        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        int max=arr[0];

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>=max)
            {   
                max=arr[i];
            }
        }
        
        seclast=1;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>seclast && arr[i]!=max )
            {
                seclast=arr[i];
            }
        }

        System.out.println("Second last element is= " +seclast);
  
    }

    
}

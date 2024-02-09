import java.util.*;
public class Second_largest_Element_form_the_arrays {

  
    public static void main(String args[])
    {
        int arr[]=new int[5],i,j,seclast,temp;

        Scanner s=new Scanner(System.in);           //created Scanner class object
         
        System.out.println("enter five elements in the array:");

        for(i=0;i<arr.length;i++)         //incerted elements in the arrays from user
        {
            arr[i]=s.nextInt();
        }

        for(i=0;i<arr.length;i++)           //sorted Array elements
        {
            for(j=i;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(i=arr.length-1;i>=0;i--)            //Traversed arrays from reversed direction  
        {
            if(arr[i]!=arr[arr.length-1])    //Logic for second last element
            {
                System.out.println("Second last element of the arrays is ="+arr[i]);

                break;
            }
        }
    }
     
    }
    


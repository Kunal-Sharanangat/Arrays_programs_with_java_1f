import java.util.*;
public class Search_value_and_delete {
    public static void main(String args[])
    {
        int arr[]=new int[6];
        int i,j,value,index;

        Scanner s=new Scanner(System.in);
        System.out.println("enter five values in the arrays:");

        for(i=0;i<arr.length-1;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println("enter index in which we want to insert the value:");
        index=s.nextInt();

        System.out.println("enter the value for index:");
        value=s.nextInt();

        for(i=arr.length-1;i>=0;i--)
        {
           
            arr[i]=arr[i-1];

            if(i==index)
            {
                arr[i]=value;

                break;

            }

        }

        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        

    }
    
}

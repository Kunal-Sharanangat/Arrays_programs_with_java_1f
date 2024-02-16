import java.util.*;
class Reverse
{
     public int arr[];
    void RevFun(int arr[])
    {
        int i,size,topf,topl,temp;

        topf=0;
        topl=arr.length-1;
        size=arr.length/2;

        for(i=0;i<size;i++)
        {
            if(topf!=topl)
            {
                    temp=arr[topf];
                    arr[topf]=arr[topl];  //performed swapping
                    arr[topl]=temp;

                    topf++;   //increased topfirst value by one
                    topl--; //dereased toplast value by one;

            }
        }

        System.out.println("Array After Reversed:");

        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);        // this will print elemets
        }
        


    }
}
public class ReverseArrayElement {
    public static void main(String args[])
    {
        int arr[]=new int[5],i;

        Scanner s=new Scanner(System.in);
        System.out.println("enter five elements intthe array:");

        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();  //Read input from user
        }

        Reverse R=new Reverse(); //created object
        
        R.RevFun(arr);  //function called
    }
    
}

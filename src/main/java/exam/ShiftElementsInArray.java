package exam;
import java.util.*;


public class ShiftElementsInArray {

  public void shift() {
    Scanner sc= new Scanner(System.in);
    int i,n,temp;
    System.out.println("enter number of elements ");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    System.out.println("original array");
        for(i=0;i<n;i++)
        {
        System.out.println(arr[i]+"");
        }
          temp=arr[n-1];
          for(i=n-1;i>0;i--)
          {
          arr[i]=arr[i-1];
            
          }
          arr[0]=temp;
              System.out.println("New array after shifting");
          for(i=0;i<n;i++)
          {
                    System.out.println(arr[i]+"");


        }

    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

  
  }
    public static void main(String args[])
    {
      ShiftElementsInArray s=new ShiftElementsInArray();
      s.shift();

}
  }

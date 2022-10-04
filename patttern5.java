import java.util.Scanner;

public class patttern5 {
    public static void main(String args[])
    {  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number ");
     int N =sc.nextInt();//It is the number to calculate pattern   
     sc.close(); 
     for(int i=1; i<=N; i++)
     {
         for(int j=1; j<=i; j++)
         {
            System.out.print(i);
         }
         System.out.println("");
     }
    }  
}

/* 
 Input = 5
 Output =
1
22
333
4444
55555

*/

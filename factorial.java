import java.util.Scanner;

class factorial{  
    public static void main(String args[])
    {  
     Scanner sc = new Scanner(System.in);
     int i,fact=1;  
     System.out.println("Enter a number in which you have to find Factorial");
     int num=sc.nextInt();//It is the number to calculate factorial   
     sc.close(); 
     if((num==0)||(num<0))
     {
        System.out.println("Factorial is 1");    
     }
     else{
     for(i=1;i<=num;i++)
     {    
         fact=fact*i;         
     }
     System.out.println("Factorial of "+num+" is: "+fact);
    }
    
    }  
   }  
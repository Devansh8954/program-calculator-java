import java.util.Scanner;

class totalsalary{  
    public static void main(String args[])
    {  
     Scanner sc = new Scanner(System.in);
     int basic,allow;
     float totalSalary,hra,da,pf;
     char grade;
     System.out.println("Enter a number");
     basic = sc.nextInt();
     hra = (20/100)*basic;
     da = (50/100)*basic;
     pf = (11/100)*basic;
     
     System.out.println("Enter a character");
     grade = sc.next().charAt(0);
     sc.close();
     if(grade == 'A')
     {
         allow = 1700;
     }
     else if(grade == 'B')
     {
         allow = 1500;
     }
     else {
         allow = 1300;
     }
     
     totalSalary = basic + hra + da + allow - pf;
     totalSalary = java.lang.Math.round(totalSalary);
     System.out.println(totalSalary);
     
    
    }  
   }  
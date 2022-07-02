import java.util.Scanner;
public class Calculator 
{
   double num1;
   double num2;
   double ans;
   char op;
   
   public void asign()
   {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter two numbers: ");
         num1 = sc.nextDouble();
         num2 = sc.nextDouble();
         System.out.println("Enter an operator (+, -, *, /, %): ");
         op = sc.next().charAt(0);
         sc.close();
   }
   public void cond()
   {
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-':
         if(num1>num2)
         {
            ans = num1 - num2;
         } 
         else{
            ans = num2 - num1;
         }
            break;
         case '*': ans = num1 * num2;
            break;
         case '/':
         if(num1>num2)
         {
            ans = num1 / num2;
         } 
         else{
            ans = num2 / num1;
         }
            break;
            case '%':
            ans = num1 % num2;
            break;

      default: System.out.println("Error! Enter correct operator");
         return;
      }

         System.out.println("The result of the input is as given below :");
       if(num1>num2){
         System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
         }
         else{
            System.out.println(num2 + " " + op + " " + num1 + " = " + ans);
         }
   }
      
   public static void main(String[] args)
   {
      Calculator obj = new Calculator();
      obj.asign();
      obj.cond();

   }
}   
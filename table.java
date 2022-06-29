import java.util.Scanner;
public class table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //It is the number to calculate
        System.out.println("Enter a number to find Table");
        int num = sc.nextInt();
        if(num<=0)
        {
            System.out.println("Error! Please Enter Correct number");
        }
        else {
        for(int i=1; i<=10; i++)
        {
            int tab = num*i;
            System.out.println(num+"*"+i+"="+tab);
        }
     }
    }

    public void asign() {
    }

    public void Condition() {
    }
}

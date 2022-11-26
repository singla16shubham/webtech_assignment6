import java.util.*;
class checker{
    void Multiply(int first,int second) {
        try {
             if(first==0||second==0)
             {
                throw new ArithmeticException("one Number is zero ");
             }

            int ans = first * second;
            System.out.println(ans);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
    void Division(int first,int second) {
        try {
            if(first==0||second==0)
            {
               throw new ArithmeticException("either one or both Numbers is/are zero ");
            }
            int ans = first / second;
            System.out.println(ans);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
    }
}

public class ques1 {

    public static void main(String args[])
    {
        checker c=new checker();
        Scanner sc = new Scanner(System.in);
		System.out.print("Input first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input second number : ");
		int num2 = sc.nextInt();
        c.Multiply(num1, num2);
        c.Division(num1, num2);
        sc.close();
    }
    
}

import java.util.*;
class checker2{
    void Add(int first,int second) {
       
            try {

                if (first >= 0 && second >= 0) {
                    System.out.println(first + second);
                } 
                else{
                    throw new ArithmeticException("Numbers Shoud be positive");
                }
                
            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException);
            }
        
    }
    

    void Subtract(int first,int second) {
        try {

            if (first >= 0 && second >= 0) {
                System.out.println(first - second);
            } 
            else{
                throw new ArithmeticException("Numbers Shoud be positive");
            }
            
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
}
}
public class ques2 {
public static void main(String args[])
{
    checker2 obj=new checker2();
    Scanner sc = new Scanner(System.in);
		System.out.print("Input first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input second number : ");
		int num2 = sc.nextInt();
    obj.Add(num1,num2);
    obj.Subtract(num1, num2);
    sc.close();

}

    
}

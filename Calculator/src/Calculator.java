import java.util.*;
class Operation
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public int mod(int a,int b)
	{
		try {
		return a%b;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			return 0;
		}
	}
}
public class Calculator {
public static void main(String args[])
{
	
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter which operation you want to perform");
	System.out.println("+, -, *, /, %");
	char operator=sc.next().charAt(0);
	Operation o=new Operation();
	switch(operator) {
	case '+':
		System.out.println("The addition is: "+o.add(a,b));
		break;
	case '-':
		System.out.println("The subtraction is: "+o.sub(a,b));
		break;
	case '*':
		System.out.println("The multiplication is: "+o.mul(a,b));
		break;
	case '/':
		System.out.println("The division is: "+o.div(a,b));
		break;
	case '%':
		System.out.println("The modulo is: "+o.mod(a,b));
		break;
	default:
		System.out.println("Enter correct operator");
	}
}
}

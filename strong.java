public class strong
{
    // Function to calculate factorial of a number
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is strong
    public static boolean isStrong(int num)
    {
        int originalNum = num;
        int sumOfFactorials = 0;
        while (num > 0)
        {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }
        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args)
    {
        System.out.println("Strong numbers from 1 to 5000 are:");
        for (int i = 1; i <= 5000; i++)
        {
            if (isStrong(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
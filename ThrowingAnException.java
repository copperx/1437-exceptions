public class ThrowingAnException
{
    public static void main(String[] args)
    {

    }

    public static double average(double sum, int howMany) {
        if(howMany == 0) {
            // Cannot divide by zero! Let's throw an exception
            throw new RuntimeException("Cannot divide by zero.");
        }
        return sum / howMany;
    }
}
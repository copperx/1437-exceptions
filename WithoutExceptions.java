public class WithoutExceptions
{
    public static void main(String[] args)
    {
        int[] a = {45, 23, 65};
        sum(null);
        
    }

    public static int sum(int[] array) 
    {
        int sum = 0;
        for(int element : array) {
            sum += element;
        }
        return sum;
    }
}
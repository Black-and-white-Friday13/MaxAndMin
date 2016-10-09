import java.io.IOException;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) throws IOException
    {
        Random random = new Random();
        int  maximum = 0;
        int  minimum = 0;
        int[] mass = new int[20];

        for (int i = 0; i < mass.length; i++)
        {
            mass[i] = random.nextInt(100);
        }
        System.out.println(mass.length);
        for (int j : mass)
        {
            System.out.print(j + " ");
        }
        int a = mass[0];
        for (int i = 1; i < mass.length; i++)
        {
            if (mass[i] > a)
            {
                a = mass[i];
                maximum = a;
            }

        }
        for (int i = 1; i < mass.length; i++)
        {
            if (mass[i] < a)
            {
                a = mass[i];
                minimum = a;
            }

        }
        System.out.println();
        System.out.println(maximum);
        System.out.println(minimum);
    }
}

import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int arr_ut[] = new int[10];
        int arr_mt[] = new int[10];

        for (int i=0;i<10;i++){
            arr_ut[i] = rnd.nextInt(0,15);
            arr_mt[i] = (int)(Math.random() * 15);
            System.out.println(arr_ut[i]+" "+arr_mt[i]);
        }

        Arrays.sort(arr_mt);
        Arrays.sort(arr_ut);
        System.out.println("Sorted: ");
        for (int i=0;i<10;i++){
            System.out.println(arr_ut[i]+" "+arr_mt[i]);
        }


    }
}
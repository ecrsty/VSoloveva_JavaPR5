package task1;

import java.util.ArrayList;
import java.util.Random;

public class base {

//    public static double task4(int[] mas)
//    {
//        double av_geom = 1;
//        double av_cnt = 0;
//        for (int i = 0; i < mas.length; i+=2) {
//            av_cnt++;
//            av_geom *= Math.abs(mas[i]);
//        }
//        return Math.pow(av_geom, 1/av_cnt);
//    }

    public static void main(String[] args) {
        int n = (5 + 1 + 2 + 5)*2;
        int[] mas = new int[n];

        // task 1
        int z = 0;
        int cnt_z = 0;

        for (int i = 0;i < n; i++)
        {
            int rnd = new Random().nextInt(-100, 101);
            mas[i] = rnd;
            z += rnd;
        }

        z = z / n;

        // task 2
        int min = mas[0], max = mas[0];

        // task 3
        int del_num = 0;

        // task 4
        double av_geom = 1;
        double av_cnt = 0;

        for (int i = 0; i < n; i++)
        {
            System.out.print(mas[i]+" ");

            if (mas[i] > z)
                cnt_z++;

            if (mas[i] < min)
                min = mas[i];
            if (mas[i] > max)
                max = mas[i];

            if (mas[i] % (i+1) == 0)
                del_num++;

            if (i % 2 == 0) {
                av_cnt++;
                av_geom *= Math.abs(mas[i]);
            }
        }

        av_geom = Math.pow(av_geom, 1/av_cnt);

        System.out.println("\nСреднее значение чисел в массиве z = "+z);
        System.out.println("Чисел в массиве, превышающих z: "+cnt_z);
        System.out.println("Разность между наибольшим и наименьшим значением: "+(max-min));
        System.out.println("Количество элементов, которые без остатка делятся на собственный номер: "+del_num);
        System.out.println("Среднее геометрическое элементов, стоящих на четных позициях: "+av_geom);
    }
}

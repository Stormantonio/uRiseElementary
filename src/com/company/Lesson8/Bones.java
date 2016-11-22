package com.company.Lesson8;

/**
 * Created by Anton on 22.11.2016.
 * Попробовать посчитать какая сумма баллов  2-х игральных  костей (кубиков от 1 до 6) , выпадает чаще всего.
 */
public class Bones {
    public static void main(String[] args) {
        int[] sum = new int[12];
        int count = 0;
        int maxSum = 0;
        int maxCount = 0;

        for (int j = 1; j < sum.length; j++) {
            for (int i = 0; i < 1000000; i++) {
                int boneValue1 = (int) (1 + Math.random() * 6);
                int boneValue2 = (int) (1 + Math.random() * 6);
                if ((j + 1) == boneValue1 + boneValue2) {
                    count++;
                }
            }
            sum[j] = count;
            count = 0;
        }
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > maxSum) {
                maxSum = sum[i];
                maxCount = i + 1;
            }
            System.out.println("Сумма балов " + (i + 1) + " - " + sum[i] + " раз");
        }
        System.out.println("Чаще всего выпадает сумма балов: " + maxCount);


        // без массива тратится больше времени
        /*int count = 0;
        int maxSum = 0;
        int maxCount = 0;
        int n = 12;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 1000000; j++) {
                int boneValue1 = (int) (1 + Math.random() * 6);
                int boneValue2 = (int) (1 + Math.random() * 6);
                if (i == boneValue1 + boneValue2) {
                    count++;
                }
            }
            System.out.println(i + " = " + count);
            if (count > maxSum){
                maxSum = count;
                maxCount = i;
            }
            count = 0;
        }
        System.out.println(maxCount);*/
    }
}

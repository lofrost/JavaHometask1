import java.util.Scanner;

//https://github.com/lofrost/JavaHometask1
public class Main {
    public static void main(String[] args){
        //3

        Scanner sc = new Scanner(System.in);
        int i;
        int summa = 0;
        int[] mas = {0,1,2,3,4,5,6,7,8,9,10};
        for (i=0;i<mas.length;i++){
            System.out.print(mas[i] + " ");
            summa += i;
        }

        int avg = summa/mas.length;
        System.out.println("\nСумма элементов равна: " + summa);
        System.out.println("\nСреднее арифметическое элементов: " + avg);
        // 4
        for (i=0;i<mas.length;i++){
            System.out.print("\nВведите "+ i +" элемент массива: ");
            if (sc.hasNextInt()){
                mas[i] = sc.nextInt();
            }
        }
        i = 0;
        summa = 0;
        int min = mas[0], max = mas[0];
        do{
            if (mas[i] > max){
                max = mas[i];
            }
            else if(mas[i] < min){
                min = mas[i];
            }
            summa += mas[i++];

        } while(i < mas.length);
        System.out.println("Сумма: " + summa + "\nМаксимальное число: "+ max + "\nМинимальное число: " + min);


        // 5

        for (String str: args){
            System.out.print("\nargument: " + str);
        }
        // 6
        float j;
        for (j=1; j <= 10; j++){
            System.out.format("%.3f ", 1/j);
        }
        // 7
        System.out.println("\n" + fact(5));

    }

    public static int fact(int num){
        if (num == 0){
            return 1;
        }
        int otv = 1;
        for (j=1; j<=num; j++){
            int otv *= j;
        }
        return num;

    }
}

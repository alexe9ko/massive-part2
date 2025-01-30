import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("massive2");
        System.out.println(" задача 1");


        int[] ints3 = {1, 3, 4, 56, 7};
        int result = 0;
        for (int i = 0; i < ints3.length; i++) {
            result += ints3[i];
        }
        System.out.println(" Сумма трат за месяц составила "+result+" рублей");

        System.out.println("задача 2");

        int[] ints4 = {1, 3, 4, 56, 7};
        Arrays.sort(ints4);
        System.out.println(Arrays.toString(ints4));
        if (ints4.length >0) {
            System.out.println(" максимальное значение " + ints4[ints4.length - 1]);
            System.out.println(" минимальное значение " + ints4[0]);
        }
        else {
            System.out.println("max и min не существует");
        }
        System.out.println(" задача 3");

        double avarge = (double) result / ints3.length;
        System.out.printf("средняя сумма затрат за месяц составила %.2f рублей", avarge);
        System.out.println();
        System.out.println("задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i == 0; i --) {
            System.out.println(reverseFullName[i]);
        }


        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }

}
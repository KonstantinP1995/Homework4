public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        //Задача 1
        int i = 0;

        while (i <= 9) {
            i++;
            System.out.printf(i + " ");
        }

        System.out.println("\n");

        for (; i > 0; i--) {
            System.out.printf(i + " ");
        }
        System.out.println("\n");
    }


    public static void task2() {
        //Задача 2
        int i = 1;

        for (int day = 0; day <= 31; day++) {
            if ((day - i) % 7 == 0) {
                System.out.println("Сегодня пятница " + day + " -e число, нужен отчет");
            }
            }
        System.out.println("\n");
            }

    public static void task3() {
        //Задача 3

        int past = 1822;
        int future = 2122;
        int yearNow = 2022;

        while (past < yearNow) {
            if (past % 79 == 0) {
                System.out.println(past);
            }
            past++;
        }

        while (yearNow < future){
            if (yearNow % 79 == 0) {
                System.out.println(yearNow);
            }
            yearNow++;
        }




    }


}

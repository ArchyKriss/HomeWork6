public class Main {
    public static void main(String[] args) {
        //task1
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        //task2
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }

        //task3
        for(int i = 0; i<=17; i=i+2){
            System.out.println(i);
        }

        //task4
        for(int i = 10; i>=-10; i--){
            System.out.println(i);
        }

        //task5
        for(int i = 1904; i<=2096; i=i+4){
            System.out.println(i+" год является високосным");
        }

        //task6
        for(int i = 7;i<=98;i=i+7){
            System.out.println(i);
        }

        //task7
        for(int i = 1; i<=512;i=i*2){
            System.out.println(i);
        }

        //task8
        int sum = 0;
        int money = 29000;
        for(int i = 1; i<=12;i++){
            sum+=money;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum);
        }

        //task9
        double sum2 =0;
        int money2 = 29000;
        double percent = 1.01;
        for(int i = 1; i<=12; i++){
            sum2 = sum2 * percent + money2;
            System.out.println("Месяц "+i+", сумма накоплений равна "+sum2);
        }

        //task10
        int number = 2;
        for(int i = 1; i<=10; i++) {
            System.out.println(number+"*"+i+"="+(number*i));

        }

    }
}
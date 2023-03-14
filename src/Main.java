public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();



    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int nose = 1;
        System.out.println("Значение переменной int с типом nose равно " + nose);
        byte paper = 2;
        System.out.println("Значение переменной byte с типом paper равно " + paper);
        short men = 4;
        System.out.println("Значение переменной short с типом men равно " + men);
        long film = 300;
        System.out.println("Значение переменной long с типом film равно " + film);
        float fanta = 1.5F;
        System.out.println("Значение переменной float с типом fanta равно " + fanta);
        double cheese = 2.6;
        System.out.println("Значение переменной double с типом cheese равно " + cheese);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        float a = 27.12F;
        long b = 987_678_965_549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte j = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short paper = 480;
        short paperForStudent = (short) (paper / (classLP + classAS + classEA));
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte output1 = 16;
        byte outputTime1 = 2;
        byte outputTime2 = 20;
        short outputTime3 = 1440;
        short outputTime4 = 4320;
        int outputTime5 = 43200;
        int outputPerMinute = output1 / outputTime1;
        int output2 = outputTime2 * outputPerMinute;
        System.out.println("За " + outputTime2 + " машина произвела " + output2 + " штук бутылок");
        int output3 = outputTime3 * outputPerMinute;
        System.out.println("За " + outputTime3 + " машина произвела " + output3 + " штук бутылок");
        int output4 = outputTime4 * outputPerMinute;
        System.out.println("За " + outputTime4 + " машина произвела " + output4 + " штук бутылок");
        int output5 = outputTime5 * outputPerMinute;
        System.out.println("За " + outputTime5 + " машина произвела " + output5 + " штук бутылок");

    }

    public static void task5 () {
        System.out.println("Задача 5");
        short allBanks = 120;
        short banksWPerClass = 2;
        short banksBPerClass = 4;
        int classes = (allBanks / (banksBPerClass + banksWPerClass));
        int banksW = banksWPerClass * classes;
        int banksB = banksBPerClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + banksW + " банок белой краски и " + banksB + "  банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        short weightBanana = 80;
        int milk = 2;
        int weightMilk = 105;
        int iceCream = 2;
        int weightIC = 100;
        int egg = 4;
        int weightEgg = 70;
        int allWeight = ((bananas * weightBanana) + (milk * weightMilk) + (iceCream * weightIC) + (egg * weightEgg));
        System.out.println("Вес завтрака " + allWeight + " в граммах");
        float allWeightKg = (allWeight / 1000F);
        System.out.println("Вес завтрака в кг " + allWeightKg);



    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weight = 7;
        float weightPerDay1 = 0.25F;
        float weightPerDay2 = 0.5F;
        float day1 = weight / weightPerDay1 ;
        float day2 = weight / weightPerDay2;
        System.out.println("Дней понадобится в первом случае " + day1 + " во втором случае " + day2);
    }
    public static void task8 (){
        System.out.println("Задача 8");
        int salaryM1 = 67760;
        int salaryD1 = 83690;
        int salaryK1 = 76230;
        float increace = 0.1F;
        float increaceM = salaryM1 * increace;
        int salaryM2 = (int) (salaryM1 + increaceM);
        int differenceM = (int) (increaceM * 12);
        System.out.println("Маша будет получать в месяц " + salaryM2 + " рублей. годовой доход вырос на " + differenceM + " рублей");
        float increaceD = salaryD1 * increace;
        int salaryD2 = (int) (salaryD1 + increaceD);
        int differenceD = (int) (increaceD * 12);
        System.out.println("Денис будет получать в месяц " + salaryD2 + " рублей. годовой доход вырос на " + differenceD + " рублей");
        float increaceK = salaryK1 * increace;
        int salaryK2 = (int) (salaryK1 + increaceK);
        int differenceK = (int) (increaceK * 12);
        System.out.println("Кристина будет получать в месяц " + salaryK2 + " рублей. годовой доход вырос на " + differenceK + " рублей");


    }
}
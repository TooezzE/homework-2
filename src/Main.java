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

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeight = boxer1Weight + boxer2Weight;
        System.out.println(boxersWeight);
        var boxersWeightDifference = boxer2Weight - boxer1Weight;
        System.out.println(boxersWeightDifference);
    }

    public static void task7() {
        System.out.println("Задача 7");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var boxersWeightDifference = boxer2Weight - boxer1Weight;
        System.out.println(boxersWeightDifference);
        var boxersWeightDifference2 = boxer2Weight % boxer1Weight;
        System.out.println(boxersWeightDifference2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var allWorkTime = 640;
        var everyEmployeesWork = 8;
        var employeesCount = allWorkTime / everyEmployeesWork;
        System.out.println("Всего работников в компании - " + employeesCount + " человек.");
        employeesCount = employeesCount + 94;
        allWorkTime = everyEmployeesWork * employeesCount;
        System.out.println("Если в компании работает " + employeesCount + " человек, то всего " + allWorkTime + " часов работы может быть поделено между сотрудниками.");

    }
}


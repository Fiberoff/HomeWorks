package HWL1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        printColor();
        printColor();
        checkSumSign();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    }
    public static void checkSumSign() {
        int a =747;
        int b =333;

        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
int value = -247;
if (value<=0) {
    System.out.println("Красный");
}
if (value>=0 && value<=100){
    System.out.println("Желтый");
}
if (value>=101){
    System.out.println("Зеленый");
}
    }
    public static void  compareNumbers() {
int a=1;
int b=-21;
if (a>=b){
    System.out.println("a >= b");
}
if (a<b){
    System.out.println("a <b");
}
    }
}


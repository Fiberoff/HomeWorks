package HWL1;

public class HW1HomeWorkApp  {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            skip();
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
        public static void skip(){
            char s =' ';
            System.out.println(s);
        }
        public static void checkSumSign() {
            int a =747;
            int b =333;

            int Sum = a + b;
            if (Sum >= 0) {
                System.out.println("Сумма положительная");
            }
            if (Sum < 0) {
                System.out.println("Сумма отрицательная");
            }

        }
        public static void printColor() {
            int value = -247;
            if (value<=0) {
                System.out.println("Красный");
            }
            if (value>=1 && value<=100){
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




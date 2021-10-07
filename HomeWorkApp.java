class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = -7;
        int b = 3;
        int c = a + b;
        System.out.println(c >= 0? "Сумма положительная":"Сумма отрицательная");
    }
    static void printColor() {
        int value = 600;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }
    static void compareNumbers() {
        int a = 16;
        int b = 17;
        System.out.println(a >= b? "a >= b":"a < b");
    }
}
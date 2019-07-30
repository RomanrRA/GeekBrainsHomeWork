package lesson_5.homeWork5;

public class Main {
    public static void main(String[] args) {
        CreateArray createArray = new CreateArray();

        createArray.calculateOneArray(10000000);
        createArray.separateArray(10000000);

        createArray.threadArray(10000000, 4);

    }
}

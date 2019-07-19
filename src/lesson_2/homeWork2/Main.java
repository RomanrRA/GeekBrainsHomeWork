package lesson_2.homeWork2;

public class Main extends Exception {
    public static void main(String[] args)  {
        String[][] arr = new String[][]{{"10", "87", "11", "66"},
                {"16", "35", "46", "12"},
                {"91", "12", "28", "24"},
                {"29", "42", "78", "92"}};

        new CreateArray4x4(arr);
    }
}

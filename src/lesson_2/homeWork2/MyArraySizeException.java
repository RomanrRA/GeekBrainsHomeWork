package lesson_2.homeWork2;

public class MyArraySizeException  extends Exception {
    public MyArraySizeException() {
        System.err.println("Массив не соответствует размеру 4х4!");
    }
}

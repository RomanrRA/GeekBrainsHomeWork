package lesson_2.homeWork2;

public class MyArrayDataException extends Exception{
    private int mainArray;
    private int insideArray;

    public int getMainArray() {
        return mainArray;
    }

    public int getInsideArray() {
        return insideArray;
    }

    MyArrayDataException(int mainArray, int insideArray, String[][] mass ) {
        this.mainArray = mainArray;
        this.insideArray = insideArray;
        System.err.println("Ошибка в массиве №" + mainArray + ", ячейка №" + insideArray);
        System.err.println("Данные в проблемной ячейке == " + mass[mainArray][insideArray]);
    }
}

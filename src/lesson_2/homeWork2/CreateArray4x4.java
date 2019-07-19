package lesson_2.homeWork2;

public class CreateArray4x4 {
    private String[][] arr;

    public CreateArray4x4(String[][] arr) {
        this.arr = arr;
        try {
            System.out.println("Результат раыен " + method(arr));
        } catch (MyArraySizeException e1) {
            e1.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public String[][] getArr() {
        return arr;
    }

    private static int method(String[][] arr) throws  MyArrayDataException, MyArraySizeException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arr);
                }
            }
        }
        return count;
    }
}

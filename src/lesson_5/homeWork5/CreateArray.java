package lesson_5.homeWork5;

import java.util.ArrayList;
import java.util.List;

public class CreateArray {
    private float[] arrMain;

    public void threadArray(int arrSize, int countThread) {
        setArrMain(arrSize);
        int h = arrSize / countThread;
        List<float[]> arraList = new ArrayList<>();
        System.out.println("С доп заданием не получилось(((");
    }

    public void calculateOneArray(int arrSize) {
        setArrMain(arrSize);
        long a = System.currentTimeMillis();
        calculate(getArrMain());
        System.out.println("Время расчета " + (System.currentTimeMillis() - a));
    }

    public void separateArray(int arrSize) {
        setArrMain(arrSize);
        int h = arrSize / 2;

        float[] arr0 = new float[h];
        float[] arr1 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arrMain, 0, arr0, 0, h);
        System.arraycopy(arrMain, h, arr1, 0, h);

        new Thread(() -> calculate(arr0)).start();
        new Thread(() -> calculate(arr1)).start();

        System.arraycopy(arr0, 0, arrMain, 0, h);
        System.arraycopy(arr1, 0, arrMain, h, h);

        System.out.println("Время работы " + (System.currentTimeMillis() - a));
    }


    private void calculate(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private void setArrMain(int size) {
        arrMain = new float[size];
        for (int i = 0; i < size; i++) {
            arrMain[i] = 1;
        }
    }

    private float[] getArrMain() {
        return arrMain;
    }

}

package lesson_3.homeWork_3.firstTask;

import java.util.ArrayList;

class CreateArray {
    private ArrayList<String> states = new ArrayList<>();

    private ArrayList<String> addArrayList() {
        states.add("США");
        states.add("США");
        states.add("США");
        states.add("ОАЭ");
        states.add("ОАЭ");
        states.add("Таити");
        states.add("Китай");
        states.add("Япония");
        states.add("Италия");
        states.add("Италия");
        states.add("Россия");
        states.add("Россия");
        states.add("Египед");
        states.add("Англия");
        states.add("Испания");
        states.add("Германия");
        states.add("Германия");
        states.add("Франиция");
        states.add("Австралия");
        states.add("Голландия");
        states.add("Черногория");
        states.add("Черногория");

        return states;
    }


    public ArrayList<String> getStates() {
        return states;
    }

    public void setStates() {
        this.states = addArrayList();
    }
}

package lesson_3.homeWork_3.firstTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HereSortMagic {

    private HashMap<String, Integer> sortDonor = new HashMap<>();
    private Map<String, Integer> countDonor = new HashMap<>();


    public void showUniqeElementInArrayList(ArrayList<String> states) {

        for (int i = 0; i < states.size(); i++) {
            sortDonor.put(states.get(i), i);
        }

        System.out.println(sortDonor.keySet());
    }

    public void showCountElementsInArrayList(ArrayList<String> states) {
        for (int i = 0; i < states.size(); i++) {
            String state = states.get(i);
            Integer count = countDonor.get(state);
            countDonor.put(state, count);
            countDonor.put(state, count == null ? 1 : ++count);
        }

        System.out.println(countDonor);
    }
}

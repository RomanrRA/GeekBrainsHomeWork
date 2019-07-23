package lesson_3.homeWork_3.secondTask;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class PhoneNumbers {
    private Map<String, TreeSet<String>> phoneNumbers = new HashMap<>();
    private TreeSet<String> number = new TreeSet<>();

    public void watchPhoneNumbers() {
        System.out.println(phoneNumbers);
    }

    public void setPhoneNumber(String name, String phoneNumber) {
        if (phoneNumbers.containsKey(name)) {
            number.add(phoneNumber);
            phoneNumbers.put(name, number);
        } else {
            number = new TreeSet<>();
            number.add(phoneNumber);
            phoneNumbers.putIfAbsent(name, number);
        }
    }
}

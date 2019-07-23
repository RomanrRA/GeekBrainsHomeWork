package lesson_3.homeWork_3.thirdTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1 Обязательно есть хоть 1 цифра
 * 2 Не менее 8 символов и не более 20
 * 3 Должны быть большие и маленькие буквы
 * 4 Обязательно дожен быть спец символ
 */

public class ChekPassword {

    public void checPassword(String pass) {
        chekSizePassword(pass);
    }

    private void chekSizePassword(String pass) {
        char[] arr = pass.toCharArray();
        if (arr.length < 8) {
            System.out.println("Пароль не должен быть короче 8 символов");
        } else if (arr.length > 20) {
            System.out.println("Пароль не должен быть более 20");
        } else {
            chekCountNumbers(pass);
        }
    }

    private void chekCountNumbers(String pass) {
        if (pass.matches("\\D+")) {
            System.out.println("Пароль должен содержать хоть 1 цифру");
        } else {
            chekLiteral(pass);
        }
    }

    private void chekLiteral(String pass) {
        if (pass.toLowerCase().equals(pass)) {
            System.out.println("Пароль должен содержать хоть 1 большую букву");
        } else if (pass.toUpperCase().equals(pass)) {
            System.out.println("Пароль должен содержать хоть 1 маленькую букву");
        } else {
            chekSpesialSymbol(pass);
        }
    }

    private boolean chekSpesialSymbol(String pass) {
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher hasSpecial = special.matcher(pass);
        if (hasSpecial.find()) {
            System.out.println("Пароль соответствует всем требованию безопасности");
            return true;
        } else {
            System.out.println("Пароль должен содержать хоть 1 спец символ");
            return false;
        }
    }
}

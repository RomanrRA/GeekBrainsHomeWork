package lesson_2.homeWork_2.enumHomeWork;

public enum DayOfWeek {

    MONDAY("Понедельник", 40),
    TUESDAY("Вторник", 32),
    WEDNESDAY("Среда", 24),
    THURSDAY("Четверг", 16),
    FRIDAY("Пятница", 8),
    SATURDAY("Суббота", 0),
    SUNDAY("Воскресенье", 0);

    private String rus;
    private int hour;

    public int getHour() {
        return hour;
    }

    public String getRus() {
        return rus;
    }

    DayOfWeek(String rus, int hour) {
        this.rus = rus;
        this.hour = hour;
    }
}

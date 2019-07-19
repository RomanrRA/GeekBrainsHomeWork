package lesson_2.homeWork_2.enumHomeWork;

public class DayOfWeekMain {
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
    }

    private static String getWorkingHours(DayOfWeek day) {
        String wordHour = " часов!";
        if (day.getHour() == 32 || day.getHour() == 24) {
            wordHour = " часа!";
        }

        String text = "Сегодня " + day.getRus() + " до конца недели " + day.getHour()+ wordHour;
        if(day.getHour() == 0) text = "Сегодня ВЫХОДНОООЙ!!!!)))))";

        return text;
    }
}

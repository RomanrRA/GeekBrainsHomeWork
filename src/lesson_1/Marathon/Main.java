package lesson_1.Marathon;

import lesson_1.Marathon.competitors.Cat;
import lesson_1.Marathon.competitors.Dog;
import lesson_1.Marathon.competitors.Human;
import lesson_1.Marathon.helpers.Course;
import lesson_1.Marathon.helpers.Team;
import lesson_1.Marathon.helpers.СompetitionCreate;
import lesson_1.Marathon.obstractor.Cross;
import lesson_1.Marathon.obstractor.Wall;
import lesson_1.Marathon.obstractor.Water;

public class Main {


    public static void main(String[] args) {
        Team team = new Team(new Human("Bob"),
                new Cat("Kitty"),
                new Dog("Guff"));
        Course course = new Course(new Cross(80),
                new Wall(2),
                new Wall(1),
                new Cross(120),
                new Water(25));

        new СompetitionCreate(team.getCompetitors(), course.getCourse());
    }
}
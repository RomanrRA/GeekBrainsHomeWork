package lesson_1.Marathon.helpers;

import lesson_1.Marathon.obstractor.Obstacle;

public class Course {
    private Obstacle[] course;

    public Course(Obstacle... course) {
        this.course = course;
    }

    public Obstacle[] getCourse() {
        return course;
    }
}

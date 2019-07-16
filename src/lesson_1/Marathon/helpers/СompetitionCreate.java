package lesson_1.Marathon.helpers;
import lesson_1.Marathon.competitors.Competitor;
import lesson_1.Marathon.obstractor.Obstacle;

public class СompetitionCreate {

    public СompetitionCreate(Competitor[] getCompetitors, Obstacle[] getCourse) {
        for (Competitor c : getCompetitors) {
            for (Obstacle o : getCourse) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : getCompetitors) {
            c.info();
        }
    }
}

package lesson_1.Marathon.helpers;

import lesson_1.Marathon.competitors.Competitor;

public class Team {
    private Competitor[] competitors;

    public Team(Competitor... competitors) {
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }
}

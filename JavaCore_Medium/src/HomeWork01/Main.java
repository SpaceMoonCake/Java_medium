package HomeWork01;

import java.text.BreakIterator;

public class Main {
    public static void main (String[] args){
        Team athletes = new Team("Athletes");
        Course course = new Course();
        course.goCourse(athletes.getTeam());
    }
}

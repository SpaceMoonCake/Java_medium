package HomeWork01;

public class Course {
    Barrier course [] = new Barrier[4];

    public Course(){
        course[0] = new Wall();
        course[1] = new RunningTrack();
        course[2] = new Wall();
        course[3] = new RunningTrack();
    }

    public void goCourse (SportActivity[] athletes){
        for(SportActivity athlete : athletes){
            boolean success = true;
            System.out.println(athlete.parameters());
            for (Barrier barrier : course){
                if (success == false) {
                    continue;
                }
                if(barrier instanceof Wall){
                    athlete.jump(barrier.getSizeBarrier());
                    success = athlete.resultGoThroughBarrier(barrier.doIt(athlete.getMaxJump()));
                } else {
                    athlete.run(barrier.getSizeBarrier());
                    success = athlete.resultGoThroughBarrier(barrier.doIt(athlete.getMaxRun()));
                }
            }
        }
    }
}

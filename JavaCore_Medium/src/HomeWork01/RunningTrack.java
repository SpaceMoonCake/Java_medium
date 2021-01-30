package HomeWork01;

public class RunningTrack extends Barrier{

    private final String nameRunningTrack = "Беговое препятствие_";

    public RunningTrack(){
        super();
        super.nameBarrier = nameRunningTrack + super.numberBarrier;
    }


}


package HomeWork01;

public class Wall extends Barrier{

    private String Wall = "Стена_";

    public Wall(){
        super();
        super.nameBarrier = Wall + super.numberBarrier;
    }

}

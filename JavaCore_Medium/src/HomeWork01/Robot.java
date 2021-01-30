package HomeWork01;

public class Robot implements SportActivity{
    private String name;
    private int maxJump;
    private int maxRun;

    public Robot (String name, int maxJump, int maxRun){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String canDoIt() {
        return (name + " смог преодолеть препядствие!") ;
    }

    @Override
    public String notDoIt() {
        return (name + " НЕ смог преодолеть препядствие") ;
    }

    @Override
    public boolean resultGoThroughBarrier(boolean success) {
            if (success == true){
                System.out.println(canDoIt());
                return (true);
            } else {
                System.out.println(notDoIt());
                return (false);
            }
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump(){
        return maxJump;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " бежит " +  distance + "м.");
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгает на " +  height + "м." );
    }

    @Override
    public String parameters() {
        return(name + " (maxJump = " + maxJump + "; maxRun = " + maxRun + ")");
    }
}

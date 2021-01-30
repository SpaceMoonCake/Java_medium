package HomeWork01;

abstract class Barrier {
    private final int sizeBarrier;
    protected String nameBarrier;
    protected static int numberBarrier = 0;

    public Barrier (){
        sizeBarrier = (int)(Math.random()*100);
        ++numberBarrier;
    }

    public int getSizeBarrier() {
        return sizeBarrier;
    }

    public String getNameBarrier(){
        return nameBarrier;
    }

    public boolean doIt(int maxBarrier){
        if (maxBarrier < sizeBarrier) {
            return(false);
        }
        else {
            return(true);
        }
    }

    public void getParameters(){
        System.out.println(nameBarrier + " = " + sizeBarrier + "м.");
    }





}

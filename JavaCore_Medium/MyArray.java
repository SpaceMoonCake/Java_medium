package HomeWork05;

public class MyArray extends Thread {
    private static final int SIZE_ARRAY = 1000000;
    static final int HALF_SIZE_ARRAY = SIZE_ARRAY / 2;
    float[] fullArray = new float[SIZE_ARRAY];
    float[] firstPartMyArray = new float[HALF_SIZE_ARRAY];
    float[] secondPartMyArray = new float[HALF_SIZE_ARRAY];

    public MyArray(){
        for (int i = 0; i < fullArray.length; i++){
            fullArray[i] = 1;
        }
    }

    public void printMyArray(){
        for(int i = 0; i < fullArray.length; i++){
                System.out.print(fullArray[i] + " ");
        }
    }

    public void countFullArrayAndGetTime(){
        long timeStartOperation = System.currentTimeMillis();
        for (int i = 0; i < fullArray.length; i++){
            fullArray[i] = (float)(fullArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));;
        }
        System.out.println("Время работы метода 1: " + (System.currentTimeMillis()-timeStartOperation));
    }

    public void countTwoThreadAndGetTime(){
        long timeStartOperation = System.currentTimeMillis();
        System.arraycopy(fullArray, 0, firstPartMyArray, 0, HALF_SIZE_ARRAY);
        System.arraycopy(fullArray, HALF_SIZE_ARRAY, firstPartMyArray, 0, HALF_SIZE_ARRAY);
        Thread threadFirst = new Thread(new MyThreadArrayFirstPart());
        Thread threadSecond = new Thread(new MyThreadArraySecondPart());
        threadFirst.start();
        threadSecond.start();
        System.arraycopy(firstPartMyArray, 0, fullArray, 0, HALF_SIZE_ARRAY);
        System.arraycopy(firstPartMyArray, 0, fullArray, HALF_SIZE_ARRAY, HALF_SIZE_ARRAY);
        System.out.println("Время работы метода 2: " + (System.currentTimeMillis()-timeStartOperation));
    }

    class MyThreadArrayFirstPart implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < firstPartMyArray.length; i++){
                fullArray[i] = (float)(firstPartMyArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));;
            }
        }
    }

    class MyThreadArraySecondPart implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < secondPartMyArray.length; i++){
                fullArray[i] = (float)(secondPartMyArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));;
            }
        }
    }

}



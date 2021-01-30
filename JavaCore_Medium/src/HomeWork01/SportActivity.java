package HomeWork01;

public interface SportActivity {

   void run( int distance);
   void jump(int height);
   String parameters();
   int getMaxJump();
   int getMaxRun();
   String getName();
   String canDoIt();
   String notDoIt();
   boolean resultGoThroughBarrier(boolean success);


}


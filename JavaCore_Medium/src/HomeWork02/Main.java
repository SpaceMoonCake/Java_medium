package HomeWork02;

public class Main {
    public static void main(String[] args)  {
        MyArray myArray1 = new MyArray(3,3, "myArray1");
        MyArray myArray2 = new MyArray(4,4, "myArray2");

        try {
            myArray1.printArray();
            myArray1.arrayCheckSize();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            myArray1.updateArray(0,1, "Упс!");
            myArray1.printArray();
            myArray1.arrayStringToIntAndSum();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            myArray2.printArray();
            myArray2.arrayCheckSize();
            myArray2.arrayStringToIntAndSum();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }





    }
}

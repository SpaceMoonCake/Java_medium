package HomeWork02;

public class MyArray {
    private String array[][];
    private int arrayLine;
    private int arrayColumn;
    private String arrayName;

    public MyArray(int arrayLine, int arrayColumn, String arrayName){
        this.arrayName = arrayName;
        array = new String[arrayLine][arrayColumn];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = Integer.toString((int)(Math.random()*100 + 1));
            }
        }
    }

    public String getArrayName (){
        return arrayName;
    }

    public void arrayCheckSize() throws MyArraySizeException {
        if (array.length != array[0].length || array.length != 4) {
            throw new MyArraySizeException("Неверная размерносить массива " + getArrayName());
        }
        System.out.println("Верный размер массива " + getArrayName());
    }

    public void printArray(){
        for(int i = 0; i < array.length; i++){
            for(int j =0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void updateArray(int i, int j, String value){
        array[i][j] = value;
    }


    public void arrayStringToIntAndSum() throws MyArrayDataException {
        Integer[][] array = new Integer[this.array.length][this.array[0].length];
        int sum =0;
        String figures = "[0-9]+";
        for(int i = 0; i < this.array.length; i++){
            for(int j =0; j < this.array[0].length; j++){
                if (this.array[i][j].matches(figures)){
                    array[i][j] = Integer.parseInt(this.array[i][j]);
                    sum += array[i][j];
                } else {
                    throw new MyArrayDataException("Не получается преобразовать в Integer ячейку. " +
                            this.array[i][j] +
                            " Строка "+ i + "; Столбец  " + j + ";");
                }
            }
        }
        System.out.println("Сумма элементов массива = " + sum);
    }

//    public void arrayStringToInt(){
//        Integer[][] array = new Integer[this.array.length][this.array[0].length];
//        for(int i = 0; i < this.array.length; i++) {
//            for (int j = 0; j < this.array[0].length; j++) {
//                array[i][j] = Integer.parseInt(this.array[i][j]);
//            }
//        }
//    }



}

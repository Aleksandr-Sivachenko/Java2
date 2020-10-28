public class Check {

    public void doCheck(String[][] arr) throws MyArraySizeException {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Массив не соответствует размеру 4x4");
                }
            }
        }
    }

    public void doCalculate(String[][] arr) throws MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int array = Integer.parseInt(arr[i][j]);
                    sum += array;
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] находится тип даных отличный от int" + " " + ":'" + arr[i][j] + "'");
                }
            }
        }
        System.out.println(sum);
    }
}

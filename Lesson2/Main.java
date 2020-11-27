public class Main {

    public static void main(String[] args) {
        String[][] arr = {{"2", "2", "3", "8"}, {"3", "7", "2","Не int"}, {"2", "2", "2", "3"}, {"3", "2", "2"}};
        checkArray(arr);

    }

    static void checkArray(String[][] arr) {
        try {
            new Check().doCheck(arr);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            new Check().doCalculate(arr);
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

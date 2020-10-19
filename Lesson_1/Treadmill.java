public class Treadmill implements Let{

    int length;

    Treadmill(int length) {
        this.length = length;
    }

    @Override
    public int parameter() {
        return length;
    }
}

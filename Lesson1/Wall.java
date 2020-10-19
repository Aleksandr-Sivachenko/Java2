public class Wall implements Let{

    int height;

    Wall(int height) {
        this.height = height;
    }

    @Override
    public int parameter() {
        return height;
    }
}

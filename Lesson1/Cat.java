public class Cat implements Participant{

    int jumpHeight;
    int runningDistance;

    public Cat(int jumpHeight, int runningDistance) {
        this.jumpHeight = jumpHeight;
        this.runningDistance = runningDistance;
    }

    @Override
    public int doRun() {
        return runningDistance;
    }

    @Override
    public int doJump() {
        return jumpHeight;
    }
}

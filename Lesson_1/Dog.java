public class Dog implements Participant {

    int jumpHeight;
    int runningDistance;

    public Dog(int jumpHeight, int runningDistance) {
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

public class Main {

    public static void main(String[] args) {

        Participant[] participant = {new Dog(2, 10), new Cat(1,10), new Robot(3,5)};

        Let[] lets = {new Wall(2), new Treadmill(10)};


        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if (participant[i].doJump() >= lets[0].parameter() && participant[i].doRun() >= lets[1].parameter()) {
                    System.out.println(participant[i] + " " + "Прошёл" + " " + lets[j]);
                }
                else {
                    System.out.println(participant[i] + " " + "Не прошёл" + " " + lets[j]);
                }
            }
        }
    }
}

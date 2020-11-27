public class Calculator {

    final int size = 10000000;
    final int h = size / 2;
    float[] arr = new float[size];

    public void method1() {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();
        long b = System.currentTimeMillis() - a;

        System.out.println("Время на цикл расчёта в первом методе: " + b);

    }

    public void method2() {

        long start = System.currentTimeMillis();

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        long arrSplitting = System.currentTimeMillis() - start;
        System.out.println("Разбиение массива второго метода заняло " + arrSplitting);

        Thread t1 = new Thread(() -> {
                long timeArr1 = System.currentTimeMillis();

                for (int i = 0; i < a1.length; i++) {
                    a1[i] = 1;
                }

                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                long endTimeArr1 = System.currentTimeMillis() - timeArr1;
                System.out.println("Первый поток занял " + endTimeArr1);
        });

        Thread t2 = new Thread(() -> {
                long timeArr1 = System.currentTimeMillis();

                for (int i = 0; i < a2.length; i++) {
                    a2[i] = 1;
                }

                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

                long endTimeArr1 = System.currentTimeMillis() - timeArr1;
                System.out.println("Второй поток занял " + endTimeArr1);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long startJoin = System.currentTimeMillis();

            System.arraycopy(a1, 0, arr, 0, h);
            System.arraycopy(a2, 0, arr, h, h);

        long endJoin = System.currentTimeMillis() - startJoin;
        System.out.println("Склейка массива заняла: " + endJoin);

    }
}


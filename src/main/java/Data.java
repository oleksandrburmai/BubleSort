public class Data {

    private static final int THOUSAND = 1000;
    private static final int TEN_THOUSAND = 10000;
    private static final int HUNDRED_THOUSAND = 100000;
    private static final int MILLION = 1000000;


    public void thousandEl() {
        int[] array = new int[THOUSAND];
        int[] arrayMulti = new int[array.length];
        fillArray(array, arrayMulti);
        long start = System.nanoTime();
        new SingleSort().bubbleSort(array);
        long end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to single sort 1000 element array");
        start = System.nanoTime();
        multiSort(arrayMulti);
        end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to multi sort 1000 element array");

    }

    public void tenThousandEl() {
        int[] array = new int[TEN_THOUSAND];
        int[] arrayMulti = new int[array.length];
        fillArray(array, arrayMulti);
        long start = System.nanoTime();
        new SingleSort().bubbleSort(array);
        long end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to single sort 10000 element array");
        start = System.nanoTime();
        multiSort(arrayMulti);
        end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to multi sort 10000 element array");
    }

    public void hundredThousandEl() {
        int[] array = new int[HUNDRED_THOUSAND];
        int[] arrayMulti = new int[array.length];
        fillArray(array, arrayMulti);
        long start = System.nanoTime();
        new SingleSort().bubbleSort(array);
        long end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to single sort 100000 element array");
        start = System.nanoTime();
        multiSort(arrayMulti);
        end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to multi sort 100000 element array");
    }

    public void millionEl() {
        int[] array = new int[MILLION];
        int[] arrayMulti = new int[array.length];
        fillArray(array, arrayMulti);
        long start = System.nanoTime();
        new SingleSort().bubbleSort(array);
        long end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to single sort 1000000 element array");
        start = System.nanoTime();
        multiSort(arrayMulti);
        end = System.nanoTime();
        System.out.println("Spend - " + (end - start) + " nanosecond to multi sort 1000000 element array");
    }

    private void fillArray(int[] array, int[] arrayMulti) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.arraycopy(array, 0, arrayMulti, 0, arrayMulti.length);
    }

    private void multiSort(int[] array) {
        Thread thread1 = new Thread(new MultiSort(array, 1));
        Thread thread2 = new Thread(new MultiSort(array, 2));
        thread1.start();
        thread2.start();
        new SingleSort().bubbleSort(array);
    }
}

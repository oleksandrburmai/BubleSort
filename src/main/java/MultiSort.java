public class MultiSort implements Runnable {
    private int[] array;
    private int threadNum;

    MultiSort(int[] array, int threadNum) {
        this.array = array;
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        int chunk = array.length / 2;
        int start;
        if (threadNum == 1) {
            start = 0;
        } else {
            start = (threadNum - 1) * chunk;
        }
        int temp;
        for (int i = start; i < start + chunk; i++)
            for (int j = i + 1; j < start + chunk; j++)
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }
}

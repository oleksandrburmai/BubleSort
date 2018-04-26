public class MultiSort implements Runnable {
    private int[] array;
    private int threadNum;

    MultiSort(int[] array, int threadNum) {
        this.array = array;
        this.threadNum = threadNum;
    }

    private int findArrayStart(int chunk) {
        if (threadNum == 1) {
            return 0;
        } else {
            return (threadNum - 1) * chunk;
        }
    }

    @Override
    public void run() {
        int chunk = array.length / 2;
        int start = findArrayStart(chunk);
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

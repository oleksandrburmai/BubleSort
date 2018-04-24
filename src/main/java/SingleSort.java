public class SingleSort {

    public void bubbleSort(int[] array) {
        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (array[i] > array[i + 1]) {
                int temporary = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temporary;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == array.length - 1) break;
        }
    }
}

package stopwatch;
import java.util.Random;
public class sw {

    static class StopWatch {
        private long startTime;
        private long endTime;

        public StopWatch() {
            this.startTime = System.currentTimeMillis();
        }
        public void start() {
            this.startTime = System.currentTimeMillis();
        }
        public void stop() {
            this.endTime = System.currentTimeMillis();
        }
        public long getElapsedTime() {
            return this.endTime - this.startTime;
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(numbers);
        stopwatch.stop();
        System.out.println("Время выполнения сортировки: " + stopwatch.getElapsedTime() + " миллисекунд.");
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}


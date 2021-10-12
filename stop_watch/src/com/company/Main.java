package stopWatch;
import java.lang.*;
import java.lang.Math;
public class Main {

    public static int[] selectionSort(int...a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (Math.random()*1000);
        }
        long startTime = System.currentTimeMillis();
        int[] newArr = selectionSort(arr);
        long endTime = System.currentTimeMillis();
        StopWatch stopWatch = new StopWatch(startTime,endTime);
        System.out.println("Time: " + stopWatch.getElapsedTime() + " miliseconds");
    }
}

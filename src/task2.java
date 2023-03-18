
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class task2 {
    public static void currentTimeMillis() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(100);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Proshlo vremeni, ms " + elapsed);
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int N = 100000;
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        for (int i = 0; i < N; i++) {
            arrayList.get((int) (Math.random() * N));
        }
        System.out.println("Pervaya programma:");
        currentTimeMillis();

        for (int i = 0; i < N; i++) {
            linkedList.get((int) (Math.random() * N));
        }
        System.out.println("Vtoraya programma:");
        currentTimeMillis();
    }
}

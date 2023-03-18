package com.company;
import java.util.Scanner;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class task1 {

    public static void main(String[] args) {
        System.out.println("Enter chislo dlya otsccheta: ");
        Scanner scan = new Scanner(System.in);
        final ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(1);    //Он позволяет поставить код выполняться в одном или нескольких потоках и сконфигурировать интервал или время, на которое выполненение будет отложено.
        //в скобках-количество потоков
        final Runnable RUNNABLE = new Runnable()
        {
            int countdownStarter = scan.nextInt();
            public void run()
            {

                System.out.println(countdownStarter);
                countdownStarter--;
                if (countdownStarter < 0) {
                    System.out.println("Vremya vishlo!");
                    SCHEDULER.shutdown();                           //закрытие потока
                }
            }
        }
                ;
        SCHEDULER.scheduleAtFixedRate(RUNNABLE, 0, 1, SECONDS);
    }
}

    /*double BELrub = 0;
    boolean isReady = false;
while(!isReady){
        try{
        System.out.println("Vvedite polojitelnoe chislo: ");
        Scanner scanner = new Scanner(System.in);
        BELrub = scanner.nextInt();
        if(BELrub > 0)
        isReady = true;
        } catch (Exception e){
        System.out.println("wrong number");
        }
        }
*/
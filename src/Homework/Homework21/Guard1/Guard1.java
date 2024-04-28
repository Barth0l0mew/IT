package Homework.Homework21.Guard1;

import javax.swing.*;

public class Guard1 {
    public static void main(String[] args) {
        Guard guard1 = new Guard(new Watch(null, null));
        Guard guard2 = new Guard(new Watch(null, null));

        guard1.setActive(true); // Первый охранник активен
        guard2.setActive(false); // Второй охранник неактивен

        Watch watch = new Watch(guard1, guard2); // Передаем обоих охранников в Watch

        watch.start();
        guard1.start();
        guard2.start();
    }
}
class Guard extends Thread {
    private boolean isActive;
    private Watch watch;

    public Guard(Watch watch) {
        this.watch = watch;
        this.isActive = false;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (watch) {
                try {
                    if (isActive) {
                        // Охранник на посту
                        System.out.println("Guard on duty");
                        watch.wait(); // Ждем сигнала от часов
                        // Охранник будит спящего
                        System.out.println("Guard waking up the other guard");
                        Thread.sleep(1000); // Небольшая пауза, чтобы охранник успел проснуться
                        watch.notify(); // Будим спящего охранника
                    } else {
                        // Охранник спит
                        System.out.println("Guard sleeping");
                        Thread.sleep(1000); // Пусть спит некоторое время
                        // Охранник сверяет время
                        System.out.println("Guard checking time");
                        Thread.sleep(1000); // Пусть процесс занимает некоторое время
                        watch.notify(); // Сигнализируем охраннику на посту
                        watch.wait(); // Ждем сигнала от часов
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
 class Watch extends Thread {
    private final Guard guard1;
    private final Guard guard2;

    public Watch(Guard guard1, Guard guard2) {
        this.guard1 = guard1;
        this.guard2 = guard2;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (guard1) {
                try {
                    // Первый охранник спит, второй активен
                    System.out.println("Guard 1 sleeping, Guard 2 on duty");
                    Thread.sleep(1000); // Пусть процесс занимает некоторое время
                    notify(); // Сигнализируем первому охраннику на посту
                    wait(); // Ждем сигнала от второго охранника
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (guard2) {
                try {
                    // Второй охранник спит, первый активен
                    System.out.println("Guard 2 sleeping, Guard 1 on duty");
                    Thread.sleep(1000); // Пусть процесс занимает некоторое время
                    notify(); // Сигнализируем второму охраннику на посту
                    wait(); // Ждем сигнала от первого охранника
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
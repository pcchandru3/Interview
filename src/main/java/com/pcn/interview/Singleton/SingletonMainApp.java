package com.pcn.interview.Singleton;

import java.time.LocalTime;

public class SingletonMainApp {

    public static void main(String[] args){

        SingletonDBConnectionLazy db1 = SingletonDBConnectionLazy.getInstance();
        db1.executeQuery("select * from users");

        SingletonDBConnectionLazy db2 = SingletonDBConnectionLazy.getInstance();
        db2.executeQuery("select * from products");


        // test
        System.out.println(db1 == db2);
        System.out.println("Test");
        
        
        
        runDatabaseTask("select * from users");
        runDatabaseTask("select * from Employee");


        Runnable task = () -> {
            SingletonDBConnectionLazy.getInstance().executeQuery("select * from products");
            System.out.println("Current Time : " + LocalTime.now());

        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }


    }





    public static void runDatabaseTask(String query) {
        // You can pass the 'query' variable straight into the Lambda
        Runnable task = () -> {
            SingletonDBConnectionLazy.getInstance().executeQuery(query);
            System.out.println("Current Time : " + LocalTime.now());
        };
        
        // Example: execution via a thread
        new Thread(task).start();
    }




}
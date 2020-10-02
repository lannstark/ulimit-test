package com.lannstark.ulimittest.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/create-thread")
    public String createThread() {
        for (int i = 0; i < 100; i++) {
            try {
                createSleepingNewThread();
            } catch (Exception e) {
                e.printStackTrace();
                return "NOT-OK";
            }
        }
        return "OK";
    }

    @Async
    public void createSleepingNewThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000 * 60 * 30); // 30 minutes sleep
                } catch (Exception e) {
                    System.out.println("Sleeping Failed");
                    e.printStackTrace();
                }
            }
        }).start();
    }

}

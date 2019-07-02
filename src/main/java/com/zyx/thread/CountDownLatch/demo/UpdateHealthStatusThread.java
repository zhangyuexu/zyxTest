package com.zyx.thread.CountDownLatch.demo;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class UpdateHealthStatusThread {
    String url = "http://10.179.162.73:9527/disf/cluster/updateHealthStatus?userName=yp";

    public static void main(String[] args) {
        UpdateHealthStatusThread updateHealthStatusThread = new UpdateHealthStatusThread();
        updateHealthStatusThread.startAction();

        System.out.println("killing");

    }

    public void startAction() {
        final CountDownLatch countDownLatch = new CountDownLatch(16);
        for (int i = 0; i < 16; i++) {
            final int index = i;
            Thread thread = new Thread(new MyRuns(index, countDownLatch));
            thread.setName("t" + i);
            thread.setDaemon(true);
            thread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class MyRuns implements Runnable {
        private int status;
        private CountDownLatch countDownLatch;

        public MyRuns(int status, CountDownLatch countDownLatch) {
            super();
            if (status % 2 == 0) {
                status = 0;
            } else {
                status = 1;
            }
            this.status = status;
            this.countDownLatch = countDownLatch;
        }

        public void run() {
            try {
                long startTime = System.currentTimeMillis();
                while (System.currentTimeMillis() - startTime < 10000) {
                    try {
                        String paramJson = "{\n" +
                                "\"cuuid\": \"hnc-v.commonplat-gs-plutus\",\n" +
                                "\"type\":\"poll\",\n" +
                                "\"traceId\":\"qwer\",\n" +
                                "\"endpoints\": [\n" +
                                "{\n" +
                                "\"ip\": \"10.179.162." + (new Random().nextInt(1000) % 256) + "\",\n" +
                                "\"port\": 8000,\n" +
                                "\"health_status\":" + status +
                                "}\n" +
                                "]\n" +
                                "}";
                        //System.out.println(paramJson);
                        String response = HttpClientUtil.sendHttpPostJson(url, paramJson);
                        System.out.println("Response is:" + response);
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } finally {
                countDownLatch.countDown();
            }
        }
    }

}

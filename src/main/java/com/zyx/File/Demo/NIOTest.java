package com.zyx.File.Demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class NIOTest {

        public static void main(String[] args) throws Exception{
            List<String> list = Arrays.asList("Hello", "World!");
            list.stream().forEach(System.out::println);
            System.out.println(list.toString());


            Files.readAllLines(Paths.get("/Users/didi/Documents/create.py"), Charset.forName("utf-8")).stream().forEach(item->{
                try {
                    Files.write(Paths.get("/Users/didi/Documents/create.py"),item.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            BufferedWriter writer0=Files.newBufferedWriter(Paths.get("/Users/didi/Documents/create.py"));
            Files.readAllLines(Paths.get("/Users/didi/Documents/create.py"), Charset.forName("utf-8")).stream().forEach(item->{
                try {
                    writer0.write(item);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            Files.readAllLines(Paths.get("/Users/didi/Documents/create.py")).parallelStream().forEach(item->{
                try{
                    System.out.println(item);
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
            List<String> list2=Files.readAllLines(Paths.get("/Users/didi/Documents/create.py"));
            list2.stream().forEach(System.out::println);
            list2.parallelStream().forEach(System.out::println);

            Files.lines(Paths.get("/Users/didi/Documents/create.py")).forEach(item->{
                System.out.println(item);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Files.list(Paths.get("/Users/didi/Documents/")).forEach(item->{
                System.out.println(item);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            //用 Files.write()写入文件  迭代器
            Files.write(Paths.get("/Users/didi/Documents/create-test.py"),Files.readAllLines(Paths.get("/Users/didi/Documents/create.py")));
            //用BufferedWriter写入文件
            BufferedWriter writer=Files.newBufferedWriter(Paths.get("/Users/didi/Documents/create-test.py"));
            writer.write("Hello World");
            //用 Files.write()写入文件  byte[]数组
            String content="Hello World";
            Files.write(Paths.get("/Users/didi/Documents/create-test.py"),content.getBytes());

//            for(int i=0;i<10;i++){
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Files.write(Paths.get("/Users/didi/Documents/create-test.py"),Files.readAllLines(Paths.get("/Users/didi/Documents/create.py")));
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }).start();
//            }

        }
}

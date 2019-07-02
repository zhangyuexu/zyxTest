package com.zyx.File.Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class WriteFile {
    private Connection conn;

    public void initConn(){
        String url="jdbc:mysql://127.0.0.1:3306/test";
        String user="root";
        String password="123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insertWithPreparedStatement() throws Exception{
        File file=new File("/Users/didi/Documents/insert.sql");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);

        String sql="insert into endpoint_auto_op_log(id,cuuid,user_name,endpoint,failure_time,recovery_time,op_type,status,tag,update_time,create_time) values (?,'hnc-v.commonplat-gs-plutus','zyx',?,'2018-12-18 15:18:47','2018-12-18 15:20:47',6,?,'{}','2018-12-18 15:18:47','2018-12-18 15:18:47')";
        PreparedStatement ppst=conn.prepareStatement(sql);
        conn.setAutoCommit(false);
        long start=System.currentTimeMillis();
        for(int i=1;i<=500000;i++){
            ppst.setInt(1,i);
            ppst.setString(2,"10.179.162."+i%256+":8000");
            ppst.setInt(3,i%2);

            //System.out.println(ppst.toString().replace("com.mysql.cj.jdbc.PreparedStatement@511baa65: ",""));
            bw.write(ppst.toString().replace("com.mysql.cj.jdbc.PreparedStatement@511baa65: ","")+";\n");
            //ppst.executeUpdate();
//            ppst.addBatch();
//            if(i%10000==0){
//                ppst.executeBatch();
//                ppst.clearBatch();
//            }
        }
        bw.close();
        //ppst.executeBatch();
        //conn.commit();
        System.out.println((System.currentTimeMillis()-start)/1000);
        ppst.close();
        conn.close();
    }

    public static void main(String[] args){
        WriteFile writeFile=new WriteFile();
        writeFile.initConn();
        try {
        	writeFile.insertWithPreparedStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
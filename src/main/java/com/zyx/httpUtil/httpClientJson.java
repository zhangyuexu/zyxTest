package com.zyx.httpUtil;

import java.io.IOException;  

import org.apache.http.HttpEntity;  
import org.apache.http.client.ClientProtocolException;  
import org.apache.http.client.methods.CloseableHttpResponse;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.impl.client.CloseableHttpClient;  
import org.apache.http.impl.client.HttpClients;  
import org.apache.http.util.EntityUtils;  
import org.json.JSONArray;  
import org.json.JSONObject;  
  
  
public class httpClientJson {  
  /**
    public static void main(String[] args) throws ClientProtocolException, IOException {  
        CloseableHttpClient httpclient = HttpClients.createDefault();  
        HttpPost httppost = new HttpPost("http://jingshou.com/admin/searchUser.action?search_loginid=jingshou");  
        CloseableHttpResponse response = httpclient.execute(httppost);  
        try {  
            HttpEntity myEntity = response.getEntity();  
            System.out.println(myEntity.getContentType());  
            System.out.println(myEntity.getContentLength());  
              
            String resString = EntityUtils.toString(myEntity);  
            // ʹ�÷��ص��ַ���ֱ�ӹ���һ��JSONObject       
            JSONObject jsonobj = new JSONObject(resString);  
            System.out.println(jsonobj.toString());  
            // ��ȡ���ض�����"resultSize��ֵ"  
            int resutltSize = jsonobj.getInt("resultSize");  
            System.out.println("Search Results Size is: "+ resutltSize);   
            // ��ȡ"clients"��ֵ,����һ��JSONArray  
            JSONArray jsonarray = jsonobj.getJSONArray("clients");  
            System.out.println(jsonarray.toString());  
              
              
        } finally {  
            response.close();  
        }  
          
          
    }  
  **/
}  

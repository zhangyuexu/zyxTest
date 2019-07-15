package com.zyx.httpUtil;

import org.json.JSONArray;
import org.json.JSONObject; 
  
public class JsonTest {  
/**
    public static void main(String[] args) {  
          
        // Test JSONObject.  
        JSONObject jsonobj = new JSONObject("{'name':'jingshou','age':30}");    
        String name = jsonobj.getString("name");    
        int age = jsonobj.getInt("age");  
        System.out.println(jsonobj.toString());  
        System.out.println(name+":"+age);   
        System.out.println("**********");  
          
        // Test JSONArray.  
        JSONArray jsonarray = new JSONArray("[{'name':'jingshou','age':30},{'name':'xiaohong','age':29}]");    
        for(int i=0;i<jsonarray.length();i++){  
            JSONObject jo = jsonarray.getJSONObject(i);  
            System.out.println(jo);  
            String name1 = jo.getString("name");  
            int age1 = jo.getInt("age");  
            System.out.println("name1= "+name1);  
            System.out.println("age1= "+age1);  
        }  
        //Ƕ��JSONObject��JSONArray����ʵ��

        String str = "{'name':'xiazdong','age':20,'book':['book1','book2']}";  
        JSONObject obj = new JSONObject(str);  
        System.out.println(obj.getJSONArray("book").getString(0));
    }  
      
**/ 
}  
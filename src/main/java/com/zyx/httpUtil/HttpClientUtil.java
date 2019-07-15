package com.zyx.httpUtil;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 
 * @author zyx
 *
 */
public class HttpClientUtil {

    // utf-8�ַ�����
    public static final String CHARSET_UTF_8 = "utf-8";

    // HTTP�������͡�
    public static final String CONTENT_TYPE_TEXT_HTML = "text/xml";

    // HTTP�������͡��൱��form������ʽ���ύ����
    public static final String CONTENT_TYPE_FORM_URL = "application/x-www-form-urlencoded";

    // HTTP�������͡��൱��form������ʽ���ύ����
    public static final String CONTENT_TYPE_JSON_URL = "application/json;charset=utf-8";
    

    // ���ӹ�����
    private static PoolingHttpClientConnectionManager pool;

    // ��������
    private static RequestConfig requestConfig;

    static {
        
        try {
            System.out.println("��ʼ��HttpClientTest~~~��ʼ");
            SSLContextBuilder builder = new SSLContextBuilder();
            builder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    builder.build());
            // ����ͬʱ֧�� HTTP �� HTPPS
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create().register(
                    "http", PlainConnectionSocketFactory.getSocketFactory()).register(
                    "https", sslsf).build();
            // ��ʼ�����ӹ�����
            pool = new PoolingHttpClientConnectionManager(
                    socketFactoryRegistry);
            // ��������������ӵ�200��ʵ����Ŀ��ô������ļ��ж�ȡ���ֵ
            pool.setMaxTotal(200);
            // �������·��
            pool.setDefaultMaxPerRoute(2);
            // ����Ĭ�ϳ�ʱ���Ƴ�ʼ��requestConfig
            int socketTimeout = 10000;
            int connectTimeout = 10000;
            int connectionRequestTimeout = 10000;
            requestConfig = RequestConfig.custom().setConnectionRequestTimeout(
                    connectionRequestTimeout).setSocketTimeout(socketTimeout).setConnectTimeout(
                    connectTimeout).build();

            System.out.println("��ʼ��HttpClientTest~~~����");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        

        // ��������ʱʱ��
        requestConfig = RequestConfig.custom().setSocketTimeout(50000).setConnectTimeout(50000)
                .setConnectionRequestTimeout(50000).build();
    }

    public static CloseableHttpClient getHttpClient() {
        
        CloseableHttpClient httpClient = HttpClients.custom()
                // �������ӳع���
                .setConnectionManager(pool)
                // ������������
                .setDefaultRequestConfig(requestConfig)
                // �������Դ���
                .setRetryHandler(new DefaultHttpRequestRetryHandler(0, false))
                .build();
        
        return httpClient;
    }

    /**
     * ����Post����
     * 
     * @param httpPost
     * @return
     */
    private static String sendHttpPost(HttpPost httpPost) {

        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        // ��Ӧ����
        String responseContent = null;
        try {
            // ����Ĭ�ϵ�httpClientʵ��.
            httpClient = getHttpClient();
            // ����������Ϣ
            httpPost.setConfig(requestConfig);
            // ִ������
            response = httpClient.execute(httpPost);
            // �õ���Ӧʵ��
            HttpEntity entity = response.getEntity();

            // ���Ի����Ӧͷ
            // Header[] headers = response.getHeaders(HttpHeaders.CONTENT_TYPE);
            // for (Header header : headers) {
            // System.out.println(header.getName());
            // }

            // �õ���Ӧ����
            // System.out.println(ContentType.getOrDefault(response.getEntity()).getMimeType());

            // �ж���Ӧ״̬
            if (response.getStatusLine().getStatusCode() >= 300) {
                throw new Exception(
                        "HTTP Request is not success, Response code is " + response.getStatusLine().getStatusCode());
            }

            if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
                responseContent = EntityUtils.toString(entity, CHARSET_UTF_8);
                EntityUtils.consume(entity);
                System.out.println(entity.getContentType());  
                System.out.println(entity.getContentLength());  
                  
                //String resString = EntityUtils.toString(entity);  
                // ʹ�÷��ص��ַ���ֱ�ӹ���һ��JSONObject       
                JSONObject jsonobj = new JSONObject(responseContent);  
                System.out.println(jsonobj.toString());  
                // ��ȡ���ض�����"resultSize��ֵ"  
                int resutltSize = jsonobj.getInt("resultSize");  
                System.out.println("Search Results Size is: "+ resutltSize);   
                // ��ȡ"clients"��ֵ,����һ��JSONArray  
                JSONArray jsonarray = jsonobj.getJSONArray("clients");  
                System.out.println(jsonarray.toString());  
                  
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // �ͷ���Դ
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseContent;
    }

    /**
     * ����Get����
     * 
     * @param httpGet
     * @return
     */
    private static String sendHttpGet(HttpGet httpGet) {

        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        // ��Ӧ����
        String responseContent = null;
        try {
            // ����Ĭ�ϵ�httpClientʵ��.
            httpClient = getHttpClient();
            // ����������Ϣ
            httpGet.setConfig(requestConfig);
            // ִ������
            response = httpClient.execute(httpGet);
            // �õ���Ӧʵ��
            HttpEntity entity = response.getEntity();

            // ���Ի����Ӧͷ
            // Header[] headers = response.getHeaders(HttpHeaders.CONTENT_TYPE);
            // for (Header header : headers) {
            // System.out.println(header.getName());
            // }

            // �õ���Ӧ����
            // System.out.println(ContentType.getOrDefault(response.getEntity()).getMimeType());

            // �ж���Ӧ״̬
            if (response.getStatusLine().getStatusCode() >= 300) {
                throw new Exception(
                        "HTTP Request is not success, Response code is " + response.getStatusLine().getStatusCode());
            }

            if (HttpStatus.SC_OK == response.getStatusLine().getStatusCode()) {
                responseContent = EntityUtils.toString(entity, CHARSET_UTF_8);
                EntityUtils.consume(entity);
                System.out.println(entity.getContentType());  
                System.out.println(entity.getContentLength());  
                  
                //String resString = EntityUtils.toString(entity);  
                // ʹ�÷��ص��ַ���ֱ�ӹ���һ��JSONObject       
                JSONObject jsonobj = new JSONObject(responseContent);  
                System.out.println(jsonobj.toString());  
                // ��ȡ���ض�����"resultSize��ֵ"  
                int resutltSize = jsonobj.getInt("resultSize");  
                System.out.println("Search Results Size is: "+ resutltSize);   
                // ��ȡ"clients"��ֵ,����һ��JSONArray  
                JSONArray jsonarray = jsonobj.getJSONArray("clients");  
                System.out.println(jsonarray.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // �ͷ���Դ
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return responseContent;
    }
    
    
    
    /**
     * ���� post����
     * 
     * @param httpUrl
     *            ��ַ
     */
    public static String sendHttpPost(String httpUrl) {
        // ����httpPost
        HttpPost httpPost = new HttpPost(httpUrl);
        return sendHttpPost(httpPost);
    }

    /**
     * ���� get����
     * 
     * @param httpUrl
     */
    public static String sendHttpGet(String httpUrl) {
        // ����get����
        HttpGet httpGet = new HttpGet(httpUrl);
        return sendHttpGet(httpGet);
    }
    
    

    /**
     * ���� post���󣨴��ļ���
     * 
     * @param httpUrl
     *            ��ַ
     * @param maps
     *            ����
     * @param fileLists
     *            ����
     */
    public static String sendHttpPost(String httpUrl, Map<String, String> maps, List<File> fileLists) {
        HttpPost httpPost = new HttpPost(httpUrl);// ����httpPost
        MultipartEntityBuilder meBuilder = MultipartEntityBuilder.create();
        if (maps != null) {
            for (String key : maps.keySet()) {
                meBuilder.addPart(key, new StringBody(maps.get(key), ContentType.TEXT_PLAIN));
            }
        }
        if (fileLists != null) {
            for (File file : fileLists) {
                FileBody fileBody = new FileBody(file);
                meBuilder.addPart("files", fileBody);
            }
        }
        HttpEntity reqEntity = meBuilder.build();
        httpPost.setEntity(reqEntity);
        return sendHttpPost(httpPost);
    }

    /**
     * ���� post����
     * 
     * @param httpUrl
     *            ��ַ
     * @param params
     *            ����(��ʽ:key1=value1&key2=value2)
     * 
     */
    public static String sendHttpPost(String httpUrl, String params) {
        HttpPost httpPost = new HttpPost(httpUrl);// ����httpPost
        try {
            // ���ò���
            if (params != null && params.trim().length() > 0) {
                StringEntity stringEntity = new StringEntity(params, "UTF-8");
                stringEntity.setContentType(CONTENT_TYPE_FORM_URL);
                httpPost.setEntity(stringEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendHttpPost(httpPost);
    }

    /**
     * ���� post����
     * 
     * @param maps
     *            ����
     */
    public static String sendHttpPost(String httpUrl, Map<String, String> maps) {
        String parem = convertStringParamter(maps);
        return sendHttpPost(httpUrl, parem);
    }

    
    
    
    /**
     * ���� post���� ����json����
     * 
     * @param httpUrl
     *            ��ַ
     * @param paramsJson
     *            ����(��ʽ json)
     * 
     */
    public static String sendHttpPostJson(String httpUrl, String paramsJson) {
        HttpPost httpPost = new HttpPost(httpUrl);// ����httpPost
        try {
            // ���ò���
            if (paramsJson != null && paramsJson.trim().length() > 0) {
                StringEntity stringEntity = new StringEntity(paramsJson, "UTF-8");
                stringEntity.setContentType(CONTENT_TYPE_JSON_URL);
                httpPost.setEntity(stringEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendHttpPost(httpPost);
    }
    
    /**
     * ���� post���� ����xml����
     * 
     * @param httpUrl   ��ַ
     * @param paramsXml  ����(��ʽ Xml)
     * 
     */
    public static String sendHttpPostXml(String httpUrl, String paramsXml) {
        HttpPost httpPost = new HttpPost(httpUrl);// ����httpPost
        try {
            // ���ò���
            if (paramsXml != null && paramsXml.trim().length() > 0) {
                StringEntity stringEntity = new StringEntity(paramsXml, "UTF-8");
                stringEntity.setContentType(CONTENT_TYPE_TEXT_HTML);
                httpPost.setEntity(stringEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sendHttpPost(httpPost);
    }
    

    /**
     * ��map���ϵļ�ֵ��ת���ɣ�key1=value1&key2=value2 ����ʽ
     * 
     * @param parameterMap
     *            ��Ҫת���ļ�ֵ�Լ���
     * @return �ַ���
     */
    public static String convertStringParamter(Map parameterMap) {
        StringBuffer parameterBuffer = new StringBuffer();
        if (parameterMap != null) {
            Iterator iterator = parameterMap.keySet().iterator();
            String key = null;
            String value = null;
            while (iterator.hasNext()) {
                key = (String) iterator.next();
                if (parameterMap.get(key) != null) {
                    value = (String) parameterMap.get(key);
                } else {
                    value = "";
                }
                parameterBuffer.append(key).append("=").append(value);
                if (iterator.hasNext()) {
                    parameterBuffer.append("&");
                }
            }
        }
        return parameterBuffer.toString();
    }
/**
    public static void main(String[] args) throws Exception {
        
        //System.out.println(sendHttpGet("http://www.baidu.com"));
        System.out.println(sendHttpPost("http://lavasoft.blog.51cto.com/62575/64994", ""));
        
    }
**/
}

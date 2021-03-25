/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impostazioni;

/*          se non servono cancellare
import io.joshworks.restclient.http.HttpResponse;
import io.joshworks.restclient.http.JsonNode;
import io.joshworks.restclient.http.mapper.ObjectMapper;

import java.util.Scanner;

import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;


*/
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;


public class Richieste {
    
    private String protocol = "";
    private String address = "";
    private String port = "";
    private String url = "";
    private HttpClient client;

    public Richieste(String protocol, String address, String port) {
        this.protocol = protocol;
        this.address = address;
        this.port = port;
        this.genera_url();
        client = new HttpClient();
    }
    
    public Richieste(){
        
        client = new HttpClient();
        
    }
    
    private void genera_url(){
        
        this.setUrl(this.getProtocol() + "://" + this.getAddress() + ":" + this.getPort());
    }

     public InputStream GetRichiesta(String contex, Map nameValuePair, Map header) {
        GetMethod gt = new GetMethod(url + contex);  //permette di fare le richieste di tipo get
        NameValuePair[] vettore;
        if (nameValuePair == null) {
            nameValuePair = new HashMap();
        }
        if (header == null) {
            header = new HashMap();
        }

        if (!nameValuePair.isEmpty()) {
            Iterator iterator = nameValuePair.entrySet().iterator();
            vettore = new NameValuePair[nameValuePair.size()];
            int indice = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                NameValuePair nvk = new NameValuePair();
                nvk.setName(key);
                nvk.setValue(value);
                vettore[indice] = nvk;
                indice++;
                iterator.remove();
            }
            gt.setQueryString(vettore);
        }
        if (!header.isEmpty()) {
            Iterator iterator = header.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                gt.addRequestHeader(key, value);
                iterator.remove();
            }

        }

        try {
            int executeMethod = client.executeMethod(gt);
            System.out.println(executeMethod);
            if (executeMethod != 200) {
                return null;
            }
            return gt.getResponseBodyAsStream();
        } catch (IOException ex) {
            return null;
        }

    }

    public InputStream PostRichiesta(String contex, Map nameValuePair, Map header) {
        PostMethod pt = new PostMethod(url + contex);
        NameValuePair[] vettore;
        if (nameValuePair == null) {
            nameValuePair = new HashMap();
        }
        if (header == null) {
            header = new HashMap();
        }
        if (!nameValuePair.isEmpty()) {
            Iterator iterator = nameValuePair.entrySet().iterator();
            vettore = new NameValuePair[nameValuePair.size()];
            int indice = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                NameValuePair nvk = new NameValuePair();
                nvk.setName(key);
                nvk.setValue(value);
                vettore[indice] = nvk;
                indice++;
                iterator.remove();
            }
            pt.setQueryString(vettore);
        }
        if (!header.isEmpty()) {
            Iterator iterator = header.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                pt.addRequestHeader(key, value);
                iterator.remove();
            }

        }

        try {
            int executeMethod = client.executeMethod(pt);
            System.out.println(executeMethod);
            if (executeMethod != 200) {
                return null;
            }
            
            System.out.println(pt.getResponseBodyAsStream());
            return pt.getResponseBodyAsStream();
        } catch (IOException ex) {
            return null;
        }

    }

    public InputStream PostRichiesta(String contex, Map nameValuePair, Map header, InputStream is) {
        PostMethod pt = new PostMethod(url + contex);
        NameValuePair[] vettore;
        if (nameValuePair == null) {
            nameValuePair = new HashMap();
        }
        if (header == null) {
            header = new HashMap();
        }
        if (!nameValuePair.isEmpty()) {
            Iterator iterator = nameValuePair.entrySet().iterator();
            vettore = new NameValuePair[nameValuePair.size()];
            int indice = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                NameValuePair nvk = new NameValuePair();
                nvk.setName(key);
                nvk.setValue(value);
                vettore[indice] = nvk;
                indice++;
                iterator.remove();
            }
            pt.setQueryString(vettore);
        }
        if (!header.isEmpty()) {
            Iterator iterator = header.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                pt.addRequestHeader(key, value);
                iterator.remove();
            }

        }
        pt.setRequestEntity(new InputStreamRequestEntity(is));
        try {
            int executeMethod = client.executeMethod(pt);
            System.out.println(executeMethod);
            if (executeMethod != 401) {
                return null;
            }
            return pt.getResponseBodyAsStream();
        } catch (IOException ex) {
            return null;
        }

    }

    public int PutRichiesta(String contex, Map nameValuePair, Map header, InputStream is) {
        PutMethod pt = new PutMethod(url + contex);
        NameValuePair[] vettore;
        if (nameValuePair == null) {
            nameValuePair = new HashMap();
        }
        if (header == null) {
            header = new HashMap();
        }
        if (!nameValuePair.isEmpty()) {
            Iterator iterator = nameValuePair.entrySet().iterator();
            vettore = new NameValuePair[nameValuePair.size()];
            int indice = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                NameValuePair nvk = new NameValuePair();
                nvk.setName(key);
                nvk.setValue(value);
                vettore[indice] = nvk;
                indice++;
                iterator.remove();
            }
            pt.setQueryString(vettore);
        }
        if (!header.isEmpty()) {
            Iterator iterator = header.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                pt.addRequestHeader(key, value);
                iterator.remove();
            }

        }
        pt.setRequestEntity(new InputStreamRequestEntity(is));
        int executeMethod = -1;
        try {
            executeMethod = client.executeMethod(pt);
            System.out.println(executeMethod);

        } catch (IOException ex) {
            return -1;
        }

        return executeMethod;
    }

    public int DeleteRichiesta(String contex, Map nameValuePair, Map header) {
        DeleteMethod gt = new DeleteMethod(url + contex);
        NameValuePair[] vettore;
        if (nameValuePair == null) {
            nameValuePair = new HashMap();
        }
        if (header == null) {
            header = new HashMap();
        }

        if (!nameValuePair.isEmpty()) {
            Iterator iterator = nameValuePair.entrySet().iterator();
            vettore = new NameValuePair[nameValuePair.size()];
            int indice = 0;
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                NameValuePair nvk = new NameValuePair();
                nvk.setName(key);
                nvk.setValue(value);
                vettore[indice] = nvk;
                indice++;
                iterator.remove();
            }
            gt.setQueryString(vettore);
        }
        if (!header.isEmpty()) {
            Iterator iterator = header.entrySet().iterator();

            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next(); //chiave - valore 
                String key = (String) pair.getKey();
                String value = (String) pair.getValue();
                gt.addRequestHeader(key, value);
                iterator.remove();
            }

        }

        try {
            int executeMethod = client.executeMethod(gt);
            System.out.println(executeMethod);
            return executeMethod;

        } catch (IOException ex) {
            return -1;
        }

    }
    
    
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpClient getClient() {
        return client;
    }

    public void setClient(HttpClient client) {
        this.client = client;
    }
    
    
    
    
}

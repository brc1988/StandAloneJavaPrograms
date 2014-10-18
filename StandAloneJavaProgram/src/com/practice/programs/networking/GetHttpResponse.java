package com.practice.programs.networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author choudhuryb
 */
public class GetHttpResponse {
    
     public static void main(String[] arg) {
        try {
            //change url to see 
            URL url = new URL("https://www.google.com/news");
            URLConnection conn = url.openConnection();
            conn.getHeaderFields();
            System.out.println(conn.getHeaderFields().size());
            System.out.println(conn.getContent());
        } catch (IOException ex) {
           ex.printStackTrace(); 
        } 
         
     
     
     }
    
}

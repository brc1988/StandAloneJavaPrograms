package com.practice.programs.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author choudhuryb
 */
public class GetIPAddress {
    
    public static void main(String[] arg) {
        try {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name            : "+ip.getHostName());
            System.out.println("Host IP              : "+ip.getHostAddress());
            System.out.println("Canonical Host Name  : "+ip.getCanonicalHostName());            
        } catch (UnknownHostException ex) {
           ex.printStackTrace();
        }
    
    }
    
}

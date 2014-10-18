package com.practice.programs.networking;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author choudhuryb
 */
public class MacAddress {

    public static void main(String[] arg)  {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("InetAddress           : " + ip);
            System.out.println("Host name             : " + ip.getHostName());
            System.out.println("Host Address          : " + ip.getHostAddress());
            System.out.println("Canonical Host Name   : " + ip.getCanonicalHostName());
            
            NetworkInterface nw = NetworkInterface.getByInetAddress(ip);
            byte [] mac = nw.getHardwareAddress();
            
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<mac.length;i++){
            sb.append(mac[i]);
            if((i<mac.length-1))
            sb.append("-");
            }
            
            
            System.out.println("MAC Address           : " + sb.toString());
           
            
//            System.out.println("Is Any Local Address  : " + ip.isAnyLocalAddress());
//            System.out.println("Is Link Local Address : " + ip.isLinkLocalAddress());
//            System.out.println("Is Loop Back Address  : " + ip.isLoopbackAddress());
//            System.out.println("Is MC Global          : " + ip.isMCGlobal());

        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}

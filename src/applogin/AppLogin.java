/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;

import java.security.MessageDigest;

/**
 * Descripción: Login con diferentes encriptadores.
 * @author Khrypton
 */
public class AppLogin {
    
    //==========================================================================
    //--------------------- ENCRIPTADO CON MD5 ---------------------------------
    //==========================================================================
    //Encriptar con MD5 una cadena
    public static String getMD5(String cadena) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(cadena.getBytes());
        int size = b.length;
        StringBuilder h = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int u = b[i] & 255;
            if (u < 16)
            {
                h.append("0").append(Integer.toHexString(u));
            }
            else
            {
                h.append(Integer.toHexString(u));
            }
        }
        return h.toString();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(getMD5("John"));
        }
        catch (Exception e) {
            System.out.println("Error..." + e);
        }
        
    }
    
}

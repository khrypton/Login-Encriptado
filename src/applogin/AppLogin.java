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
    
    //==========================================================================
    //--------------------- MI PROPIO ENCRIPTADOR ------------------------------
    //==========================================================================
    //Mi encriptador
    public static String miEncriptador(String Cadena){
        try {
            //Inicializa Nueva cadena
            String CadenaEncriptada = "";
            //Longitud de la cadena
            int N = Cadena.length();
            //Encritar cadena
            for(int i=0; i<N; i++){
                //Convertir cada caracter de la cadena a su codigo ascci
                char Caracter = Cadena.charAt(i);
                int NumAscci = (int)(Caracter);
                //Suma el numero ascci del caracter mas la longitud de la cadena
                CadenaEncriptada += String.valueOf(NumAscci+N);
            }
            return CadenaEncriptada;
            
        } catch (Exception e) {
            System.out.println("Error..." + e);
            return null;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(miEncriptador("John"));
        }
        catch (Exception e) {
            System.out.println("Error..." + e);
        }
        
    }
    
}

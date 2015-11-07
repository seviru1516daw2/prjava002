/*
*To change this template, choose Tools | Templates
*and open the template in the editor.
*/

package prjava002;

import java.io.*;
import java.net.*;

/**
 * 
 * @author sergi --> svr1516daw2@gmail.com
 */

public class Prjava002 {
    
    /**
     * 
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        System.out.println("versió 0.1 del projecte prjava002");
        try {
           InetAddress adreça = InetAddress.getLocalHost();
           String hostname = adreça.getHostName();
           System.out.println("hostname= "+hostname);
           System.out.println("Nom de l'usuari: "+ System.getProperty("user.name"));
           System.out.println("Carpeta Personal: "+ System.getProperty("user.home"));
           System.out.println("Sistema Operatiu: "+ System.getProperty("os.name"));
           System.out.println("Versió OS: "+System.getProperty("os.version"));
           System.out.println("Creació d'una branca del projecte prjava02");
        }
        catch (IOException e){
            
        }
    }
    
}

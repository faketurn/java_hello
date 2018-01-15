    
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
    
/**
 *
 * @author samantha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("お名前を入力してください");
        String name = inputName();
        System.out.println("こんにちは" + name + "さん！");
    }
    private static String inputName() {
        String name = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = in.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        
        return name;
    }
    
}

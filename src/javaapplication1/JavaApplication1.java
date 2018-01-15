    
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
    
/**
 *
 * @author samantha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxInt = 1000;
        Random random = new Random();
        int answer = random.nextInt(maxInt);
        System.out.println("***数当てゲームをしよう！***");
        System.out.print("0から" + maxInt + "までの数字だよ。\n予想した数字を入れてね。");
        int loop = 7;
        System.out.println(loop + "回チャレンジできるよ。");
        for (int i = 0; i < loop; i++) {
            System.out.printf("%d> ", i + 1);
            int guess = inputInt(maxInt);
            if (answer == guess) {
                System.out.printf("正解！%dだったね。", answer);
                break;
            }
            if (i == loop - 1) {
                System.out.println("残念。正解は" + answer + "でした。またね！");
                break;
            }
            if (answer < guess) {
                System.out.println("もっと小さい数だよ！");
            } else {
                System.out.println("もっと大きな数だよ！");
            }
        }
    }
    private static String inputString() {
        String name = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = in.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return name;
    }
    private static int inputInt(int maxInt) {
        int userInt = 0;
        while (true) {
            while (true) {
                String s = inputString();
                try {
                    userInt = Integer.parseInt(s);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("もう一度入力してください");
                }
            }
            if (userInt > maxInt) {
                System.out.println(maxInt + "より小さい数を入力してね！");
            } else if (userInt < 0) {
                System.out.println("0以上の数を入力してね！");
            } else {
                break;
            }
        }
        return userInt;
    }
}

package jp.ac.uryukyu.ie.e175752;
import java.util.Scanner;

public class Kuku {
//九九の表を出力できるコードを有効活用して、九九の段を学べるコードを書きたい。

    public void SetKuku() {
        double rand = Math.random() * 9 + 1;
        double rand_2 = Math.random() * 9 + 1;
        //ランダムな数字を選ぶ
        System.out.println((int) rand);
        System.out.println((int) rand_2);
        //どの数字でかけているのかを出力させる。

        int number = (int) rand;
        int number_2 = (int) rand_2;
        //System.out.println(number * number_2);
        // 答えを可視化するときに有効にする。
        int ns = (int) rand * (int) rand_2;

        Scanner in = new Scanner(System.in);
        int k = 0;
        //問題は最大五回まで答えることができるようにする。
        while (k < 5) {
            int i = in.nextInt();
            if (i == ns) {
                System.out.println("正解！！（せいかい）");
                break;
            } else {
                System.out.println("まちがい！");
                k++;
            }
        }
    }

    public void SetMore() {
        System.out.println("第二問！！");

        double rand_3 = Math.random() * 9 + 1;
        double rand_4 = Math.random() * 9 + 1;
        System.out.println((int) rand_3);
        System.out.println((int) rand_4);
        //どの数字でかけているのかを出力させる。

        int number_1 = (int) rand_3;
        int number_3 = (int) rand_4;
        //System.out.println(number * number_2);
        // 答えを可視化させるときに有効にする。
        int nj = (int) rand_3 * (int) rand_4;


        Scanner in = new Scanner(System.in);
        int j = 0;
        //問題は最大五回まで答えることができるようにする。
        while (j < 5) {
            int i = in.nextInt();
            if (i == nj) {
                System.out.println("正解！！（せいかい）");
                break;
            } else {
                System.out.println("まちがい！");
                j++;
            }
        }
    }

    public void SetTake() {
        System.out.println("第三問！！");

        double rand_5 = Math.random() * 9 + 1;
        double rand_6 = Math.random() * 9 + 1;
        System.out.println((int) rand_5);
        System.out.println((int) rand_6);
        //どの数字でかけているのかを出力させる。

        int number_1 = (int) rand_5;
        int number_3 = (int) rand_6;
        //System.out.println(number * number_2);
        // 答えを可視化させるときに有効にする。
        int dj = (int) rand_5 * (int) rand_6;


        Scanner in = new Scanner(System.in);
        int j = 0;
        //問題は最大五回まで答えることができるようにする。
        while (j < 5) {
            int i = in.nextInt();
            if (i == dj) {
                System.out.println("正解！！（せいかい）");
                break;
            } else {
                System.out.println("まちがい！");
                j++;
            }
        }
    }
}



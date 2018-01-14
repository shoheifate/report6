package jp.ac.uryukyu.ie.e175752;

public class Main {
    public static void main(String[] args){
        System.out.println("九九の表（ひょう）");
        System.out.println("この表を参考（さんこう）にして、九九の問題（もんだい）を解（と）いてみよう！！");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        Kuku kuku = new Kuku();
        System.out.println("第一問！！（だいいちもん)");
        System.out.println("数字（すうじ）を入力（にゅうりょく）してね！！()");
        kuku.SetKuku();
        kuku.SetMore();
    }
}

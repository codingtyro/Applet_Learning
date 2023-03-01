package 二三年03月01号.Code;

import java.util.Scanner;


/**
 * 输入的案例
 */
public class InputTest{
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner input = new Scanner(System.in);
        //输入字符串
        //使用nextLine方法是因为在输入行中可能包含空格。
        //要想读取一个单词（以空白符作为分隔符），可以调用next()方法。
        String name = input.nextLine();
        name = input.next();
        System.out.println(name);
        //读取整数，使用nextInt()方法。
        int age = input.nextInt();
        System.out.println(age);

        //读取浮点数，使用nextDouble()方法
        double score = input.nextDouble();
        System.out.println(score);
        input.close();
    }
}
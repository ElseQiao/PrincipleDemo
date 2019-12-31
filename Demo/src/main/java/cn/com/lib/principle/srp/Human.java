package cn.com.lib.principle.srp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 14:37
 * Describe:单一职责示例，Human只做“吃”这一件事
 */
public class Human {
    public void eat(String what){
        System.out.print(String.format("吃了%S"));
    }
}

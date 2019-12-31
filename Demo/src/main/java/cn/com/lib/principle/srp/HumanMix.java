package cn.com.lib.principle.srp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 14:51
 * Describe:HumanMix在方法级别上违背了单一职责，导致HumanMix一个类同时做了吃饭和唱歌两件事
 */
public class HumanMix {
    public void eat(String what){
        System.out.print(String.format("吃了%S",what));
    }

    public void drink(String what){
        System.out.print(String.format("喝了%S",what));
    }
}

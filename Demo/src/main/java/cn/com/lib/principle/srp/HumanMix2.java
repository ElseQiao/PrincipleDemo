package cn.com.lib.principle.srp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 14:58
 * Describe:在代码级别违背了单一职责
 */
public class HumanMix2 {
    public void eat(String what){
        if("水".equals(what)){
            System.out.print(String.format("喝了%S"));
        }else{
            System.out.print(String.format("吃了%S"));
        }
    }
}

package cn.com.lib.principle.dip;

import cn.com.lib.principle.dip.basemodel.IContent;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 17:24
 * Describe:
 */
public class HumanPro {
    public void read(IContent content){
        System.out.print(content.getContent());
    }
}

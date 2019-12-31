package cn.com.lib.principle.dip.basemodel;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 17:30
 * Describe:
 */
public class PlayBoy implements IContent {
    @Override
    public String getContent() {
        return "这是一本少儿不宜的书。。。。";
    }
}

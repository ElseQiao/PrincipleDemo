package cn.com.lib.principle.dip.basemodel;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 17:27
 * Describe:
 */
public class ComicBook implements IContent {
    @Override
    public String getContent() {
        return "这是一本漫画书。。。。。";
    }
}

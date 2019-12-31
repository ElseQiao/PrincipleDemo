package cn.com.lib.principle.lsp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 16:36
 * Describe:
 */
public class Window {
    public void show (View child){
        child.draw();
    }
}

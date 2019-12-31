package cn.com.lib.principle.ocp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 15:51
 * Describe:
 */
public interface ImageCache {
    void put(Bitmap image);
    Bitmap get(String url);
}

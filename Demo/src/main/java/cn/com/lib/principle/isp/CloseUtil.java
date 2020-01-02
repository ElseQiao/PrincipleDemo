package cn.com.lib.principle.isp;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Else.
 * Date: 2020/1/2
 * Time: 9:01
 * Describe:
 */
public final class CloseUtil {
    public static void Close(Closeable closeable){
        if(null!=closeable){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

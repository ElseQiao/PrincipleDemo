package cn.com.lib.principle.isp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 接口隔离原则（Interface Segregation Principle）
 * Created by Else.
 * Date: 2019/12/31
 * Time: 17:40
 * Describe:客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。
 *
 * 问题由来：类A通过接口I依赖类B，类C通过接口I依赖类D，如果接口I对于类A和类B来说不是最小接口，则类B和类D必须去实现他们不需要的方法。
 *
 * 解决方案：将臃肿的接口I拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则。
 *
 * 不再举例
 */
public class Isp {
    public static void main(String[] args) {
        File file=new File("c://test");
        FileOutputStream outputStream = null;
        //1.示例
        try {
             outputStream=new FileOutputStream(file);
            outputStream.write(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //对于如下代码，每次都需要嵌套try catch,比较繁琐
            if(null!=outputStream){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //2.接口隔离演示，对于所有需要关闭的流都实现了Closeable接口，该接口只有一个方法close()
        try {
            outputStream=new FileOutputStream(file);
            outputStream.write(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //接口隔离的好处(亦体现了依赖倒置)
            CloseUtil.Close(outputStream);
        }
    }
}

package cn.com.lib.principle.ocp;

/**
 * 开放-关闭原则（Open Close Principle）
 * Created by Else.
 * Date: 2019/12/31
 * Time: 15:17
 * Describe:一个软件实体如类、模块和函数应该对扩展开放，对修改关闭
 *
 * 在程序扩展新功能时，尽量不修改原有代码，而是进行扩展，使程序的扩展性好，维护性好
 *
 * 具体实现：继承和实现接口
 *
 * 示例：{@link ImageLoader}示例图片加载的过程，其中缓存的存取方式有多种，为了方便扩展使用接口对外开放，避免了
 * 需求不符时对{@link ImageUitl}的修改
 */
public class Ocp {
    public static void main(String[] strings){
        new ImageLoader().Display("https://www.cnblogs.com/fonxi/p/10860122.png");
    }
}

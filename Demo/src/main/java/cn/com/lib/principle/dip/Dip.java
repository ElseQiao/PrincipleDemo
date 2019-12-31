package cn.com.lib.principle.dip;

import cn.com.lib.principle.dip.basemodel.Book;
import cn.com.lib.principle.dip.basemodel.ComicBook;
import cn.com.lib.principle.dip.basemodel.PlayBoy;

/**
 * 依赖倒转原则(Dependence Inversion Principle)
 * Created by Else.
 * Date: 2019/12/31
 * Time: 16:55
 * Describe:高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
 *          应该面对接口/抽象编程，而不是面对细节编程
 *
 *问题由来：类A直接依赖类B，假如要将类A改为依赖类C，则必须通过修改类A的代码来达成。这种场景下，类A一般是高层
 * 模块，负责复杂的业务逻辑；类B和类C是低层模块，负责基本的原子操作；假如修改类A，会给程序带来不必要的风险。
 *
 * 解决方案：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低
 * 修改类A的几率。
 *
 * 依赖倒置原则基于这样一个事实：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建起来的架构比以细节
 * 为基础搭建起来的架构要稳定的多。在java中，抽象指的是接口或者抽象类，细节就是具体的实现类，使用接口或者抽象
 * 类的目的是制定好规范和契约，而不去涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成。
 *
 *
 */
public class Dip {
    public static void main(String[] args) {
        //1.book为低层模块内容，Human直接引用了底层实现细节
        Human human=new Human();
        human.read(new Book());

        //如果当book发生了变化，比如变成了电子书,同样的配方，Human却不能读取了
        //human.read(new EBook());
        //这种情况下要想读取EBook，就需要修改Human。相当于同时修改低层次和高层次两边

        //2.使用抽象方法，设计Human类
        HumanPro humanPro=new HumanPro();
        humanPro.read(new ComicBook());
        humanPro.read(new PlayBoy());

        //这里HumanPro可以读取更多类型的书，而且也不再依赖basemodel模块。哪怕basemodel模块成为了高层次模块，
        //只要实现了抽象方法，依然可以正常使用（这样一来就变成了里氏替换了？哈哈）

    }
}

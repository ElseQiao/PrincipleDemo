package cn.com.lib.principle.lsp;

/**
 * 里氏替换原则（Liskov Substitution Principle）
 * Created by Else.
 * Date: 2019/12/31
 * Time: 16:16
 * Describe:所有引用基类的地方必须能透明地使用其子类的对象。
 *
 * 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
 * 子类中可以增加自己特有的方法。
 * 当子类的方法重载父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
 * 当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格。
 *
 * 通俗的说法:只要父类出现的地方，子类就可以出现，并且不会出现问题。（我的理解是：这样一来就对重写进行了约束，
 * 一旦子类重写了父类，这样替换很容易出现问题，所以，应该避免重写非抽象方法）
 *
 * 示例：以Android中的window为例
 *       Window依赖View,View定义了视图抽象，任何继承自View的类都可以设置给Window的show方法，这就是里氏替换
 *
 * 里氏替换的核心原理是抽象，抽象依赖于继承特性，继承的优缺点比较明显，如下：
 * 优点：
 * 1.代码复用，减少类创建成本，每个子类都有父类的方法和属性
 * 2.子类与父类基本相似但又有所区别
 * 3.提高代码可扩展性
 * 缺点
 * 1.继承是侵入性的，只要继承父类就必须继承父类的属性和方法，可能造成子类代码冗余
 * 2.灵活性降低
 */
public class Lsp {
    public static void main(String[] args) {
        Window window=new Window();
        window.show(new Button());
        window.show(new TextView());
    }
}

package cn.com.lib.principle.srp;

/**
 * 单一职责原则（Single responsibility principle）
 * Created by Else.
 * Date: 2019/12/31
 * Time: 14:27
 * Describe:一个类的职责应该单一
 *
 * 如果一个类职责过多，应该拆分
 * 类如果职责单一，那导致类修改的原因也会唯一，不会因为多种原因都要去修改类）
 *
 * 优点：
 * 可以降低类的复杂度，一个类只负责一项职责，其逻辑肯定要比负责多项职责简单的多；
 * 提高类的可读性，提高系统的可维护性；
 * 变更引起的风险降低，变更是必然的，如果单一职责原则遵守的好，当修改一个功能时，可以显著降低对其他功能的影响。
 *
 * 如示例代码：
 * 1和2.0提现了单一职责原则
 * 2.1和2.2虽然修改起来简单一些，但是违背了单一职责原则：2.1通过修改代码增加了新的功能 2.2通过添加方法增加了新的功能
 *
 * 应用实例举例：
 * 比如做一个图片加载器的时候，不应该把所有的东西都写在一个类中，应该各个功能独立出来，可以分成图片加载功能和缓存功能等
 * 模块，这样类中的代码逻辑清晰可读性、可扩展性和可维护性会大大提高。
 */
public class Srp {

    public static void main(String[] strings){
        //1.单一职责示例
        Human human=new Human();
        human.eat("鱼");
        human.eat("蔬菜");
        human.eat("肉");

        //2.0假如添加了一个喝水的动作，需要添加一个类，来保证单一职责
        HumanDrink humanDrink=new HumanDrink();
        humanDrink.drink("水");

        //2.1 假如添加了一个喝水的动作,实际上可能会这样操作，从代码上违背了单一职责
        HumanMix2 humanMix2=new HumanMix2();
        humanMix2.eat("鱼");
        humanMix2.eat("蔬菜");
        humanMix2.eat("肉");
        humanMix2.eat("水");

        //2.2 假如添加了一个喝水的动作,实际上也可能会这样操作，从方法层面违背了单一职责
        HumanMix humanMix=new HumanMix();
        humanMix.eat("鱼");
        humanMix.eat("蔬菜");
        humanMix.eat("肉");
        humanMix.drink("水");
    }
}

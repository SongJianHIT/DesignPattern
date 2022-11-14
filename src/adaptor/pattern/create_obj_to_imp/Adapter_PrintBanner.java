/**
 * @projectName DesignPattern
 * @package adaptor.pattern
 * @className adaptor.pattern.create_obj_to_imp.Adapter_PrintBanner
 */
package adaptor.pattern.create_obj_to_imp;

/**
 * Adapter_PrintBanner
 * @description Adapter_PrintBanner类，就是介于我们需求和现实已有类之间的适配器，它对已经有的类进行适配修改，满足新的需求（如Print接口）
 *              实现方法二：通过委托实现 Adapter
 * @author SongJian
 * @date 2022/11/14 23:38
 * @version
 */
public class Adapter_PrintBanner extends Print{

    /**
     *  委托实现，相当于在 adapter 类中创建 adaptee（已有类）的对象，通过对象调用
     */
    private Adaptee_Banner banner;

    public Adapter_PrintBanner(String str) {
        banner = new Adaptee_Banner(str);
    }

    /**
     *   注意： 因为已经继承了，所以可以直接调用父类 Adaptee_Banner 的方法
     */

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
 

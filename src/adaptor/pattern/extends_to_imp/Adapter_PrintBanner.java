/**
 * @projectName DesignPattern
 * @package adaptor.pattern
 * @className adaptor.pattern.create_obj_to_imp.Adapter_PrintBanner
 */
package adaptor.pattern.extends_to_imp;

/**
 * Adapter_PrintBanner
 * @description Adapter_PrintBanner类，就是介于我们需求和现实已有类之间的适配器，它对已经有的类进行适配修改，满足新的需求（如Print接口）
 *              实现方法一：通过继承实现 Adapter
 * @author SongJian
 * @date 2022/11/14 23:38
 * @version
 */
public class Adapter_PrintBanner extends Adaptee_Banner implements Print {

    public Adapter_PrintBanner(String str) {
        super(str);
    }

    /**
     *   注意： 因为已经继承了，所以可以直接调用父类 Adaptee_Banner 的方法
     */

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
 

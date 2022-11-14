/**
 * @projectName DesignPattern
 * @package adaptor.pattern
 * @className adaptor.pattern.create_obj_to_imp.Adaptee_Banner
 */
package adaptor.pattern.create_obj_to_imp;

/**
 * Adaptee_Banner
 * @description Banner类，相当于现在已有的方法。这个方法很好，没有bug，我们希望能够在别处使用它。相当于"220V的交流电"
 * @author SongJian
 * @date 2022/11/14 23:28
 * @version
 */
public class Adaptee_Banner {
    private String str;
    public Adaptee_Banner(String str) {
        this.str = str;
    }

    // 打印字符串，并加上括号
    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    // 打印字符串，并加上星星
    public void showWithAster() {
        System.out.println("*" + str + "*");
    }
}
 

/**
 * @projectName DesignPattern
 * @package TemplateMethod.pattern
 * @className TemplateMethod.pattern.AbstractDisplay
 */
package TemplateMethod.pattern;

import java.io.InputStream;

/**
 * AbstractDisplay
 * @description AbstractClass，用于定义模版方法模式的模版流程和抽象类，供子类实现
 * @author SongJian
 * @date 2022/11/15 22:09
 * @version
 */
public abstract class AbstractDisplay {
    // 定义三个抽象方法，供给后面模版方法使用
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // 模版方法，不需要知道抽象方法具体怎么实现，用就完事了！
    // 定义为 final 是为了不让子类能够修改该方法
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
 

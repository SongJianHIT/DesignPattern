/**
 * @projectName DesignPattern
 * @package TemplateMethod.pattern
 * @className TemplateMethod.pattern.StringDisplay
 */
package TemplateMethod.pattern;

/**
 * StringDisplay
 *
 * @author SongJian
 * @description ConcreteClass，具体的实现类之一，实现了模版类中的抽象方法
 * @date 2022/11/15 22:19
 */
public class StringDisplay extends AbstractDisplay {

    private String string;

    public StringDisplay(String s) {
        this.string = s;
    }
    @Override
    public void open() {
        System.out.println("======= 开始打印字符串 =========");
    }

    @Override
    public void print() {
        System.out.println(string);
    }

    @Override
    public void close() {
        System.out.println("======= 打印字符串结束 =========");
    }
}
 


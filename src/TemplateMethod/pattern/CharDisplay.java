/**
 * @projectName DesignPattern
 * @package TemplateMethod.pattern
 * @className TemplateMethod.pattern.CharDisplay
 */
package TemplateMethod.pattern;

/**
 * CharDisplay
 * @description ConcreteClass，具体的实现类之一，继承AbstractDisplay
 * @author SongJian
 * @date 2022/11/15 22:16
 * @version
 */
public class CharDisplay extends AbstractDisplay{

    private char ch;
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<<");
    }

    @Override
    public void print() {
        System.out.print(ch + " ");
    }

    @Override
    public void close() {
        System.out.println(">>>");
    }
}
 

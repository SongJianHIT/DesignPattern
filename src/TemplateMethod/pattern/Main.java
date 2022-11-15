/**
 * @projectName DesignPattern
 * @package TemplateMethod.pattern
 * @className TemplateMethod.pattern.Main
 */
package TemplateMethod.pattern;

/**
 * Main
 * @description 主方法
 * @author SongJian
 * @date 2022/11/15 22:22
 * @version
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay a1 = new CharDisplay('S');
        AbstractDisplay a2 = new StringDisplay("Hello Word！");
        // 先执行a1，再执行a2
        a1.display();
        a2.display();
    }
}
 

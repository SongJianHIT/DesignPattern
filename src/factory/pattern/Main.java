/**
 * @projectName DesignPattern
 * @package factory.pattern
 * @className factory.pattern.Main
 */
package factory.pattern;

/**
 * Main
 * @description 主函数
 * @author SongJian
 * @date 2022/11/16 20:46
 * @version
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IdCardFactory();
        Product p1 = factory.create("小白菜");
        Product p2 = factory.create("小花菜");
        p1.use();
        p2.use();
    }
}
 

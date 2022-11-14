/**
 * @projectName DesignPattern
 * @package adaptor.pattern
 * @className adaptor.pattern.create_obj_to_imp.Main
 */
package adaptor.pattern.create_obj_to_imp;

/**
 * Main
 * @description 主函数
 * @author SongJian
 * @date 2022/11/14 23:42
 * @version
 */
public class Main {
    public static void main(String[] args) {
        // Adapter_PrintBanner 是适配器（Adapter），Print 是需求（Target）
        Print print = new Adapter_PrintBanner("今天很开心");
        System.out.println("强调一下：");
        print.printStrong();
        System.out.println("弱化一下：");
        print.printWeak();
    }
}
 

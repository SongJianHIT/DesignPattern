/**
 * @projectName DesignPattern
 * @package adaptor.pattern
 * @className adaptor.pattern.create_obj_to_imp.Print
 */
package adaptor.pattern.create_obj_to_imp;

/**
 * Print
 * @description Print类，是我们当下需要使用的功能，但希望能够使用已有的Adapter_Banner来实现
 * @author SongJian
 * @date 2022/11/14 23:34
 * @version
 */
public abstract class Print {
    // 弱化打印，相当于加括号
    public abstract void printWeak();
    // 强化打印，相当于加星星
    public abstract void printStrong();
}
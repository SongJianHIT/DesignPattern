/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.Iterator
 */
package iterator.pattern;

/**
 * Iterator
 * @description 迭代器接口，定义了迭代器需要完成哪些功能。具体的迭代器需要实现该接口。
 *              该接口定义了两个抽象方法：
 *                  1、 hasNext()：需要判断是否存在下一个元素
 *                  2、 next()：负责取下一个元素，并且移动到下一个位置
 * @author SongJian
 * @date 2022/11/13 22:14
 * @version
 */
public interface Iterator {
     public abstract boolean hasNext();
     public abstract Object next();
}
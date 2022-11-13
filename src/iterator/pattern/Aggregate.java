/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.Aggregate
 */
package iterator.pattern;

/**
 * Aggregate
 * @description Aggregate接口，具体的集合需要实现该接口，才能够使用迭代器进行访问
 *                  1、iterator()：获取具体的迭代器对象
 * @author SongJian
 * @date 2022/11/13 22:18
 * @version
 */

public interface Aggregate {
    public abstract Iterator iterator();
}
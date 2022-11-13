/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.main
 */
package iterator.pattern;

/**
 * main
 * @description 主方法
 * @author SongJian
 * @date 2022/11/13 22:41
 * @version
 */
public class main {
    public static void main(String[] args) {
        // 构建一个书架
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("《安徒生童话》"));
        bookShelf.appendBook(new Book("《巴啦啦大魔仙》"));
        bookShelf.appendBook(new Book("《德玛西亚》"));
        bookShelf.appendBook(new Book("《诺克萨斯》"));

        // 获取书架的迭代器
        Iterator it = bookShelf.iterator();

        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getBookName());
        }
    }
}
 

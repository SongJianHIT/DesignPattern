/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.BookShelf
 */
package iterator.pattern;

import java.util.ArrayList;

/**
 * BookShelf
 * @description 书架类，它作为一个集合存储图书。它需要实现Aggregate接口，从而实现对图书的遍历
 * @author SongJian
 * @date 2022/11/13 22:24
 * @version
 */
public class BookShelf implements Aggregate{

    // 存储图书的数据结构
    private ArrayList<Book> bookArrayList = new ArrayList<>();

    /**
     * @title getBookAt
     * @author SongJian
     * @param: index
     * @updateTime 2022/11/13 22:29
     * @return: iterator.pattern.Book
     * @throws
     * @description 根据索引，获取书架上对应索引的书籍对象
     */
    public Book getBookAt(int index) {
        return this.bookArrayList.get(index);
    }

    /**
     * @title appendBook
     * @author SongJian
     * @param: book
     * @updateTime 2022/11/13 22:31
     * @throws
     * @description 向书架中添加书籍对象
     */
    public void appendBook(Book book) {
        this.bookArrayList.add(book);
    }

    /**
     * @title getLength
     * @author SongJian
     * @updateTime 2022/11/13 22:31
     * @return: int
     * @throws
     * @description 获取当前书架内存放的书籍数量
     */
    public int getLength(){
        return this.bookArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
 

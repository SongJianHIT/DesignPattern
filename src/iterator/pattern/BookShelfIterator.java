/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.BookShelfIterator
 */
package iterator.pattern;

/**
 * BookShelfIterator
 * @description 书架迭代器类，实现了迭代器接口，负责专门对书架的书本进行迭代
 * @author SongJian
 * @date 2022/11/13 22:33
 * @version
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
 

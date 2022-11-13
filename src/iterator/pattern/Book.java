/**
 * @projectName DesignPattern
 * @package iterator.pattern
 * @className iterator.pattern.Book
 */
package iterator.pattern;

/**
 * Book
 * @description 图书类，将作为存入书柜（集合）中的对象
 * @author SongJian
 * @date 2022/11/13 22:22
 * @version
 */
public class Book {
    private String bookName;

    public Book (String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
 

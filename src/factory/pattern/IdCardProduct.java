/**
 * @projectName DesignPattern
 * @package factory.pattern
 * @className factory.pattern.IdCardProduct
 */
package factory.pattern;

/**
 * IdCardProduct
 * @description ID卡产品类，继承产品抽象类
 * @author SongJian
 * @date 2022/11/16 20:34
 * @version
 */
public class IdCardProduct extends Product{
    private String owner;
    // 这里是个伏笔！
    // 为了不让别的包可以直接 new 出 IdCardProduct 对象，将其构造器设置为 default 权限
    // 想要生成 IdCardProduct 对象，就必须用工厂！
    IdCardProduct(String owner) {
        System.out.println("正在制作 " + owner + " 的ID卡！");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println(owner + " 的ID卡正在使用～～～～～～");
    }

    public String getOwner() {
        return owner;
    }
}
 

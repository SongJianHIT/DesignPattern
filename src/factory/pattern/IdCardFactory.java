/**
 * @projectName DesignPattern
 * @package factory.pattern
 * @className factory.pattern.IdCardFactory
 */
package factory.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * IdCardFactory
 * @description Id卡的工厂类，继承工厂抽象类，实现具体生产Id卡的方法
 * @author SongJian
 * @date 2022/11/16 20:41
 * @version
 */
public class IdCardFactory extends Factory{

    // 记录我这个工厂生成了多少卡
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        System.out.println("ID工厂正在创建卡片！");
        return new IdCardProduct(owner);
    }

    @Override
    protected void regesterProduct(Product product) {
        owners.add(((IdCardProduct) product).getOwner());
        System.out.println("ID工厂正在注册卡片！");
    }

    public List getOwners() {
        return owners;
    }
}
 

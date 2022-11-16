/**
 * @projectName DesignPattern
 * @package factory.pattern
 * @className factory.pattern.Factory
 */
package factory.pattern;

/**
 * Factory
 * @description 工厂类，抽象类，负责创建产品实例，规定了产品的创建流程
 * @author SongJian
 * @date 2022/11/16 20:28
 * @version
 */
public abstract class Factory {
    // create 方法用于创建产品实例，定义了产品创建的流程：
    //  ———— 先创建、再注册返回产品
    public final Product create(String owner) {
        Product p = createProduct(owner);
        regesterProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void regesterProduct(Product product);
}
 

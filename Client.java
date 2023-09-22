import java.lang.reflect.Proxy;

/**
 * @author victorljli
 * @date 2023/09/22
 */
public class Client {
    public static void main(String[] args) throws Exception {

        Internet internet = (Internet) Proxy.newProxyInstance(
                RouterProxy.class.getClassLoader(),
                RouterProxy.class.getInterfaces(),
                new BlackListFilter(new RouterProxy())
        );
        internet.httpAccess("http://www.movie.com");
        internet.httpAccess("http://www.game.com");
        internet.httpAccess("http://www.learn.com");
        internet.httpAccess("http://www.work.com");
    }
}

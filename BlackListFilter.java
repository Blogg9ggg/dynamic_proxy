import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author victorljli
 * @date 2023/09/22
 */
public class BlackListFilter implements InvocationHandler {

    private List<String> blackList = Arrays.asList("movie", "novel", "music", "game");

    // 被代理的对象
    private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String url = args[0].toString();
        for (String keyword : blackList) {
            if (url.contains(keyword)) {
                System.out.println("禁止访问: " + url);
                return null;
            }
        }

        System.out.println("校验通过, 进入业务流程......");
        return method.invoke(origin, args);
    }
}

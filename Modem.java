/**
 * @author victorljli
 * @date 2023/09/22
 */
public class Modem implements Internet {

    private static final String correctPassword = "123456";

    public Modem(String password) throws Exception {
        if (!correctPassword.equals(password)) {
            throw new Exception("拨号失败, 请重试.");
        }

        System.out.println("连接成功.");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问: " + url);
    }

}

/**
 * @author victorljli
 * @date 2023/09/22
 */
public class RouterProxy implements Internet {

    private Internet modem;

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}

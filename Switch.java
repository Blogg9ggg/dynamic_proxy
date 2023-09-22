/**
 * @author victorljli
 * @date 2023/09/22
 */
public class Switch implements Intranet {

    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网: " + path);
    }

}

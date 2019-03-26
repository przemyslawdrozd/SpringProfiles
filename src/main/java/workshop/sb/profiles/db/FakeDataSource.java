package workshop.sb.profiles.db;


public class FakeDataSource {

    private String url;
    private int port;

    public FakeDataSource(String url, int port) {
        this.url = url;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}


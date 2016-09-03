package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
public class server {
    private final long id;
    private final String content;

    public server(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}

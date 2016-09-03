package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
public class Skills {
    private final boolean JAVA;
    private final boolean Git;
    public Skills(boolean JAVA, boolean Git){
        this.JAVA = JAVA;
        this.Git = Git;
    }

    public boolean getJAVA()
    {
        return JAVA;
    }

    public boolean getGit()
    {
        return Git;
    }

}

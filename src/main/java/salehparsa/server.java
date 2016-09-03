package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
public class server {
    private final String PersonalInfo;
    private final String Skills;

    public server (String PersonalInfo, String Skills){
        this.PersonalInfo = PersonalInfo;
        this.Skills = Skills;
    }
    public String getPersonalInfo()
    {
        return PersonalInfo;
    }
    public String getSkills()
    {
        return Skills;
    }
}

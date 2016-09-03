package salehparsa;

/**
 * Created by saleh on 9/3/16.
 */
public class PersonalInfo {
    private final String Name;
    private final String Family;
    private final String CurrentPosition;
    private final String CurrentLocation;
    private final String Birthdate;
    private final String email;

    public PersonalInfo( String Name, String Family, String CurrentPosition, String CurrentLocation, String Birthdate, String email) {
        this.Name = Name;
        this.Family = Family;
        this.CurrentPosition = CurrentPosition;
        this.CurrentLocation = CurrentLocation;
        this.Birthdate = Birthdate;
        this.email = email;
    }

    public String getName(){
        return Name;
    }

    public String getFamily(){
        return Family;
    }

    public String getCurrentPosition(){
        return CurrentPosition;
    }

    public String getCurrentLocation(){
        return CurrentLocation;
    }

    public String getBirthdate(){
        return Birthdate;
    }

    public String getEmail() { return email; }
}

package by.issoft.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.ToString;
import java.util.List;

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class Group {

    String groupname;
    List<Pupil> pupils;

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }


}

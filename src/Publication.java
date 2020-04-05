import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Publication {

    private String id;
    private String title;

    @XmlID
    @XmlElement
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }
}

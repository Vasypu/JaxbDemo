import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name = "books")
public class Books {

    private List<Publication> publications = new ArrayList<>();

    public void setPublications(List<Publication> publications) {
    this.publications = publications;
}

    @XmlElementWrapper
    @XmlElement(name = "publications")
    public List<Publication> getPublications() {
        if (publications == null) {
            publications = new ArrayList<>();
            //contours = Collections.EMPTY_LIST;
        }
        return publications;
    }
}
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "library")
public class Library {
    private List<Author> authors = new ArrayList<>();
    private List<Publication> publications = new ArrayList<>();

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @XmlElementWrapper
    @XmlElement(name = "authors")
    public List<Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<>();
            //contours = Collections.EMPTY_LIST;
        }
        return authors;
    }

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

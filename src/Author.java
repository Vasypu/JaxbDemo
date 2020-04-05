import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//@XmlRootElement
public class Author {

    //private String id;
    private String name;
    //@XmlElement(name = "publication")
    //private List<Publication> publication = new LinkedList<>();
    private Publication publication;

    public Author() {
        super();
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @XmlElement
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

//    @XmlIDREF
//    @XmlElementWrapper(name = "publication")
//    //@XmlElement(name = "publication")
//    public List<Publication> getPublications() {
//        return publication;
//    }
//
//    public void setPublications(List<Publication> publication) {
//        this.publication = publication;
//    }

    @XmlElement
    @XmlIDREF
    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }


//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 71 * hash + Objects.hashCode(this.publication);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Author other = (Author) obj;
//
//        if (!Objects.equals(this.publication, other.publication)) {
//            return false;
//        }
//
//        if (!Objects.equals(this.publication, other.publication)) {
//            return false;
//        }
//
//        return true;
//    }
}
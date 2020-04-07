import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.File;
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
    private static Books books = new Books();

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

    //@XmlAttribute
    @XmlElement
    //@XmlIDREF
    @XmlJavaTypeAdapter(PublicAdapter.class)
    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

//    @XmlElement
//    //@XmlIDREF
//    public Books getBooks() {
//        return books;
//    }
//
//    public void setBooks(Publication publication) {
//        books.getPublications().add(publication);
//        //this.books = books;
//    }
//
//    public static void main(String[] args) throws JAXBException {
//        JAXBContext context2 = JAXBContext.newInstance(Books.class);
//        Marshaller marshaller2 = context2.createMarshaller();
//        marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller2.marshal(books, new File("/root/Загрузки/Publications.xml"));
//    }
}
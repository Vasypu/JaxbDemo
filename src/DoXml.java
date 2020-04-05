import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBSource;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class DoXml {

    public static void main(String[] args) throws JAXBException, IOException {
        StringWriter writer = new StringWriter();

        Author author1 = new Author();
        author1.setName("Natasha");
        //author1.setId("12");

        List<Publication> publicList = new ArrayList<>();
        Publication firstPublication = new Publication();
        firstPublication.setTitle("Death on the Nile");
        firstPublication.setId("12");
        publicList.add(firstPublication);

        Publication secondPublication = new Publication();
        secondPublication.setId("24");
        secondPublication.setTitle("The murder of Roger Ackroyd");
        publicList.add(secondPublication);
        //author.setPublications(publicList);
        author1.setPublication(firstPublication);
        //author.setPublication(secondPublication);

        Author author2 = new Author();
        author2.setName("Mark");
        //author2.setId("24");
        author2.setPublication(secondPublication);

        Library library = new Library();
        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author2);
        library.setAuthors(authorList);
        library.setPublications(publicList);

        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(library, new File("/root/Загрузки/DoXml.xml"));
        marshaller.marshal(library, writer);
        System.out.println(writer);

    }
}
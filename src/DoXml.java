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


        Publication firstPublication = new Publication();
        firstPublication.setTitle("Death on the Nile");
        firstPublication.setId("12");

        Publication secondPublication = new Publication();
        secondPublication.setId("24");
        secondPublication.setTitle("The murder of Roger Ackroyd");

        List<Publication> publicList = new ArrayList<>();
        publicList.add(firstPublication);
        publicList.add(secondPublication);

        Books books = new Books();
        books.setPublications(publicList);

        Author author1 = new Author();
        author1.setName("Natasha");
        author1.setPublication(firstPublication);
        //author1.setId("12");
        Author author2 = new Author();
        author2.setName("Mark");
        author2.setPublication(secondPublication);

        List<Author> authorList = new ArrayList<>();
        authorList.add(author1);
        authorList.add(author2);

        Library library = new Library();
        library.setAuthors(authorList);

        //author.setPublications(publicList);
        //author1.setPublication(firstPublication);
        //author.setPublication(secondPublication);

        //author1.setBooks(books);
        //author1.setBooks(firstPublication);

        //author2.setBooks(books);
        //author2.setBooks(secondPublication);
        //author2.setId("24");
        //author2.setPublication(secondPublication);

        //library.setPublications(publicList);

        JAXBContext context = JAXBContext.newInstance(Library.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(library, new File("/root/Загрузки/DoXml.xml"));
        marshaller.marshal(library, System.out);
//        marshaller.marshal(library, writer);
//        System.out.println(writer);

        JAXBContext context2 = JAXBContext.newInstance(Books.class);
        Marshaller marshaller2 = context2.createMarshaller();
        marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller2.marshal(books, new File("/root/Загрузки/Publications.xml"));

    }
}
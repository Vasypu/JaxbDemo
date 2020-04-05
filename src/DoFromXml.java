import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class DoFromXml {


    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Library.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Library library = (Library) unmarshaller.unmarshal(new File("/root/Загрузки/DoXml.xml"));

        /*library.getAuthors().forEach(author -> {
                //System.out.println("Id " + author.getId());
                System.out.println("Name " + author.getName());
        });

        library.getPublications().forEach(publication -> {
                System.out.println("Id " + publication.getId());
                System.out.println("Title " + publication.getTitle());
        });*/

        library.getAuthors().forEach(author -> {

            System.out.println("author.getPublication().getTitle() " + author.getPublication().getTitle());
            System.out.println("author.getPublication().getId() " + author.getPublication().getId());
            System.out.println("author.getName() " + author.getName());
        });
    }
}
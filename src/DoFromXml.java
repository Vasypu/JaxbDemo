import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class DoFromXml {

    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Library.class, Books.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        //Library library = (Library) unmarshaller.unmarshal(new File("/root/Загрузки/DoXml.xml"));
        Books books = (Books) unmarshaller.unmarshal(new File("/root/Загрузки/Publications.xml"));

        Unmarshaller unmarshaller2 = context.createUnmarshaller();
        PublicAdapter adapter = new PublicAdapter();
        for (Publication publication : books.getPublications()) {
            adapter.getPublicationMap().put(publication.getId(), publication);
        }
        unmarshaller2.setAdapter(adapter);
        Library library = (Library) unmarshaller2.unmarshal(new File("/root/Загрузки/DoXml.xml"));

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(library, System.out);

        /*library.getAuthors().forEach(author -> {
                //System.out.println("Id " + author.getId());
                System.out.println("Name " + author.getName());
        });

        library.getPublications().forEach(publication -> {
                System.out.println("Id " + publication.getId());
                System.out.println("Title " + publication.getTitle());
        });*/

//        library.getAuthors().forEach(author -> {
//
////            author.getBooks().getPublications().forEach(publication -> {
////                System.out.println("publication.getTitle() " + publication.getTitle());
////                System.out.println("publication.getId() " + publication.getId());
////            });
//
//            System.out.println("author.getPublication().getTitle() " + author.getPublication().getTitle());
//            System.out.println("author.getPublication().getId() " + author.getPublication().getId());
//            System.out.println("author.getName() " + author.getName());
//        });

//        books.getPublications().forEach(publication -> {
//
//            System.out.println("publication.getId() " + publication.getId());
//            System.out.println("publication.getTitle() " + publication.getTitle());
//
//        });

    }
}
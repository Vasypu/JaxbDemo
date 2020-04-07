import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class PublicAdapter extends XmlAdapter<String, Publication> {

    private Map<String, Publication> publicationMap = new HashMap<>();


    public Map<String, Publication> getPublicationMap() {
        return publicationMap;
    }

    @Override
    public Publication unmarshal(String v) throws Exception {
        return publicationMap.get(v);
    }

    @Override
    public String marshal(Publication v) throws Exception {
        return v.getId();
    }
}
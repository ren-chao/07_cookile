import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author chao
 * @create 2021-02-19 13:53
 */


public class xml {

    @Test
    public  void zhi() throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document read = saxReader.read("xml/book.xml");
        Element rootElement = read.getRootElement();
        List<Element> book = rootElement.elements("book");
        for (Element bo : book) {
            Element name = bo.element("name");
            System.out.println(name.getText());
        }
        System.out.println(read);
    }
}

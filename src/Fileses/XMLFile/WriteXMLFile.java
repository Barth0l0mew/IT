package Fileses.XMLFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class WriteXMLFile {
    public static void main(String[] args) {
    String fileName = "src/DATA/file.xml";
        String fileName2 = "src/DATA/files.xml";
    Books books = new Books();
    Book book = new Book();
    book.setId(1L);
    book.setName("name book");
    book.setDate(new Date());
    books.addBook(book);
        Book book2 = new Book();
        book2.setId(2L);
        book2.setName("name book2");
        book2.setDate(new Date());
        books.addBook(book2);
        System.out.println(books);
        try {
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Marshaller marshaller =context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(books, new File(fileName2));
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}

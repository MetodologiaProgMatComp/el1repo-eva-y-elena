package es.uah.matcomp.mp.e2.ejerciciosclases.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getName() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.getName());
        assertEquals("Felipe", b.getName());
        assertDoesNotThrow(() -> b1.getName());
        assertEquals("Juan", b1.getName());
    }

    @Test
    void getAuthors() {Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.getAuthors());
        assertDoesNotThrow(() -> b1.getName());
    }

    @Test
    void getPrice() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.getName());
        assertEquals(8.8, b.getPrice());
        assertDoesNotThrow(() -> b1.getName());
        assertEquals(13, b1.getPrice());
    }

    @Test
    void getQty() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.getQty());
        assertEquals(88, b.getQty());
        assertDoesNotThrow(() -> b1.getQty());
        assertEquals(0, b1.getQty());
    }

    @Test
    void setPrice() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.setPrice(12));
        assertDoesNotThrow(() -> b1.setPrice(12));
    }

    @Test
    void setQty() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.setQty(2));
        assertDoesNotThrow(() -> b1.setQty(2));
    }

    @Test
    void testToString() {
        Author a= new Author("Juan", "ahteck@nowhere.com", 'm');
        Author a1= new Author("Juan", "juan@nowhere.com", 'm');
        Author[] authors =new Author[2];
        authors[0]= a;
        authors[1]=a1;
        Book b1 = new Book("Juan", authors, 13);
        Book b = new Book("Felipe",authors, 8.8, 88);
        assertDoesNotThrow(() -> b.toString());
        assertDoesNotThrow(() -> b1.toString());
    }
}
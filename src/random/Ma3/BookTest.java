package random.Ma3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader inputStream = null;
        String s;
        ArrayList<Book> listOfBooks = new ArrayList<>();

        try {
            inputStream = new BufferedReader(new FileReader("data.txt"));
            while ((s = inputStream.readLine()) != null) {
                Book book = new Book(s, Integer.parseInt(inputStream.readLine()),
                        Double.parseDouble(inputStream.readLine()), inputStream.readLine());
                listOfBooks.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Book book : listOfBooks) {
            if (book.getPublishYear() == 2015) {
                System.out.println(book);
            }
        }
    }
}

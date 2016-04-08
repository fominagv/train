package lesson_06.homeWork;

import java.util.*;

/**
 * Created by galina on 4/6/16.
 */
//TODO  дополнить класс Book приведеными ниже методами выполняющими следующие операции над списком книг
public class Book {
    String title;
    List<String> authors;
    int yearOfPublising;

    public Book(int yearOfPublising, List<String> authors, String title) {
        this.yearOfPublising = yearOfPublising;
        this.authors = authors;
        this.title = title;
    }

    /* [books] -> {author: [books]}
   List<Book> -> Map<String, List<Book>> - сгруппировать книги по авторам
   Пример: {'Толстой'=['Война и мир']; 'Достоевский'=['Идиотъ', 'Преступление и наказание']; ...}
*/
    public static Map<String, List<Book>> groupBooksByAuthors(List<Book> books) {
        Map<String, List<Book>> result = new HashMap<String, List<Book>>();
        for (Book book : books) {
            for (String author : book.authors) {
                if (result.containsKey(author)) {
                    result.get(author).add(book);
                } else {
                    List<Book> listBooks = new ArrayList<Book>();
                    listBooks.add(book);
                    result.put(author, listBooks);
                }
            }
        }
        return result;
    }

    /*
        [books] -> {year: [top year authors]}
        List<Book> -> Map<Integer, Set<String>> - составить топ авторов за каждый год
        (т.е., те авторы, которые написали больше всего книг за данный год)
        Пример: (1984=['Кинг'], 1990=['Роулинг', 'Фрай'], ...)
     */
    private static Map<Integer, List<Book>> getMapBooksPerYear(List<Book> books) {
        Map<Integer, List<Book>> result = new HashMap<Integer, List<Book>>();
        for (Book book : books) {
            if (result.containsKey(book.yearOfPublising)) {
                result.get(book.yearOfPublising).add(book);
            } else {
                List<Book> listBooks = new ArrayList<Book>();
                listBooks.add(book);
                result.put(book.yearOfPublising, listBooks);
            }
        }
        return result;
    }

    private static Map<Integer, Integer> getNumbersBookPerYear(List<Book> books) {
        Map<Integer, Integer> numbersBookPerYear = new HashMap<Integer, Integer>();
        for (Book book : books) {
            if (numbersBookPerYear.containsKey(book.yearOfPublising)) {
                Integer counter = numbersBookPerYear.get(book.yearOfPublising);
                numbersBookPerYear.put(book.yearOfPublising, ++counter);
            } else {
                numbersBookPerYear.put(book.yearOfPublising, 1);
            }
        }


        return numbersBookPerYear;
    }


    public static Map<Integer, Set<String>> findTopAuthorsPerEachYear(List<Book> books) {
        Map<Integer, Set<String>> result = new HashMap<Integer, Set<String>>();
        Map<Integer, List<Book>> mapBooksPerYear = getMapBooksPerYear(books);
        for (Integer year : mapBooksPerYear.keySet()) {
            Integer maxNunbersOfBooks = 0;
            Map<String, List<Book>> groupBooksByAuthors = groupBooksByAuthors(mapBooksPerYear.get(year));
            for (String author : groupBooksByAuthors.keySet()) {
                if (maxNunbersOfBooks < groupBooksByAuthors.get(author).size()) {
                    maxNunbersOfBooks = groupBooksByAuthors.get(author).size();
                    Set<String> set = new HashSet<String>();
                    set.add(author);
                    result.put(year, set);
                }
                if (maxNunbersOfBooks == groupBooksByAuthors.get(author).size()) {
                    if (result.containsKey(year)) {
                        result.get(year).add(author);
                    } else {
                        Set<String> set = new HashSet<String>();
                        set.add(author);
                        result.put(year, set);
                    }

                }
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", yearOfPublising=" + yearOfPublising +
                '}';
    }
}

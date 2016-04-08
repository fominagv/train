package lesson_06.homeWork;

import java.util.*;

/**
 * Created by galina on 4/2/16.
 */
public class HW_Collections {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ArrayList<String> authors1 = new ArrayList<String>(
                Arrays.asList("author1", "author2"));
        ArrayList<String> authors2 = new ArrayList<String>(
                Arrays.asList("author3", "author4"));
        ArrayList<String> authors3 = new ArrayList<String>(
                Arrays.asList("author1", "author4"));
        ArrayList<String> authors4 = new ArrayList<String>(
                Arrays.asList("author1"));
        ArrayList<Book> books = new ArrayList<Book>(
                Arrays.asList(new Book(2015,authors1, "title1"),new Book(2015,authors2, "title2"),new Book(2015,authors3, "title3"),new Book(2016,authors1, "title4"),new Book(2016,authors4, "title5")));
        System.out.println(Book.groupBooksByAuthors(books));
        System.out.println();
        System.out.println(Book.findTopAuthorsPerEachYear(books));
             List<String> ll=new LinkedList<>(Arrays.asList(args));
            for (int i=0;i<args.length;i++){
                ll.add(args[i]);
            }
        Comparator<String> comparator=ListComparator.class.newInstance();
        SortedSet<String> st= new TreeSet<String>(comparator);
        st.addAll(ll);
        }

    }


   //TODO Создать класс ListComparator реализуюший интерфейс Comparator для объектов классов LinkedList,
   // сравнивающих 2 объекта по количеству элементов содержащихся в списке.

class ListComparator<E> implements Comparator<LinkedList<E>>{

    @Override
    public int compare(LinkedList<E> o1, LinkedList<E> o2) {
        if (o1.size()<o2.size()){
            return -1;
        }
        if (o1.size()>o2.size()){
            return 1;
        }
        return 0;
    }
}

    //TODO  Реализовать приложение, принимающее массивы строк и формирующее объекты класса LinkedList, содержащее слова строки, и
   //  помещающее полученные объекты в объект класса SortedSet, созданный с использованием реализованного в предыдущем задании
   // объекта класса ListComparator и выводящее на экран содержимого созданного объекта класса SortedSet.

//TODO Реализовать класс выполняющий:
    /*  • поиск всех вхождений подстроки в строке,
        • всех вхождений заданной подстроки в списке строк (объектов классов реализующих интерфейс List),
        • всех элементов массива строк совпадающих с искомой подстрокой,
        • всех вхождений искомой строки в объекте реализующим интерфейс Map.
        Результат должен возвращаться в виде объекта вложенного в класс локального класса,
        и обладающего следующими полями – время проведения поиска, длительность поиска, индексы начала вхождений при поиске подстроки в строке,
        индексы элементов при поиске в списке и ключи при поиске в картах.
        */
class WorkWithString {
    public Result searchSubstringInString(String subString, String string){
        Long startTime=System.currentTimeMillis();
        List<Integer> indexStartSubString=new ArrayList<Integer>();
        Integer index =0;
        while (index<string.length());{
        index=string.indexOf(subString,index);
        indexStartSubString.add(index);  // string=lalalalalalala  subString=lala
        index=index+subString.length();
        }
        Long searchDuration= System.currentTimeMillis()-startTime;
    return new Result(startTime,searchDuration,indexStartSubString);}


    public Result searchinArray(String subString, String[] array){
        Long startTime=System.currentTimeMillis();
        List<Integer> indexInArray=new ArrayList<Integer>();
        for (int i=0;i<array.length;i++){
            if (array[i]==subString){
                indexInArray.add(i);
            }
        }
        Long searchDuration= System.currentTimeMillis()-startTime;
        return new Result(startTime,searchDuration,indexInArray);}

    public Result searchSubstringInListString(String subString, List<String> list){
        Long startTime=System.currentTimeMillis();

        List<Integer> indexInList=new ArrayList<Integer>();
        for (int i=0;i<list.size();i++){
            if (list.get(i).contains(subString)) {
                indexInList.add(i);
            }
        }
        Long searchDuration= System.currentTimeMillis()-startTime;
        return new Result(startTime,searchDuration,indexInList); }



    class Result{
        Long dateSearch;
        Long searchDuration;
        List<Integer> indexStartSubString;
        List<Integer> indexInList;
        List<Object> keys;

        public Result(Long dateSearch, Long searchDuration, List<Integer> indexStartSubString) {
            this.dateSearch = dateSearch;
            this.searchDuration = searchDuration;
            this.indexStartSubString = indexStartSubString;
        }

        public Long getDateSearch() {
            return dateSearch;
        }

        public void setDateSearch(Long dateSearch) {
            this.dateSearch = dateSearch;
        }

        public Long getSearchDuration() {
            return searchDuration;
        }

        public void setSearchDuration(Long searchDuration) {
            this.searchDuration = searchDuration;
        }

        public List<Integer> getIndexStartSubString() {
            return indexStartSubString;
        }

        public void setIndexStartSubString(List<Integer> indexStartSubString) {
            this.indexStartSubString = indexStartSubString;
        }

        public List<Integer> getIndexInList() {
            return indexInList;
        }

        public void setIndexInList(List<Integer> indexInList) {
            this.indexInList = indexInList;
        }

        public List<Object> getKeys() {
            return keys;
        }

        public void setKeys(List<Object> keys) {
            this.keys = keys;
        }
    }
}

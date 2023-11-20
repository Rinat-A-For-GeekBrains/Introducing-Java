import java.util.*;
//Реализуйте структуру телефонной книги с помощью HashMap.
//  Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//  их необходимо считать, как одного человека с разными телефонами.
//  Вывод должен быть отсортирован по убыванию числа телефонов.
public class HomeWork_6 {
    static PhoneBook phb = new PhoneBook();
    public static void main(String[] args) {
        phb.add("name2", 1234234235);
        phb.add("name1", 123456);
        phb.add("name1", 2345678);
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println( phb.getSortedPhoneBook());
    }

}

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {

// Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            ArrayList<Integer> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNum);
            phoneBook.put(name, phoneNumbers);
        } else {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public ArrayList<Integer> find(String name) {
// Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return new ArrayList<>();
        }
    }

    public List<Map.Entry<String, ArrayList<Integer>>> getSortedPhoneBook() {
        List<Map.Entry<String, ArrayList<Integer>>> phoneBookList = new ArrayList <Map.Entry<String, ArrayList<Integer>>> (phoneBook.entrySet());

        Collections.sort(phoneBookList, new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
                    @Override
                    public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                        return o1.getValue().size() - o2.getValue().size();
                    }
                }.reversed()
        );
        return phoneBookList;
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
// Введите свое решение ниже

        return phoneBook;


    }
}
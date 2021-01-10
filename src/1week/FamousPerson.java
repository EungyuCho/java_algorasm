import common.InputView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FamousPerson {
    // 알파벳을 입력하면 해당 알파벳으로 시작하는 사람을 출력해주는 예제
    public static void main(String[] args) throws FileNotFoundException {
        HashTable table = new HashTable(50);

        File file = new File("person.txt");

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            table.put(new Person(scanner.nextLine()));
        }

        while(true) {
            OutputView1.askAlphabet();

            String input = InputView.getLine();

            if (input.equals("exit")) break;

            if (input.length() > 1) {
                OutputView1.pleaseInputOneCharacter();
                continue;
            }
            char key = input.charAt(0);
            if (isAlphabet(key)) {
                if (Character.isLowerCase(key)) {
                    key = Character.toUpperCase(key);
                }

                System.out.println(table.get(key));
            }
        }
    }

    private static boolean isAlphabet(char c) {
        return (c >= 65 && c <= 122) ? true : false;
    }
}

class HashTable {
    private LinkedList<Person> data[];

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(char key) {
        int hashCode = key;
        return hashCode;
    }

    int convertToIndex(int hashCode) {
        return hashCode % 26;
    }

    public void put(Person person) {
        if (person.name != null) {
            int hashCode = getHashCode(person.key);
            int index = convertToIndex(hashCode);
            if (data[index] == null) {
                data[index] = new LinkedList<>();
            }
            data[index].add(person);
        }
    }

    public String get(char key) {
        StringBuilder sb = new StringBuilder();
        int hashCode = getHashCode(key);
        int index = convertToIndex(hashCode);
        LinkedList<Person> personList = data[index];
        sb.append("[");
        for (Person p : personList) {
            sb.append("\"").append(p.name).append("\"").append(", ");
        }
        int deleteIndex = sb.lastIndexOf(", ");
        sb.delete(deleteIndex, deleteIndex + 2);
        sb.append("]");

        return sb.toString();
    }

}

class Person {
    public String name;
    public char key;
    public Person(String name) {
        this.name = name;
        this.key = name.charAt(0);
    }
}
package main.java.eu.glowacki.utp.assignment01;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import main.java.eu.glowacki.utp.assignment01.sample.*;
public class GenericsCollect {

    public static void main (String[] args) {
        List<Person> persons = Arrays.asList(new Person(12),new Person(71), new Person(17));
    Container<Person,Integer> ContPerson =new Container<>(persons);
    System.out.println(ContPerson.aggregateAllElements());
        List<Text> texts = Arrays.asList(new Text("A"), new Text("B"),new Text("C"));
        Container<Text,String> myContText =new Container<>(texts);
        System.out.println(myContText.cloneElementAtIndex(0));
    }
}

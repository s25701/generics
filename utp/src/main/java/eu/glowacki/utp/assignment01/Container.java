package main.java.eu.glowacki.utp.assignment01;
import main.java.eu.glowacki.utp.assignment01.sample.*;
import java.util.ArrayList;
import java.util.List;

public class Container<TElement extends IAggregable<TElement, TAggregateResult> & IDeeplyCloneable<TElement>, TAggregateResult>
        implements IContainer<TElement, TAggregateResult> {

    private List<TElement> list = new ArrayList<>();


    public Container(List<TElement> texts) {
        list=texts;
    }


    public List<TElement> elements() {
        return list;
    }

    public void adds(TElement element) {
        list.add(element);
    }

    public TElement get(int index) {
        if (index < 0 || index >= list.size()) {
            return null;
        }

        return list.get(index);
    }

    public TAggregateResult aggregateAllElements() {

        TAggregateResult result = null;

        if (list == null) {
            return null;
        }

        for (int i = 0; i < list.size(); i++) {
            TElement compare = list.get(i);
            result = compare.aggregate(result);
        }
        return result;
    }

    public TElement cloneElementAtIndex(int index) {

        if (index < 0 || index > list.size() - 1) {
            return null;
        }

        return list.get(index).deepClone();
    }

}



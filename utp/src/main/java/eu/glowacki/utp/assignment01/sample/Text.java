package main.java.eu.glowacki.utp.assignment01.sample;

import main.java.eu.glowacki.utp.assignment01.IAggregable;
import main.java.eu.glowacki.utp.assignment01.IDeeplyCloneable;
import main.java.eu.glowacki.utp.assignment01.IContainer;
import main.java.eu.glowacki.utp.assignment01.GenericsCollect.*;

public final class Text implements IDeeplyCloneable<Text>, IAggregable<Text, String> {

    private final String _text;

    public Text(String text) {
        //
        _text = text;
    }

    public String text() {
        //
        return _text;
    }



    public Text deepClone(String text) {
        //
        return new Text(_text);
    }

    @Override
    public Text deepClone() {
        return null;
    }

    @Override
    public String aggregate(String intermediateResult) {
        return null;
    }
}

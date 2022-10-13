package main.java.eu.glowacki.utp.assignment01;

import java.util.List;

public interface IContainer<TElement extends IAggregable<TElement, TAggregateResult> & IDeeplyCloneable<TElement>, TAggregateResult> {
	
    List<TElement> elements();
	
	TAggregateResult aggregateAllElements();
	
	TElement cloneElementAtIndex(int index);
}

package main.java.eu.glowacki.utp.assignment01;


public interface IAggregable<TElement extends IAggregable<TElement, TResult>, TResult> {

	TResult aggregate(TResult intermediateResult);
}
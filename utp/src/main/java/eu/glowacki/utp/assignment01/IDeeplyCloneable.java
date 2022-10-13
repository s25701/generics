package main.java.eu.glowacki.utp.assignment01;
public interface IDeeplyCloneable<TElement extends IDeeplyCloneable<TElement>> {

	TElement deepClone();
}
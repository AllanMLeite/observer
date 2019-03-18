package br.com.dp.observer;

import java.util.Observable;

public class NewsAgency extends Observable {

	public void propagate(String news) {
		setChanged();
		notifyObservers(news);
	}
}

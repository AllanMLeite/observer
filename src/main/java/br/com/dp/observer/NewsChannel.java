package br.com.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class NewsChannel implements Observer {

	private String news;
	
	@Override
	public void update(Observable o, Object news) {
		this.news = (String) news;
	}
	
	public String getNews() {
		return news;
	}
}

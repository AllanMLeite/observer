package br.com.dp.observer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NewsAgencyTest {

	@Test
	public void shouldPropagateNews() {
			NewsAgency observable = new NewsAgency();
			NewsChannel observer = new NewsChannel();
			assertNull(observer.getNews());
			
			observable.addObserver(observer);
			
			observable.propagate("cacildis");
			assertEquals("cacildis", observer.getNews());
			
			observable.propagate("newzis");
			assertEquals("newzis", observer.getNews());
	}
}

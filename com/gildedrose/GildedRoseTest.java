package com.gildedrose;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	//private GildedRose app;
/*
	@Before
	public void setUp() {
	//	this.app = new GildedRose();
	}
*/
	@Test
	public void testAgedBrie() {
		Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals(1, app.items[0].quality);
	}

	@Test	
	public void testBackstage() {
		Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 0) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals(1, app.items[0].quality);
		for (int i = 0;i < 5;++i) {
			app.updateQuality();
		}
		assertEquals(7, app.items[0].quality);
		for (int i = 0;i < 5 ;++i) {
			app.updateQuality();
		}
		assertEquals(18, app.items[0].quality);
		for (int i = 0;i < 5;++i) {
			app.updateQuality();
		}
		assertEquals(0, app.items[0].quality);
		
	}

}

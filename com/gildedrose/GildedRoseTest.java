package com.gildedrose;
import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

	@Test
	public void testAgedBrie() {
		Item[] items = new Item[] {  };
				new Item("Aged Brie", 2, 0),
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertEquals("fixme", app.items[0].name);
	}
}

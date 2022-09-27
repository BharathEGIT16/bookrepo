package com.digitalbooks.book.util;

import java.util.Random;

public class Util {

	public static String getPurchaseId() {
		int i = new Random().nextInt(900000) + 100000;
		return i+"";
	}
}

package com.cg.collect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//arrayList


public class CollectionFrame {

	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add(100);
		list.add(10);
		list.add(1000);
		list.add("Webinar");
		System.out.println("ArrayList : " + list);
	}

}

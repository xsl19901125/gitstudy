package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.test.Color;
//≤‚ ‘Enum
public class TestMain {

	public static void main(String[] args) {
		HashMap<Color, Integer> hashMap=new HashMap<Color, Integer>();
		hashMap.put(Color.RED, 1);
		hashMap.put(Color.BLACK, 2);
		Set<Color> set=hashMap.keySet();
		Iterator<Color> iterator=set.iterator();
		while(iterator.hasNext()){
			Color c=iterator.next();
			System.out.println(hashMap.get(c));
			System.out.println(c.toString());
		}
	}

}

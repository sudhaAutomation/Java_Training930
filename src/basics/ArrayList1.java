package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		int ar[] = new int[4];// array is containing the static memory allocation property
System.out.println("array length is "+ar.length);

		ArrayList<Integer> arlist = new ArrayList<Integer>();
		arlist.add(100);
		arlist.add(200);
		arlist.add(300);
		arlist.add(100);
		arlist.add(200);
		arlist.add(300);
		arlist.add(400);
		System.out.println(arlist);
		arlist.remove(2);
		System.out.println(arlist);
		
		System.out.println(arlist.indexOf(400));
		System.out.println(arlist.size());
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ramu");
		ll.add("Somu");
		ll.add("Somu");
		ll.add("Ramu");
		ll.add("ramu");
		ll.add("geetha");
		ll.add("seetha");
		ll.add("lakshman");
		System.out.println(ll);
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ramu");
		hs.add("Somu");
		hs.add("Ramu");
		hs.add("ramu");
		hs.add("geetha");
		hs.add("seetha");
		hs.add("lakshman");
		System.out.println(hs);
		HashMap<String,Object> map=new HashMap<String, Object>();
		
		map.put("swhizz", 123456);
		map.put("swhizz", 1234567);
		map.put("SoftwareTesting", "test123");
		map.put("SoftwareTesting", "test12345");
		map.put("sudha", "sudha123");
		map.put("sudha", "sudha123");
		map.put("test",12345);
		System.out.println(map);
		
		
		Iterator<String> it=	hs.iterator();
		System.out.println(it.hasNext());//is any next element present or not and returns the boolean value
		System.out.println(it.next());//this will returns the next element itself
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());

	}
	
	
	
	
	

}

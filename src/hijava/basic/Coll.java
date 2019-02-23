package hijava.basic;

import java.util.ArrayList;
import java.util.List;

public class Coll {

	public static void main(String[] args) {
		List<String> lst1 = new ArrayList<>();
		ArrayList<String> lst2 = new ArrayList<>();
		
		lst1.add("111");
		lst1.add("222");
		lst2.add("aaa");
		
		lst1.add(1, "100");
		System.out.println(lst2);
		
		lst1.add("333");
		lst1.add("444");
		System.out.println(lst1);
		
		boolean ispop = lst1.remove("100");
		System.out.println("ispop=" + ispop);
		System.out.println(lst1);
		String pop = lst1.remove(1);
		System.out.println("pop=" + pop);
		System.out.println(lst1);
		boolean ispop2 = lst1.remove("100");
		System.out.println("ispop2=" + ispop2);
		
		int size = lst1.size();
		System.out.println("size=" + size);
		
		for (int i = 0; i < size; i++) {
			System.out.println(i + "번째=" + lst1.get(i));
		}
	}

}

package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {
		animal();
//		weight();
		
//		AbstSuper sp = new AbstChild();
//		int i = 5;
//		int j = 10;
//		
//		System.out.println("min=" + sp.min(i, j) +", max=" + sp.max(i, j));
		
//		long token = System.currentTimeMillis();
		
//		al();
//		momAndSon();
//		drinkTest();
//		eatTest();
//		koreanAndAmerican();
	}

	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(Animal ani) {
		ani.bark();
	}

	private static void weight() {
		Weight guen = new Guen();
		Weight pound= new Pound();
		
		int cnt = 5;
		System.out.println("Guen=" + guen.getGram(cnt));
		System.out.println("Pound=" + pound.getGram(cnt));
	}

	private static void eatTest() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
//		eat(korean);
		eat(american);
	}

	private static void eat(Man m) {
		if (m instanceof Korean) {
			((Korean)m).eatRice();
		} else if (m instanceof American) {
			((American)m).eatBread();
		} else {
			System.out.println("해당 인스턴스가 없습니다!!");
		}
	}

	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
	}

	private static void drink(Mom m) {
		if (m instanceof Son) {
//			Son s = (Son)m;
//			s.drinkMilk();
			
			((Son)m).drinkMilk();
			
		} else {
			m.drinkBeer();
		}
	}

	private static void koreanAndAmerican() {
		Man korean = new Korean("홍길동");
		American american = new American("John");
		
		sayHi(korean); 
		sayHi(american);
	}
	
	private static void sayHi(Man man) {
		man.sayHello();
	}

	private static void momAndSon() {
		Mom mom = new Mom();
		Son son = new Son();
		
//		mom.eat();
//		son.eat();
		eat(mom);
		eat(son);
		
//		mom.say();
//		son.say();
	}
	
	private static void eat(Mom m) {
		if (m instanceof Son) {
			System.out.println("먹어~");
			
		} else if (m instanceof Mom) {
			System.out.println("드세요~");
			
		} else {
			System.out.println("드십시오!");
		}
	}

	private static void al() {
		ArrayList<Man> people = new ArrayList<>(9);
		
		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			m.buyCoffee(1);
			
			people.add(m);
		}
		
		int size = people.size();
		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}

}

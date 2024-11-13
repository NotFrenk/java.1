package src;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(7);
		li.add(5);
		li.add(9);
		li.add(2);
		li.addFirst(11);
		li.addLast(37);
		li.add(3, 99);
		
		System.out.println(li);
		
		// usiamo .max per prendere lintero maggiore
		Integer theBigOne = Collections.max(li);
		System.out.println(theBigOne);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.shuffle(li);
		System.out.println(li);
		
		Ghepardo g1 = new Ghepardo(15, 60, 90.0); 
		Ghepardo g2 = new Ghepardo(16, 66, 80.0);
		Ghepardo g3 = new Ghepardo(13, 50, 100.0);
		Ghepardo g4 = new Ghepardo(14, 55, 85.0);
		
		LinkedList<Ghepardo> lg = new LinkedList<Ghepardo>();
		lg.add(g1);
		lg.add(g2);
		lg.add(g3);
		lg.add(g4);
		
		System.out.println(lg);
		
		for (Ghepardo g:lg) {
			System.out.println(g);
		}
		
		Collections.sort(lg);
		System.out.println(lg);
		
		
		LinkedList<Elefante> el = new LinkedList<Elefante>();
		
		el.add(new Elefante(5, 10, 4500.0));
		el.add(new Elefante(7, 11, 4500.0));
		el.add(new Elefante(6, 8, 4900.0));
		el.add(new Elefante(7, 9, 4900.0));
		
		LinkedList<Mammifero> ma = new LinkedList<Mammifero>();
		ma.addAll(ma);
		System.out.println(ma);


		// Procedura merge, usiamo due liste di interi già ordinate
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.add(3);
        l1.add(8);
        l1.add(11);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(9);
        l2.add(12);
        l2.add(15);
		LinkedList<Integer> lsorted = MergeLists(l1, l2);
		private static LinkedList<Integer> MergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        //Prima cosa: impariamo a usare gli iteratori!!!

        //Usando un iteratore, stampare una lista
        Iterator<Integer> it1 = l1.iterator();
        while (it1.hasNext()) {
            Integer num = it1.next();
            System.out.println(num);
        }


        return null;
    }
	}

}

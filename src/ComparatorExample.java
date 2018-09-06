import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Book{
	private String title;
	private double price;
	
	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
}

class MyComparator implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		Book book1 = (Book)obj1;
		Book book2 = (Book)obj2;
		if(book1.getPrice() < book2.getPrice())
			return -1;
		else
			return 1;
	}
}
public class ComparatorExample {

	public static void main(String[] args) {

		Book b1 = new Book("Java",500.00);
		Book b2 = new Book("C",300.00);
		Book b3 = new Book("PHP",400.00);
		TreeSet tr = new TreeSet(new MyComparator());
		tr.add(b1);
		tr.add(b2);
		tr.add(b3);
		tr.add(b1);
		Book b;
		Iterator it = tr.iterator();
		while(it.hasNext())
		{
			b = (Book)it.next();
			System.out.println(b.getTitle() + " " + b.getPrice());
		}

	}

}


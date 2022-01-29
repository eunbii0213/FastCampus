package chapter3.practice08;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		
		shelf.add(title);
		
	}

	@Override
	public void deQueue() {
		
		 shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	
	

}

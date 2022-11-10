package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectClass implements Subject{

	private List<Observer> observers;
	
	
	public SubjectClass() {
		
		observers = new ArrayList<Observer>();
		
	} // End of constructor

	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);
		
	} // End of registerObserver

	@Override
	public void removeObserver(Observer o) {
		
		observers.remove(o);
		
	} // End of removeObserver

	@Override
	public void notifyObserver() {
			
		for(Observer observer : observers) {
			
			observer.update();
			
		} // End of for
		
	} // End of notifyObserver
	
	
} // End of Class

/**
 * 
 */
package practice.observerPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author B R Choudhury
 * Sep 3, 2015
 */
public class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String state;
	
	public void attach(Observer observer){
		observers.add(observer);		
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state){
		this.state = state;
		notifyObservers();
	}

	private void notifyObservers() {
		Iterator iterator = observers.iterator();
		while(iterator.hasNext()){
			((Observer) iterator.next()).update();
		}		
	}
	

}

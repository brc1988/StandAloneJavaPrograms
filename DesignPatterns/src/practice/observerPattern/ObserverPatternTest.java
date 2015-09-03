/**
 * 
 */
package practice.observerPattern;

/**
 * @author B R Choudhury
 * Sep 3, 2015
 */
public class ObserverPatternTest {

	
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer ob1 = new ConcreteObserver1(subject);
		Observer ob2 = new ConcreteObserver2(subject);
		
		subject.attach(ob1);
		subject.attach(ob2);
		
		
		subject.setState("initialized");
		subject.setState("teminated");
		}

}

package practice.observerPattern;

public class ConcreteObserver1 implements Observer {
	Subject subject;	

	public ConcreteObserver1(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void update() {
		System.out.println("Got Update from : "+subject+" and state is : "+ subject.getState());
	}

}

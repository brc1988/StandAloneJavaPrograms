package practice.observerPattern;

public class ConcreteObserver2 implements Observer {
	Subject subject;
	
	

	public ConcreteObserver2(Subject subject) {
		super();
		this.subject = subject;
	}



	@Override
	public void update() {
		System.out.println("Got Update from : "+subject+" and state is : "+ subject.getState());

	}

}

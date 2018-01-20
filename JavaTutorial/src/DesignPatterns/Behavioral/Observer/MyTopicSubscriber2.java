package DesignPatterns.Behavioral.Observer;


public class MyTopicSubscriber2 implements Observer {
	
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber2(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}

}
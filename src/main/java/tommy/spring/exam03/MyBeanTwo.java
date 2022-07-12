package tommy.spring.exam03;

public class MyBeanTwo implements MyBean {
	@Override
	public void sayHello(String name) {
			System.out.println("안녕하세요~~!!!! " + name + " !!!!");
	}

}

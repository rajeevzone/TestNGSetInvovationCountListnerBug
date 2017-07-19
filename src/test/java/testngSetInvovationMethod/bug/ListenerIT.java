package testngSetInvovationMethod.bug;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(InvocationMethodListener.class)
public class ListenerIT {

	@Test(invocationCount=2)
	public void testA() {
		System.out.println("testA");
	}
	
	@Test
	public void testB() {
		System.out.println("testB");
	}
}

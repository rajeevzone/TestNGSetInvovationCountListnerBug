package testngSetInvovationMethod.bug;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class InvocationMethodListener implements IAnnotationTransformer   {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setInvocationCount(5);
	}
}

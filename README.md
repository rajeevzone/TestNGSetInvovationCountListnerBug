As per TestNG docs invocationCount for a test method can be set during runtime by implementying IAnnotationTransformer. Looks like this is not working anymore.
References: http://testng.org/doc/documentation-main.html#annotationtransformers

When the method transform() is invoked, you can call any of the setters on the ITest test parameter to alter its value before TestNG proceeds further.

For example, here is how you would override the attribute invocationCount but only on the test method invoke() of one of your test classes:
public class MyTransformer implements IAnnotationTransformer {
  public void transform(ITest annotation, Class testClass,
      Constructor testConstructor, Method testMethod)
  {
    if ("invoke".equals(testMethod.getName())) {
      annotation.setInvocationCount(5);
    }
  }
}
IAnnotationTransformer only lets you modify a @Test annotation. If you need to modify another TestNG annotation (a configuration annotation, @Factory or @DataProvider), use an IAnnotationTransformer2. 


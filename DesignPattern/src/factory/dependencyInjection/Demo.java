package factory.dependencyInjection;

public class Demo {
  public static void main(String[] args) throws NoSuchBeanDefinitionException, BeanCreationFailureException {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
      "beans.xml");
    RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
    rateLimiter.test();
    //...
  }
}

package factory.dependencyInjection;

public interface ApplicationContext {
  Object getBean(String beanId) throws BeanCreationFailureException, NoSuchBeanDefinitionException;
}

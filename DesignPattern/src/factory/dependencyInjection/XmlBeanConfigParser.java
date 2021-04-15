package factory.dependencyInjection;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlBeanConfigParser implements BeanConfigParser {
  @Override
  public List<BeanDefinition> parse(InputStream inputStream) {
    String content = null;
    return parse(content);
  }

  @Override
  public List<BeanDefinition> parse(String configContent) {
    List<BeanDefinition> beanDefinitions = new ArrayList<BeanDefinition>();
    return beanDefinitions;
  }
}

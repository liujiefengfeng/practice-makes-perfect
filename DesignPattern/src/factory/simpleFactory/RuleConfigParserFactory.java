package factory.simpleFactory;

public class RuleConfigParserFactory {
  public static IRuleConfigParser createParser(String configFormat){
    IRuleConfigParser parser = null;
    if("json".equalsIgnoreCase(configFormat)){
      parser = new JsonRuleConfigParser();
    } else if("xml".equalsIgnoreCase(configFormat)){
      parser = new XmlRuleConfigParser();
    } else if("yaml".equalsIgnoreCase(configFormat)){
      parser = new yamlRuleConfigParser();
    } else if ("properties".equalsIgnoreCase(configFormat)){
      parser = new PropertiesRuleConfigParser();
    }
    return parser;
  }
}

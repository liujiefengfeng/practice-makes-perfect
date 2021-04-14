package factory.simpleFactory;

public class RuleConfigSource {
  public RuleConfig load(String ruleConfigFilePath){
    String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
    IRuleConfigParse parser = createParser(ruleConfigFileExtension);
    if(parser == null) {
      throw new InvalidRuleConfigException(
        "Rule config file format is not supported." + ruleConfigFileExtension);
    }

    String configText = "";
    //从ruleConfigFilePath文件中读取配置文本到configText中
    RuleConfig ruleConfig = parser.parse(configText);
    return ruleConfig;
  }

  private IRuleConfigParse createParser(String ruleConfigFileExtension) {
    IRuleConfigParse parser = null;
    if("json".equalsIgnoreCase(ruleConfigFileExtension)){
      parser = new JsonRuleConfigParser();
    } else if("xml".equalsIgnoreCase(ruleConfigFileExtension)){
      parser = new XmlRuleConfigParser();
    } else if("yaml".equalsIgnoreCase(ruleConfigFileExtension)){
      parser = new yamlRuleConfigParser();
    } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)){
      parser = new PropertiesRuleConfigParser();
    }
    return parser;
  }

  private String getFileExtension(String filePath){
    return "json";
  }
}

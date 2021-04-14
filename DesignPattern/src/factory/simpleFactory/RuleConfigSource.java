package factory.simpleFactory;

public class RuleConfigSource {
  public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
    String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
    IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
    if(parser == null) {
      throw new InvalidRuleConfigException(
        "Rule config file format is not supported." + ruleConfigFileExtension);
    }

    String configText = "";
    //从ruleConfigFilePath文件中读取配置文本到configText中
    RuleConfig ruleConfig = parser.parse(configText);
    return ruleConfig;
  }

  private String getFileExtension(String filePath){
    return "json";
  }
}

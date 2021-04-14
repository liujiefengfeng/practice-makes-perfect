package factory.factoryMethod;

import factory.factoryMethod.IRuleConfigParser;

public interface IRuleConfigParserFactory {
  IRuleConfigParser createParser();
}

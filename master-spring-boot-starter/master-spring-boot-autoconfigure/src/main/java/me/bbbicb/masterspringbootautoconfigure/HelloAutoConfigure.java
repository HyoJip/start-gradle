package me.bbbicb.masterspringbootautoconfigure;

import me.bbbicb.worker.HelloBot;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@AutoConfiguration
@EnableConfigurationProperties(MasterProperty.class)
public class HelloAutoConfigure {

  @Bean
  @ConditionalOnMissingBean
  public HelloBot helloBot(MasterProperty masterProperty) {
    return new HelloBot(masterProperty.getHello());
  }
}

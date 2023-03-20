package me.bbbicb.worker;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "master")
public class MasterProperty {
  String hello;

  public void setHello(String hello) {
    this.hello = hello;
  }

  public String getHello() {
    return hello;
  }

}

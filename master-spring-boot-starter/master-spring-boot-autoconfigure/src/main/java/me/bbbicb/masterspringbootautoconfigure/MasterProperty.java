package me.bbbicb.masterspringbootautoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "master")
public class MasterProperty {
  String hello = "hi";

  public String getHello() {
    return hello;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }

}

package me.bbbicb.slave2;

import me.bbbicb.masterspringbootautoconfigure.HelloAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = HelloAutoConfigure.class)
public class Slave2Application {

  public static void main(String[] args) {
    SpringApplication.run(Slave2Application.class, args);
  }

}

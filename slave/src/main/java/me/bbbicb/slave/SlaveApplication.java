package me.bbbicb.slave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.bbbicb")
public class SlaveApplication {

  public static void main(String[] args) {
    SpringApplication.run(SlaveApplication.class, args);
  }

}

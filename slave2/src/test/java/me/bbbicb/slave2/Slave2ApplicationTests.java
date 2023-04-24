package me.bbbicb.slave2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Slave2ApplicationTests {

  @Autowired
  BeanFactory factory;

  @Test
  @DisplayName("`HelloBot` Bean을 관리하지 않는다.")
  void doseNotRegisterHelloBotBean() {
    Assertions.assertThat(factory.containsBean("helloBot")).isFalse();
  }
}

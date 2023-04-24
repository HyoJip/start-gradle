package me.bbbicb.slave;

import me.bbbicb.worker.HelloBot;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SlaveApplicationTests {

  @Autowired
  HelloBot helloBot;

  @Test
  @DisplayName("기본으로, `HelloBot`을 등록하고 'hi'라고 인사한다.")
  void default_registerHelloBotBean() {
    Assertions.assertThat(helloBot.hello()).isEqualTo("hi");
  }
}

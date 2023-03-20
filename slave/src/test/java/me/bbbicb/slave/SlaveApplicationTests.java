package me.bbbicb.slave;

import me.bbbicb.worker.MasterProperty;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SlaveApplicationTests {

  @Autowired
  MasterProperty masterProperty;

  @Test
  void contextLoads() {
    Assertions.assertThat(masterProperty.getHello()).isEqualTo("hi");
  }

}

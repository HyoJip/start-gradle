package me.bbbicb.masterspringbootautoconfigure;

import me.bbbicb.worker.HelloBot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class MasterSpringBootAutoconfigureApplicationTests {

  private final ApplicationContextRunner acr = new ApplicationContextRunner()
    .withConfiguration(AutoConfigurations.of(HelloAutoConfigure.class));

  @Test
  @DisplayName("hello함수 실행시 'MasterProperty' hello값을 반환한다.")
  void whenDefaultHelloReturnMasterPropertyValue() {
    acr.run(ct -> {
      assertThat(ct).hasSingleBean(HelloBot.class);
      assertThat(ct).hasSingleBean(MasterProperty.class);
      MasterProperty masterProperety = ct.getBean(MasterProperty.class);
      assertThat(ct.getBean(HelloBot.class).hello()).isEqualTo(masterProperety.getHello());
      assertThat(masterProperety.getHello()).isEqualTo("hi");
    });
  }

}

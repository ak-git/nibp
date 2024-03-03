package com.ak.nibp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatNoException;

class ApplicationTest {
  @Test
  void testMain() {
    assertThatNoException().isThrownBy(() -> Application.main(new String[] {}));
  }
}
package homework.h14;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class T2Tests {

  @Test
  void standardLeetCodeSequence() {
    T2 queue = new T2();
    queue.push(1);
    queue.push(2);

    assertThat(queue.peek()).isEqualTo(1);
    assertThat(queue.pop()).isEqualTo(1);
    assertThat(queue.empty()).isFalse();
  }

  @Test
  void fifoOrderAcrossMultiplePushesAndPops() {
    T2 queue = new T2();
    queue.push(10);
    queue.push(20);
    queue.push(30);

    assertThat(queue.pop()).isEqualTo(10);
    queue.push(40);
    assertThat(queue.pop()).isEqualTo(20);
    assertThat(queue.pop()).isEqualTo(30);
    assertThat(queue.peek()).isEqualTo(40);
    assertThat(queue.pop()).isEqualTo(40);
    assertThat(queue.empty()).isTrue();
  }

  @Test
  void newlyCreatedQueueIsEmpty() {
    T2 queue = new T2();
    assertThat(queue.empty()).isTrue();
  }
}

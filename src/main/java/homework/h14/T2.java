package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class T2 {
  private final Deque<Integer> inStack = new ArrayDeque<>();
  private final Deque<Integer> outStack = new ArrayDeque<>();

  public void push(int x) {
    inStack.push(x);
  }

  public int pop() {
    moveIfNeeded();
    return outStack.pop();
  }

  public int peek() {
    moveIfNeeded();
    return outStack.peek();
  }

  public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }

  private void moveIfNeeded() {
    if (outStack.isEmpty()) {
      while (!inStack.isEmpty()) {
        outStack.push(inStack.pop());
      }
    }
  }
}

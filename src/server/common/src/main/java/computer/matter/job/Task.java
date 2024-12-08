package computer.matter.job;

public interface Task {
  void run(Job job);

  default void undo(Job job) {};

  int weight();
}

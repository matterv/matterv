package computer.matter.job;

public interface TaskProgressProvider<T> {
  TaskProgress start(int stepId, Job job, T jobConfig);

  TaskProgress finished(int stepId, Job job, T jobConfig);

  TaskProgress failed(int stepId, Job job, T jobConfig);
}

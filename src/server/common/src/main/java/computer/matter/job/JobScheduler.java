package computer.matter.job;

public interface JobScheduler {

    void notifyNewJobs();

  void start();

  void stop();
}

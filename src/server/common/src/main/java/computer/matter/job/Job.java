package computer.matter.job;

import computer.matter.os.Clock;
import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.json.Json;

import java.time.Instant;
import java.util.UUID;

public class Job implements Comparable<Job> {
  public long id;
  public UUID uuid;
  public String config;
  @ColumnName("start_time")
  public Instant startTime;
  @ColumnName("end_time")
  public Instant endTime;
  @ColumnName("status")
  public JobStatus status;
  @ColumnName("type")
  public String type;
  @ColumnName("object_id")
  public String objectId;
  @Json
  public JobProgress progress;

  public Long frequency;

  @Override
  public int compareTo(Job other) {
    return this.startTime.compareTo(other.startTime);
  }

  public boolean isSchedule(Clock clock) {
    return clock.now().isAfter(startTime);
  }

  @Override
  public String toString() {
    return """
            job uuid: %s, config: %s, startTime: %s, status: %s, type: %s, frequency: %s
            """.formatted(uuid, config, startTime, status, type, frequency);
  }
}

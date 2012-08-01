package models;

import java.util.*;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.*;

public class Task{
    
  @Id
  @ObjectId
  public String id;

  public String label;

  private static JacksonDBCollection<Task, String> coll = MongoDB.getCollection("tasks", Task.class, String.class);

  public static List<Task> all() {
    return Task.coll.find().toArray();
  }

  public static void create(Task task) {
    Task.coll.save(task);
  }

  public static void delete(String id) {
    Task task = Task.coll.findOneById(id);
    if (task != null)
        Task.coll.remove(task);
  }
    
}

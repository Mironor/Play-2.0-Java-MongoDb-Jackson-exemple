package models;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;

public class TaskSpec {

    @Before
    public void initialize() {
        Task.removeAll();
    }

    @Test
    public void beAddable() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                String testLabel = "Task label";
                Task.create(testLabel);
                    List<Task> tasks = Task.all();

                assertThat(tasks.size()).isEqualTo(1);
                assertThat(tasks.get(0).label).isEqualTo(testLabel);
            }
        });
    }

    @Test
    public void beDeletable(){
        String testLabel = "Task label";
        Task.create(testLabel);

        List<Task> tasks = Task.all();
        Task.delete(tasks.get(0).id);

        tasks = Task.all();
        assertThat(tasks.size()).isEqualTo(0);
    }
}

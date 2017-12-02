package main;

import java.util.ArrayList;
import java.util.Collection;

public final class MemoryTasks implements Tasks {
    private final Iterable<Task> tasks;
    
    public MemoryTasks (Iterable<Task> tasks) {
      this.tasks = new ArrayList<Task>((Collection<Task>)tasks);
    }
    
    public Iterable<Task> iterate() {
      return this.tasks;
    }
    
    
    /*
<<<<<<< HEAD
     * @TODO #2 arrumar essa implementa��o sem usar classe an�nima
=======
     * @TODO #0001 arrumar essa implementa��o sem usar classe an�nima
>>>>>>> branch 'master' of https://github.com/paulodamaso/donkey-tasks/
     */
    public Tasks add(Task task) {
    	return new MemoryTasks(new ArrayList<Task>((Collection<Task>)tasks) {{add(task);}});
    }
}

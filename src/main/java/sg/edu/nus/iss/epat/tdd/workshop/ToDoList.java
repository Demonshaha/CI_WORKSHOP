package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
      Task task = tasks.get(description);
      task.setComplete(true);
      tasks.put(description, task);
   }

   public boolean getStatus(String description) {
      // Add code here
      Task task = tasks.get(description);
      if(task != null) {
         if(task.isComplete()) {
            return true;
         } else {
            return false;
         }
      }
      return false;
   }

   public Task getTask(String description) {
      // Add code here
      Task task = tasks.get(description);
      if(task != null) {
         return task;
      }
      return null;
   }

   public Task removeTask(String description) {
      // Add code here
      Task task = tasks.remove(description);
      return task;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      HashMap<String, Task> completedTasks = new HashMap<String, Task>();
      for(Map.Entry<String, Task> entry: tasks.entrySet()) {
         Task task = (Task)entry.getValue();
         if(task.isComplete()) {
            completedTasks.put(task.getDescription(), task);
         }
      }
      return completedTasks.values();
   }
}

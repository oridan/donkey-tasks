package main;
public interface Tasks {
  public Iterable<Task> iterate();
  public Task add(Task task);
}
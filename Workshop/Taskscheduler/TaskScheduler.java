import java.util.LinkedList;

public class TaskScheduler {
    private LinkedList<IExecutable> taskQueue = new LinkedList<>();

    public void addTask(IExecutable task) {
        if (taskQueue.isEmpty()) {
            taskQueue.add(task);
            return;
        }
        for (int i = 0; i < taskQueue.size(); i++) {
            if (task.getPriority() > taskQueue.get(i).getPriority()) {
                taskQueue.add(i, task);
                return;
            }
        }
        taskQueue.addLast(task);
    }

    public void executeAllTasks() {
        while (!taskQueue.isEmpty()) {
            IExecutable task = taskQueue.poll();
            task.execute();
        }
    }
}
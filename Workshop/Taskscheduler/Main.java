public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        IExecutable task1 = new EmailTask("Send Welcome Email", 2);
        IExecutable task2 = new ReportTask("Weekly Sales Report", 5);
        IExecutable task3 = new EmailTask("Send Alert Email", 3);

        scheduler.addTask(task1);
        scheduler.addTask(task2);
        scheduler.addTask(task3);

        System.out.println("Executing Tasks by Priority:");
        scheduler.executeAllTasks();
    }
}
public class EmailTask implements IExecutable {
    private String message;
    private int priority;

    public EmailTask(String message, int priority) {
        this.message = message;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void execute() {
        System.out.println("Executing Email Task: " + message);
    }
}
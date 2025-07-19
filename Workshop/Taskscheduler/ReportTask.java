public class ReportTask implements IExecutable {
    private String reportName;
    private int priority;

    public ReportTask(String reportName, int priority) {
        this.reportName = reportName;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void execute() {
        System.out.println("Generating Report: " + reportName);
    }
}

class TaskNode {
    int taskId;
    String taskName, dueDate;
    int priority;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {
    private TaskNode head = null;

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println("Task: " + temp.taskName + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(1, "Task A", 2, "2025-07-04");
        scheduler.addAtEnd(2, "Task B", 1, "2025-07-05");
        scheduler.displayTasks();
    }
}

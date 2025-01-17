package narcibot;
public class ToDo extends Task {
    /**
     * Constructor for a ToDo task with name.
     *
     * @param name
     */
    public ToDo(String name) {
        super(name);
        System.out.println("[T][ ] " + name);
    }

    /**
     * Constructor for a ToDo task with name and status.
     *
     * @param name
     * @param isDone status of task
     */
    public ToDo(String name, boolean isDone) {
        super(name, isDone);
    }

    /**
     * Status of the task in the format [T][status] name.
     * @return String
     */
    @Override
    public String getStatus() {
        return "[T]" + super.getStatus();
    }

    /**
     * Mark todo as done.
     */
    @Override
    public void markDone() {
        System.out.print("[T]");
        super.markDone();
        System.out.println();
    }

    /**
     * Mark todo as not done.
     */
    @Override
    public void markNotDone() {
        System.out.print("[T]");
        super.markNotDone();
        System.out.println();
    }

    /**
     * Return the string of the save format of the todo task
     *
     * @return String
     */
    @Override
    public String save() {
        return "T|" + super.save();
    }

    /**
     * Tells the user that this todo task has no time for it.
     * @param newTime
     */
    public void update(String newTime) {
        System.out.println("There is no time for a todo task");
    }
}

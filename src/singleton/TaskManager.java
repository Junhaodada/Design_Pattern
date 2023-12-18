package singleton;

// 任务管理器的设计
class TaskManager {
    private static TaskManager tm = null;

    private TaskManager() {
    }

    public void displayProcesses() {
    }

    public void displayServices() {
    }

    public static TaskManager getInstance() {
        if (tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }
}

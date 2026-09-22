// OOPS Concept used Encapsul
// Encapsulation- Hiding data and method 
// Abstraction- Hiding implementation details and showing only functionality

import java.util.*;

class task{   
    private String taskName;
    private int taskId;

    public task(String taskName,int taskId){
        this.taskName = taskName;
        this.taskId = taskId;
    }

    public int getId(){
        return taskId;
    }

    public String getName(){
        return taskName;
    }
}

public class todo{

    private ArrayList<task> tasks = new ArrayList<>();

    public void addTask(String t1,int id){
        tasks.add(new task(t1,id));
        System.out.println("Task added successfully");
    }

    public void viewtask(){
        if(tasks.isEmpty()){
            System.out.println("No tasks available");
        }else{
            System.out.println("Tasks available are :");
            for(task t:tasks){
                System.out.println(t.getId() + ". " + t.getName());
            }
        }
    }
    public void deleteTask(int id){
        boolean found = false;
        for(task t:tasks){
            if(t.getId() == id){
                tasks.remove(t);
                System.out.println("Task deleted successfully");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Task not found");
        }
    }

    public static void main(String[] args){
        todo t = new todo();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("1. Add task");
            System.out.println("2. View task");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter task id");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter task name");
                    String tsk = sc.nextLine();
                    t.addTask(tsk, tid);
                    break;

                case 2:
                    t.viewtask();
                    break;

                case 3:
                    System.out.println("Enter the task Id to delete");
                    int delid = sc.nextInt();
                    t.deleteTask(delid);
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

}
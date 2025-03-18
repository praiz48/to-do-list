import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> task_list = new ArrayList<String>();
        Scanner choose = new Scanner(System.in);
        task_list.add("travel");
        task_list.add("eat");
        task_list.add("watch game");
        int choice=0;
        do {
            System.out.println("choose an option \n 1.add to list \n 2.remove form list \n 3. complete task \n 4.display task \n 5.quit");
            choice= choose.nextInt();
            
            switch (choice) {
                case 1:
                    add_item(task_list, choose);
                    break;
                case 2:
                    remove_item(task_list,choose);
                    break;
                case 3:
                    complete_item(task_list,choose);
                    break;
                case 4:
                        for (String task : task_list) {
                            System.out.println(task);
                             }  
                    break;
                case 5:
                        System.out.println("good bye");
                        choose.close();
                        break;
                default:
                    System.out.println("not in the options");
                    break;
            }
        } while (choice!=5);
        
    }
    static void add_item(ArrayList<String>list, Scanner scanner ){
        scanner.nextLine();
        System.out.println("type in task to add");
        String ntask= scanner.nextLine();
        list.add(ntask);
        System.out.println("task successfully added");
        
    }
    static void remove_item(ArrayList<String>list, Scanner scanner){
        scanner.nextLine();
        System.out.println("type in number to remove");
        int index= scanner.nextInt();
        list.remove(index);
        System.out.println("task successfully removed");
        
    }
    static void complete_item(ArrayList<String>list, Scanner scanner ){
        scanner.nextLine();
        System.out.println("type in number completed");
        int index= scanner.nextInt();
        list.set(index,list.get(index)+" (completed)");
        System.out.println("task completed");
       
    }
    
}
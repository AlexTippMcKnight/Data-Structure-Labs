import java.util.Scanner;

public class Main {
    public static void Menu(){
        System.out.println("\nWelcome to StackTest! Please select a number from the list.");
        System.out.println("1. Enqueue a job");
        System.out.println("2. Dequeue a job");
        System.out.println("3. Peek at the front of the queue");
        System.out.println("4. Empty the queue");
        System.out.println("5. Display all jobs");
        System.out.println("6. Exit");
    }//Menu()
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueArrayBased queue = new QueueArrayBased();

        int choice = 0;

        while(choice != 6) {
            Menu();
            choice = in.nextInt();

            if(choice == 1) {
                System.out.println("Enter job ID(int): ");
                int id = in.nextInt();
                System.out.println("Enter document name(String): ");
                String doc_name = in.next();
                System.out.println("Enter number of pages(int): ");
                int pages = in.nextInt();

                PrintJob job = new PrintJob(id, doc_name, pages);
                queue.enqueue(job);
            }
            else if(choice == 2) {
                if(queue.isEmpty()) {
                    System.out.println("Queue is empty. Cannot dequeue.");
                } else {
                    PrintJob job = (PrintJob) queue.dequeue();
                    if(job != null) {
                        System.out.println("Dequeued job: " + job);
                    }
                }
            }
            else if(choice == 3) {
                if(queue.isEmpty()) {
                    System.out.println("Queue is empty. Cannot peek.");
                } else {
                    PrintJob job = (PrintJob) queue.peek();
                    if(job != null) {
                        System.out.println("Front of the queue: " + job);
                    }
                }
            }
            else if(choice == 4) {
                queue.dequeueAll();
                System.out.println("Queue emptied.");
            }
            else if(choice == 5) {
                queue.displayQueue();
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

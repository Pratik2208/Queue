package using_LL;
// Assumes Insertion always happen at rear Side
// Always insertion happens from right and deletion happens from left side

public class Implementation {
    // Initializing front and rear as null
    Node front,rear;

    public void enQueue(int element){
        Node node = new Node();
        node.data = element;
        if(rear == null && front == null){
            front = node;
            rear = node;
        }

        else{
            rear.next = node;
            rear = node;
        }
    }

    public void deQueue(){
        if(rear == null && front == null)
            System.out.println("Queue is empty....");
        System.out.println("Deleted data is " + front.data);
        front = front.next;
    }

    public void display(){
        Node temp = front;
        while(temp!= null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return (front == null && rear == null);
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        impl.enQueue(4);
        impl.enQueue(5);
        impl.deQueue();
        impl.display();
    }
}

package using_array;
// Assumes Insertion always happen at rear Side
// Always insertion happens from right and deletion happens from left side
public class Implementation {
    int capacity,front,rear,currentSize;
    int[] array;

    public Implementation(int size) {
        this.capacity = size;
        this.array = new int[this.capacity];
        this.front=-1;
        this.rear=-1;
    }

    public void enQueue(int element){
        if(!isFull()){
            // Checking if there is First element in queue
            if(rear == -1 && front == -1){
                rear=front=0;
                array[rear]=element;
              currentSize++;
            }
            // Already there are some element in queue
            else{
                rear++;
                array[rear]=element;
                currentSize++;
            }
        }
        else{
            System.out.println("Queue is full.....");
        }
    }

    public void deQueue(){
        if(!isEmpty()){
            front++;
            capacity--;
            System.out.println("Removed Element is : " + array[front-1]);
        }
        else{
            System.out.println("Queue is Empty....");
        }
    }

    public boolean isFull(){
        return (currentSize == capacity);
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation(2);
        impl.enQueue(5);
        impl.enQueue(6);
        impl.deQueue();
        System.out.println(impl.isEmpty());
        System.out.println(impl.isFull());

    }


}

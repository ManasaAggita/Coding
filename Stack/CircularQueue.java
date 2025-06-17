public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    //using only one pointer
    int front=0;
    int rear=0;
    private int size=0;

    public CircularQueue(int size){
        this.data=new int[size];
    }
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public boolean isFull(){
        return size==data.length;

    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item) throws Exception{
        if(isFull())
            throw new Exception("Queue is Full!");
            data[rear]=item;
            rear++;
            rear=rear%data.length;
            size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is Empty!");
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;

    }
    public void display(){
        int i=front;
        int j= rear;
        do{
            System.out.println(data[i]);
            i++;
            i=i%data.length;


        }while(i!=j%data.length);
    }
}

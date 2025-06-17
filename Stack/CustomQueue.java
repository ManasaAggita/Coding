public class CustomQueue {

        protected int[] data;
        private static final int DEFAULT_SIZE=10;
       //using only one pointer
    int end=-1;
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public CustomQueue(){
       this(DEFAULT_SIZE);
    }
    public boolean isFull(){
        return data.length-1==end;

    }
    public boolean isEmpty(){
        return end==-1;
    }
    public boolean insert(int item) throws Exception{
        if(isFull())
            throw new Exception("Queue is Full caannot add item");
        end++;
        data[end]=item;
        return true;
    }
    public int remove() throws  Exception{
        if(isEmpty())
            throw new Exception("Queue is Empty");
        int removed=data[0];
        for(int i=1;i<=end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is Empty");
        return data[0];
    }
    public void display() throws  Exception{
        if(isEmpty())
            throw new Exception("Queue is Empty");
        for(int i=0;i<=end;i++){
            System.out.println(data[i]);
        }

    }


    }



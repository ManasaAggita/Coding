public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    //another use of this keyword is to call a constructor
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        //using this keyword to refer an object 
        this.data= new int[size];
    }
    public boolean isFull(){
        if(ptr==data.length-1)
        return true;
        else 
        return false;
    }
    public boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        else
        return false;
    }
    public boolean push(int item) throws Exception{
        if(isFull())
        throw new Exception("Cannot add to a full stack");
        ptr++;
        data[ptr]=item;
        return true;

        
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        int pop_item= data[ptr];
        
        ptr--;
        return data[ptr];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot display from an empty stack");
        }

        for(int i=ptr; i>=0;i--){
            System.out.println(data[i]);
        }
    }

   

    
}

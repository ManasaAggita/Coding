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
    public boolean push(int item){
        
    }
    
}

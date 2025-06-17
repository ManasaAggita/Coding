public class DynamicStack extends  CustomStack {
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super();
    }
    //overrride methods from parent class
    @Override
    public boolean push(int item) throws Exception{
        if(isFull()){
            int temp[]= new int[data.length];
            for(int i=0;i<data.length-1;i++){
                temp[i]=data[i];
            }
            //in Java, arrays are mutable objects, and the data field is just a reference to an array object. 
            //So even though the original array was fixed size, you can replace the reference in the child class with a larger array.
            data=temp;
        }
        //after this step array is not full
        return super.push(item);
    }

    
}

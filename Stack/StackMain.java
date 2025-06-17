public class StackMain{
    public static void main (String[] args) throws Exception{
    CustomStack cs = new DynamicStack(4);
    cs.push(67);
    cs.push(89);
    cs.push(78);
    cs.push(70);
        cs.push(5);
        cs.push(4);

    cs.display();
    //System.out.println(cs.peek());
    }
    
}
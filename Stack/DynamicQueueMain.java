public class DynamicQueueMain {
    public static void main(String[] args) throws Exception {
        DynmaicQueue dq =new DynmaicQueue(5);
        dq.insert(6);
        dq.insert(89);
        dq.insert(56);
        dq.insert(90);
        dq.insert(98);
        dq.display();
        System.out.println(dq.remove());
        dq.display();
        dq.insert(9);

        dq.insert(18);
        dq.display();

    }
}

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(6);
        cq.insert(89);
        cq.insert(56);
        cq.insert(90);
        cq.insert(98);
        cq.display();
        System.out.println(cq.remove());
        cq.display();
        cq.insert(9);
        cq.display();
        cq.insert(18);

    }
}

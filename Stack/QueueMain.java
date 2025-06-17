public class QueueMain  {
    public static void main(String[] args) throws Exception {
        CustomQueue cq  = new CustomQueue(5);
            cq.insert(6);
            cq.insert(89);
            cq.insert(56);
            cq.insert(90);
            cq.insert(98);
            cq.display();
            cq.remove();
            cq.display();

        }
    }


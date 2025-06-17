public class DynmaicQueue  extends CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    //using only one pointer
    int front = 0;
    int rear = 0;
    private int size = 0;

    public DynmaicQueue(int size) {
        super();
    }

    public DynmaicQueue() {
        super();
    }

@Override
    public boolean insert(int item) throws Exception {
        if (isFull()) {
            int length = 2 * data.length;
            int temp[] = new int[length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + front) % data.length];

            }
            data = temp;
        }

        return super.insert(item);
    }
}
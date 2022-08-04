import java.util.ArrayList;

public class JumpList {
    private static ArrayList<ARun> runs = new ArrayList<>();
    static int head;
    static int tail;
    static int size;

    public static ArrayList<ARun> getRuns() {
        return runs;
    }

    public static void setRuns(ArrayList<ARun> runs) {
        JumpList.runs = runs;
    }

    public static int getHead() {
        return head;
    }

    public static void setHead(int head) {
        JumpList.head = head;
    }

    public static int getTail() {
        return tail;
    }

    public static void setTail(int tail) {
        JumpList.tail = tail;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        JumpList.size = size;
    }

    JumpList(int size)
    {
        this.size = size;
        this.head = this.tail = -1;
    }


    public static boolean isEmpty() {
        if (head == -1)
            return true;
        else
            return false;
    }

    public void enQueue(ARun run)
    {

        // Condition if queue is full.


        // condition for empty queue.
        if(head == -1)
        {
            head = 0;
            tail = 0;
            runs.add(tail, run);
        }
        else if(tail == size - 1 && head != 0)
        {
            tail = 0;
            runs.set(tail, run);
        }

        else
        {
            tail = (tail + 1);

            // Adding a new element if
            if(head <= tail)
            {
                runs.add(tail, run);
            }

            // Else updating old value
            else
            {
                runs.set(tail, run);
            }
        }
    }

    public ARun deQueue()
    {
        ARun temp;
        if(head == -1) {
            return null;
        }
        temp = runs.get(head);
        if(head == tail) {
            head = -1;
            tail = -1;
        }
        else if(head == size - 1) {
            head = 0;
        }
        else {
            head = head + 1;
        }
        return temp;
    }
}

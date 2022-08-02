import java.util.Queue;

public class JumpList {
    static Queue<ARun> runs;
    int head;
    int tail;


    public static Boolean isEmpty(){
        if(runs.isEmpty())
            return true;
        else
            return false;
    }

    public static void enqueue(ARun run){
        runs.add(run);
    }
    public static ARun dequeue(){
        return runs.poll();
    }
}

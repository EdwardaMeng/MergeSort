public class MergeSort {
    static int index = 0;
    static int compares = 0;

    public static void sort(int[] arr){


        int[] dst = new int[arr.length];
        JumpList jl = new JumpList(arr.length+1);

            for(int i = 0; i < arr.length; i++){
                ARun run = new ARun();
                run.setStart(i);
                run.setLength(1);
                jl.enQueue(run);
//                System.out.println(run.getStart()+ " " + run.getLength());
            }

//        System.out.println(jl.deQueue().getStart());
        while(!jl.isEmpty()){

            ARun run1 = jl.deQueue();
            ARun run2 = jl.deQueue();
            if(run1 != null && run2 != null){
                merge(arr, dst, run1, run2);
            }
            else
                break;
        }

        for(int i = 0; i < dst.length; i++){
            System.out.println(dst[i]);
        }
    }
    public static void merge(int[] src, int[] dst, ARun run1, ARun run2){
        int i = run1.getStart();
        int j = run2.getStart();
        while(i < run1.getLength() + run1.getStart() + 1){
            if(src[i] <= src[j]){
                dst[index++] = src[i++];
                compares++;
            }
            else{
                dst[index++] = src[j++];
                compares++;
            }
        }


    }

    public static void main(String[] args){
        int[] arr = {3,5,1,2,7,9,2};
        MergeSort.sort(arr);
    }
}

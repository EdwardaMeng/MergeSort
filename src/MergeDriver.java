import java.util.Objects;
import java.util.Random;

public class MergeDriver {
    public static int[] generateArray(){
        Random random = new Random();
        int length = Math.abs(random.nextInt(50));
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = Math.abs(random.nextInt(50));
        }
        return array;
    }

    public static int[] generateArrayWithLength(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.abs(random.nextInt(50));
        }
        return array;
    }
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("No Sort Type!");
        }
        else if(args.length == 1){
            if(Objects.equals(args[0], "MS")){
                MergeSort.sort(generateArray());
            }
            else if(Objects.equals(args[0], "SMS")){
                StructuredMergeSort.sort(generateArray());
            }
            else{
                System.out.println("Wrong Sort Type!");
            }
        }
        else if(args.length == 2){
            if(Objects.equals(args[0], "MS")){
                MergeSort.sort(generateArrayWithLength(Integer.parseInt(args[1])));
            }
            else if(Objects.equals(args[0], "SMS")){
                StructuredMergeSort.sort(generateArrayWithLength(Integer.parseInt(args[1])));

            }
            else{
                System.out.println("Wrong Sort Type!");
            }
        }
        else{
            if(Objects.equals(args[0], "MS")){
                int[] array = new int[args.length - 1];
                for(int i = 0; i < array.length; i++){
                    array[i] = Integer.parseInt(args[i+1]);
                }
                MergeSort.sort(array);
            }
            else if(Objects.equals(args[0], "SMS")){
                int[] array = new int[args.length - 1];
                for(int i = 0; i < array.length; i++){
                    array[i] = Integer.parseInt(args[i+1]);
                }
                StructuredMergeSort.sort(array);

            }
            else{
                System.out.println("Wrong Sort Type!");
            }
        }
    }
}

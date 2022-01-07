public class Lab18q1 {
    public static void main(String[] args){
        int count[]= new int[10];
        for(int i = 0;i<100;i++){
            int temp= (int) (Math.random()*10);
            count[temp]++;
        }
        System.out.println("The counts for each number are:");
        for(int i = 0; i<10;i++){
            System.out.println(i+": "+count[i]);
        }
    }
}

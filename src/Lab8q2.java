public class Lab8q2 {
    public static void main(String[] args){
        String str = "";
        for (int i = 0; i < 3; i++) {
            int r = 65 + (int) (Math.random() * 26);
            char c = (char) r;
            str += c;
        }
        for (int i = 0; i < 4; i++) {
            int r = (int)(Math.random() * 10);
            str += r;
        }
        System.out.println(str);
    }
}

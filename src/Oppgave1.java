public class Oppgave1 {
    public static void main(String[] args) {

        System.out.println("Hello world");
        int []a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int min_index=min (a);
        System.out.println(min_index);
    }
    static int min(int[]a){
        int min_value=a[0];
        int min_index=0;
        for (int i=1;i<a.length;i++){
            if (min_value>i){
                min_index=i;
            }
        }
        return min_index;
    }
}
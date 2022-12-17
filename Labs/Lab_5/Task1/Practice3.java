public class Practice3 {
    public static void main(String[] args) {
        int a []= {22,2,4,5,6,7,8,9,15,0,4,13,1,12,14,3,65,88,45,16,79,74,39,67,10 };
        int i, j;
        int great = a[0];
        for(i = 1; i < a.length; i++){
            if(a[i] > great){
                great = a[i];
            }           
        }
        System.out.println("Greatest is " + great);
    }
}

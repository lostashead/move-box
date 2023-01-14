import java.util.Random;
public class control {
    static int num = 1000;
    public static void main(String[] args){

        //呼び出しがあった場合にその階へ向かう
        for(int i=0;i< num; i++){
            int randnum = rand();
            if(randnum == 10){
                operator.call();
            }
            if(randnum == 1){
                operator.operation();
            }
                elevator.setting();
        }
    }

    public static int rand(){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        return num;
    }
}

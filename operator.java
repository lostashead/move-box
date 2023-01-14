import java.util.Random;

public class operator{

    public static void main(String[] args){

    }
    //10までの乱数の生成
    public static int rand(){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        return num;
    }
    
    //エレベーターを呼び出す
    public static int call(){
        int taker = rand();
        elevator.queue.add(taker);
        System.out.println(taker+"に呼び出しました");
        return taker;
    }
    //中に乗った人の行先階
    public static int operation(){
        int caller = rand();
        elevator.queue.add(caller);
        System.out.println(caller+"へ向かいます");
        elevator.queue.remove(0);
        return caller;
    }
}
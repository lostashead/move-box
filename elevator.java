import java.util.ArrayList;
import java.util.List;

//簡易的なエレベーター(10階建て)を作成して下層階と上層階（優先）での呼び出しにおいて発生するフィーチャインタラクションを作成する
public class elevator {
    //かご本体の位置
    static int basket;
    //呼び出し階のリスト
    static List<Integer> queue = new ArrayList<Integer>();
    public static void main(String[] args){
    }

    public static void setting(){
        
        //呼び出しがある場合はqueueに格納されている呼び出し階に向かう
        if(queue != null && queue.size() != 0){
            elevator.move();
            System.out.println(basket);
            System.out.println(queue);
        }else if(basket == 1){
            System.out.println("一階に停止しているため，何も動作しませんでした．");
        }else{
            //何もないときはデフォルトの階へ行く
            elevator.initial();
            System.out.println("デフォルト階に移動しました:一階");
        }
    }

    public static void initial(){
        basket = 1;
    }

    public static void move(){
        System.out.println(queue);
        basket = queue.get(0);
            queue.remove(0);
    }
}

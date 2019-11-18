package Counter;

public class Counter {
    int num;
    int InitialNum;

    public Counter(){
        this.num = 0;
        this.InitialNum = 0;
    }
    public Counter(int num){
        this.num = num;
        this.InitialNum = num;
    }
    public void add(int number){
        this.num += number;
            }
    public void add(){
        this.num ++;
            }
    public int get(){
        return this.num;
    }
    public void reset(){
        this.num = InitialNum;
    }
}

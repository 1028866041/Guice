/**
 * Created by Administrator on 2019/10/26 0026.
 */
public class Printer implements MyApplet {

    private MyDest destination;
    private StringProvider s;

    public Printer(MyDest destination, StringProvider s){
        super();
        this.destination = destination;
        this.s= s;
    }

    public void print(){
        destination.write(this.s);
    }

    public void run(){
        print();
    }
}
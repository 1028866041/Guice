
/**
 * Created by Administrator on 2019/10/26 0026.
 */
public class Config {

    public static MyApplet getMainApplet(){
       return new Printer(new MyDest(), new StringProvider() {
           public String get() {
               return "inject";
           }
       });
    }
}

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Created by Administrator on 2019/10/26 0026.
 */
public class AppModule extends AbstractModule {
    protected void configure() {
        bind(MyApplet.class).to(Printer.class);
    }

    @Provides
    private String getString(){
        return "inject";
    }
}

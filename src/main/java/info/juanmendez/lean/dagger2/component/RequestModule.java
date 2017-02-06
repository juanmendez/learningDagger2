package info.juanmendez.lean.dagger2.component;

import dagger.Module;
import dagger.Provides;
import info.juanmendez.lean.dagger2.Database;

/**
 * Created by musta on 2/4/2017.
 */
@Module
public class RequestModule {

    public RequestModule(){
    }

    @ChildScope
    @Provides
    public Database providesDatabase(){
        return new ChildDatabaseImp();
    }
}

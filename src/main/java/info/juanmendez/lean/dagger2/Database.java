package info.juanmendez.lean.dagger2;

/**
 * Created by @juanmendezinfo on 2/5/2017.
 */
public interface Database {

    public boolean connect();
    public String[] getUsers();
}
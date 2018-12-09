package info.juanmendez.lean.dagger2.ui;

import info.juanmendez.lean.dagger2.Application;
import info.juanmendez.lean.dagger2.request.RequestComponent;
import info.juanmendez.lean.dagger2.request.RequestModule;
import info.juanmendez.lean.dagger2.request.RequestRouter;
import info.juanmendez.lean.dagger2.server.Database;

import javax.inject.Inject;

/**
 * Created by @juanmendezinfo on 2/4/2017.
 */
public class MainView {
    @Inject
    RequestRouter requestRouter;

    @Inject
    Database database;

    public MainView(){

        RequestComponent requestComponent = Application.serverComponent.requestComponent().requestModule(new RequestModule()).build();
        requestComponent.inject( this );

        if( database.connect() ){
            requestRouter.request( "login");
            requestRouter.displayPage();
        }
    }
}

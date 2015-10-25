package com.garcilomanuel.cleangames.app.base;

import android.app.Application;
import android.content.Context;
import com.garcilomanuel.cleangames.app.di.RootModule;
import dagger.ObjectGraph;

/**
 * Created by Manuel García.
 */
public class MVPCleanGamesApplication extends Application {

  private ObjectGraph objectGraph;

  public static MVPCleanGamesApplication get(Context context) {
    return (MVPCleanGamesApplication) context.getApplicationContext();
  }

  @Override
  public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(new RootModule(this));
    objectGraph.inject(this);
  }

  public void inject(Object object) {
    objectGraph.inject(object);
  }

}

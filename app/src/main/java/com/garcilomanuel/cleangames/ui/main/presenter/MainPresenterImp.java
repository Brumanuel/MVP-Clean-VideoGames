package com.garcilomanuel.cleangames.ui.main.presenter;

import android.util.Log;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatforms;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class MainPresenterImp extends MainPresenter {

  private final String TAG = this.getClass().getSimpleName();

  private GetPlatforms getPlatforms;

  public MainPresenterImp(GetPlatforms getPlatforms) {
    this.getPlatforms = getPlatforms;
    loadPlatforms();
  }

  @Override
  public void loadPlatforms() {
    getPlatforms.getPlatforms(new GetPlatforms.Callback() {
      @Override
      public void onSuccess(List<Platform> platforms) {
        for (Platform platform : platforms) {
          Log.i(TAG, platform.getName());
        }
      }

      @Override
      public void onError(Throwable throwable) {
        Log.e(TAG, throwable.getMessage(), throwable);
      }
    });
  }
}

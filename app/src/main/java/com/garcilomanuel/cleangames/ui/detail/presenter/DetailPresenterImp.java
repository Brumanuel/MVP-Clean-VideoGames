package com.garcilomanuel.cleangames.ui.detail.presenter;

import android.util.Log;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatform;
import com.garcilomanuel.cleangames.domain.model.Platform;

/**
 * Created by Manuel García.
 */
public class DetailPresenterImp extends DetailPresenter {

  private final String TAG = this.getClass().getSimpleName();

  private GetPlatform getPlatform;

  public DetailPresenterImp(GetPlatform getPlatform) {
    this.getPlatform = getPlatform;
  }

  @Override
  public void setPlatform(int id) {
    getPlatform.getPlatform(id, new GetPlatform.Callback() {
      @Override
      public void onSuccess(Platform platform) {
        view.showDetail(platform);
      }

      @Override
      public void onError(Throwable throwable) {
        Log.e(TAG, throwable.getMessage(), throwable);
        view.showError(throwable.getMessage());
      }
    });
  }
}

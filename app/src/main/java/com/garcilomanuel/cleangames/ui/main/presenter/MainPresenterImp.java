package com.garcilomanuel.cleangames.ui.main.presenter;

import android.util.Log;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.domain.repository.PlatformRepository;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class MainPresenterImp extends MainPresenter {

  private final String TAG = this.getClass().getSimpleName();

  private PlatformRepository platformRepository;

  public MainPresenterImp(PlatformRepository platformRepository) {
    this.platformRepository = platformRepository;
  }

  @Override
  public void loadPlatforms() {
    platformRepository.getPlatforms(new PlatformRepository.Callback() {
      @Override
      public void onSuccess(List<Platform> platforms) {
        Log.i(TAG, platforms.toString());
      }

      @Override
      public void onError(String error) {
        Log.e(TAG, error);
      }
    });
  }
}

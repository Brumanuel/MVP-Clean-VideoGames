package com.garcilomanuel.cleangames.ui.platforms.presenter;

import com.garcilomanuel.cleangames.app.navigator.Navigator;
import com.garcilomanuel.cleangames.domain.interactor.platform.GetPlatforms;
import com.garcilomanuel.cleangames.domain.interactor.platform.LoadPlatforms;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;

/**
 * Created by Manuel García.
 */
public class PlatformsPresenterImp extends PlatformsPresenter {

  private GetPlatforms getPlatforms;
  private LoadPlatforms loadPlatforms;
  private Navigator navigator;

  public PlatformsPresenterImp(Navigator navigator, GetPlatforms getPlatforms,
      LoadPlatforms loadPlatforms) {
    this.getPlatforms = getPlatforms;
    this.loadPlatforms = loadPlatforms;
    this.navigator = navigator;
  }

  @Override
  public void onViewCreated() {
    view.startLoading();
    loadPlatforms();
  }

  @Override
  public void onPlatformSelected(Platform platform) {
    navigator.goToDetails(platform.getId());
  }

  private void loadPlatforms() {
    loadPlatforms.loadPlatforms(new LoadPlatforms.Callback() {
      @Override
      public void onSuccess() {
        onSuccessLoad();
      }

      @Override
      public void onError(Throwable throwable) {
        view.showError(throwable.getMessage());
      }
    });
  }

  private void onSuccessLoad() {
    getPlatforms.getPlatforms(new GetPlatforms.Callback() {
      @Override
      public void onSuccess(List<Platform> platforms) {
        view.showPlatforms(platforms);
        view.stopLoading();
      }

      @Override
      public void onError(Throwable throwable) {
        view.showError(throwable.getMessage());
        view.stopLoading();
      }
    });
  }
}

package com.garcilomanuel.cleangames.data.giantbomb;

import android.util.Log;
import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.data.retrofit.GiantBombService;
import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Manuel García.
 */
public class GiantBombRetrofitSource implements GameDataSource {

  private final String TAG = this.getClass().getSimpleName();

  private GiantBombService giantBombService;

  public GiantBombRetrofitSource() {
    initAdapter();
  }

  private void initAdapter() {
    RestAdapter retrofit =
        new RestAdapter.Builder().setEndpoint(ConfigGiantBombApi.API_URL).build();

    giantBombService = retrofit.create(GiantBombService.class);
  }

  @Override
  public void getPlatforms(Callback callback) {
    giantBombService.getPlatforms(ConfigGiantBombApi.API_KEY, ConfigGiantBombApi.API_FORMAT,
        new retrofit.Callback<List<Platform>>() {
          @Override
          public void success(List<Platform> platforms, Response response) {
            Log.i(TAG, platforms.toString());
          }

          @Override
          public void failure(RetrofitError error) {
            Log.e(TAG, error.getMessage());
          }
        });
  }
}

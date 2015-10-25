package com.garcilomanuel.cleangames.data.giantbomb;

import android.util.Log;
import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.data.giantbomb.mapper.GiantBombToDomainMapper;
import com.garcilomanuel.cleangames.data.giantbomb.model.Data;
import com.garcilomanuel.cleangames.data.retrofit.GiantBombService;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Manuel García.
 */
public class GiantBombRetrofitSource implements GameDataSource {

  private final String TAG = this.getClass().getSimpleName();

  private GiantBombService giantBombService;
  private GiantBombToDomainMapper giantBombToDomainMapper;

  public GiantBombRetrofitSource(GiantBombToDomainMapper giantBombToDomainMapper) {
    this.giantBombToDomainMapper = giantBombToDomainMapper;
    initAdapter();
  }

  private void initAdapter() {
    RestAdapter retrofit =
        new RestAdapter.Builder().setEndpoint(ConfigGiantBombApi.API_URL).build();

    giantBombService = retrofit.create(GiantBombService.class);
  }

  @Override
  public void getPlatforms(final Callback callback) {
    giantBombService.getPlatforms(ConfigGiantBombApi.API_KEY, ConfigGiantBombApi.API_FORMAT,
        new retrofit.Callback<Data>() {
          @Override
          public void success(Data data, Response response) {
            callback.onSuccess(giantBombToDomainMapper.mapResutlsToPlatforms(data.getResults()));
          }

          @Override
          public void failure(RetrofitError error) {
            Log.e(TAG, error.getMessage());
          }
        });
  }
}

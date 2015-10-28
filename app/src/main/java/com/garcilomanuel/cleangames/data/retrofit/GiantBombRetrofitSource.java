package com.garcilomanuel.cleangames.data.retrofit;

import android.util.Log;
import com.garcilomanuel.cleangames.data.GameDataSource;
import com.garcilomanuel.cleangames.data.giantbomb.ConfigGiantBombApi;
import com.garcilomanuel.cleangames.data.giantbomb.mapper.GiantBombToDomainMapper;
import com.garcilomanuel.cleangames.data.giantbomb.model.Data;
import com.garcilomanuel.cleangames.data.retrofit.GiantBombService;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import retrofit.ErrorHandler;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;

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
    Gson gson = new GsonBuilder()
        .setDateFormat("yyyy-MM-dd")
        .create();

    RestAdapter retrofit = new RestAdapter.Builder().setEndpoint(ConfigGiantBombApi.API_URL)
        .setErrorHandler(new ErrorHandler() {
          @Override
          public Throwable handleError(RetrofitError cause) {
            Log.e(TAG, cause.toString());
            return cause.fillInStackTrace();
          }
        }).setConverter(new GsonConverter(gson))
        .build();

    giantBombService = retrofit.create(GiantBombService.class);
  }

  @Override
  public List<Platform> getPlatforms() {
    Data data =
        giantBombService.getPlatforms(ConfigGiantBombApi.API_KEY, ConfigGiantBombApi.API_FORMAT);
    return giantBombToDomainMapper.mapResutlsToPlatforms(data.getResults());
  }
}

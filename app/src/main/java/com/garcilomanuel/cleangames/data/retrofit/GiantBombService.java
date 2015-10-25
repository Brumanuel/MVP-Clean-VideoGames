package com.garcilomanuel.cleangames.data.retrofit;

import com.garcilomanuel.cleangames.domain.model.Platform;
import java.util.List;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Manuel García.
 */
public interface GiantBombService {

  @GET("/platforms")
  void getPlatforms(@Query("api_key") String apiKey, @Query("format") String format,
      Callback<List<Platform>> callback);
}

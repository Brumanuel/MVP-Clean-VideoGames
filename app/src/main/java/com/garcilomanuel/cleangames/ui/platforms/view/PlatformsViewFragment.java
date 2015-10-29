package com.garcilomanuel.cleangames.ui.platforms.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.garcilomanuel.cleangames.R;
import com.garcilomanuel.cleangames.app.base.BaseFragment;
import com.garcilomanuel.cleangames.domain.model.Platform;
import com.garcilomanuel.cleangames.ui.platforms.adapter.PlatformsRecyclerAdapter;
import com.garcilomanuel.cleangames.ui.platforms.presenter.PlatformsPresenter;
import com.melnykov.fab.FloatingActionButton;
import java.util.List;
import javax.inject.Inject;

/**
 * Created by Manuel García.
 */
public class PlatformsViewFragment extends BaseFragment implements PlatformsView {

  @Inject protected PlatformsPresenter platformsPresenter;
  @Bind(R.id.rv_platforms) protected RecyclerView rvPlatforms;
  @Bind(R.id.fab) protected FloatingActionButton fabSort;
  @Bind(R.id.loading) protected ProgressBar pbLoading;

  private PlatformsRecyclerAdapter adapter;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.platforms_list, container, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    platformsPresenter.setView(this);
    platformsPresenter.onViewCreated();
    initRecyclerView();
    initListeners();
  }

  private void initRecyclerView() {
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
    rvPlatforms.setLayoutManager(layoutManager);
    fabSort.attachToRecyclerView(rvPlatforms);

    adapter = new PlatformsRecyclerAdapter(getActivity().getApplicationContext());
    rvPlatforms.setAdapter(adapter);
  }

  private void initListeners() {
    adapter.setOnClickListener(new PlatformsRecyclerAdapter.OnClick() {
      @Override
      public void onPlatformClicked(Platform platform) {
        platformsPresenter.onPlatformSelected(platform);
      }
    });

    fabSort.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        adapter.changeOrderSort();
      }
    });
  }

  @Override
  public void showPlatforms(List<Platform> platforms) {
    adapter.updatePlatforms(platforms);
  }

  @Override
  public void showError(String error) {
    Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT)
        .show();
  }

  @Override
  public void startLoading() {
    pbLoading.setVisibility(View.VISIBLE);
  }

  @Override
  public void stopLoading() {
    pbLoading.setVisibility(View.INVISIBLE);
  }
}

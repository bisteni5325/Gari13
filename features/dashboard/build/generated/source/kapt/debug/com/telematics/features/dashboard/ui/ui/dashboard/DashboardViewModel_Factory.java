// Generated by Dagger (https://dagger.dev).
package com.telematics.features.dashboard.ui.ui.dashboard;

import com.telematics.data.model.tracking.MeasuresFormatter;
import com.telematics.data.tracking.TrackingUseCase;
import com.telematics.domain.repository.RewardRepo;
import com.telematics.domain.repository.SettingsRepo;
import com.telematics.domain.repository.StatisticRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  private final Provider<StatisticRepo> statisticRepoProvider;

  private final Provider<TrackingUseCase> trackingUseCaseProvider;

  private final Provider<SettingsRepo> settingsRepoProvider;

  private final Provider<RewardRepo> rewardRepoProvider;

  private final Provider<MeasuresFormatter> measuresFormatterProvider;

  public DashboardViewModel_Factory(Provider<StatisticRepo> statisticRepoProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<RewardRepo> rewardRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    this.statisticRepoProvider = statisticRepoProvider;
    this.trackingUseCaseProvider = trackingUseCaseProvider;
    this.settingsRepoProvider = settingsRepoProvider;
    this.rewardRepoProvider = rewardRepoProvider;
    this.measuresFormatterProvider = measuresFormatterProvider;
  }

  @Override
  public DashboardViewModel get() {
    return newInstance(statisticRepoProvider.get(), trackingUseCaseProvider.get(), settingsRepoProvider.get(), rewardRepoProvider.get(), measuresFormatterProvider.get());
  }

  public static DashboardViewModel_Factory create(Provider<StatisticRepo> statisticRepoProvider,
      Provider<TrackingUseCase> trackingUseCaseProvider,
      Provider<SettingsRepo> settingsRepoProvider, Provider<RewardRepo> rewardRepoProvider,
      Provider<MeasuresFormatter> measuresFormatterProvider) {
    return new DashboardViewModel_Factory(statisticRepoProvider, trackingUseCaseProvider, settingsRepoProvider, rewardRepoProvider, measuresFormatterProvider);
  }

  public static DashboardViewModel newInstance(StatisticRepo statisticRepo,
      TrackingUseCase trackingUseCase, SettingsRepo settingsRepo, RewardRepo rewardRepo,
      MeasuresFormatter measuresFormatter) {
    return new DashboardViewModel(statisticRepo, trackingUseCase, settingsRepo, rewardRepo, measuresFormatter);
  }
}

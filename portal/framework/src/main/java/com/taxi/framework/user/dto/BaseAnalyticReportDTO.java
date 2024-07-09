package com.taxi.framework.user.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BaseAnalyticReportDTO {

    private String totalPassengersPerDay;
    private String totalTripsPerDay;
    private String totalCanceledTripsPerDay;
    private String totalActiveDriversPerDay;
    private String totalProfitPerDay;


}
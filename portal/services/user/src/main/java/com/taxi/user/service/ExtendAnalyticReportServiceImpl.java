package com.taxi.user.service;

import com.taxi.user.dao.AnalyticReportRepository;
import com.taxi.user.dto.ExtendedAnalyticReportDTO;
import com.taxi.user.model.AnalyticReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GetAnalyticReport")
public class ExtendAnalyticReportServiceImpl implements ExtendAnalyticReportService {

    @Autowired
    private AnalyticReportRepository analyticReportRepository;
    @Override
    public ExtendedAnalyticReportDTO getAnalyticReport(int day) {
        ExtendedAnalyticReportDTO extendedAnalyticReportDTO = new ExtendedAnalyticReportDTO();

        AnalyticReport entity = analyticReportRepository.findById((long) day)
                .orElseThrow(()-> new RuntimeException("not found AnalyticReport!!"));

        extendedAnalyticReportDTO.setTotalPassengersPerDay(entity.getTotalPassengersPerDay());
        extendedAnalyticReportDTO.setTotalTripsPerDay(entity.getTotalTripsPerDay());
        extendedAnalyticReportDTO.setTotalProfitPerDay(entity.getTotalProfitPerDay());
        extendedAnalyticReportDTO.setTotalActiveDriversPerDay(entity.getTotalActiveDriversPerDay());

        return extendedAnalyticReportDTO;
    }
}

package com.taxi.framework.user.controller;

import com.taxi.framework.user.dto.BaseAnalyticReportDTO;
import com.taxi.framework.user.service.AnalyticReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public abstract class AbstractAnalyticReportController<T extends BaseAnalyticReportDTO> {

    protected final AnalyticReportService<T> analyticReportService;


    protected AbstractAnalyticReportController(AnalyticReportService<T> service) {
        this.analyticReportService = service;
    }


    @GetMapping("/getAnalyticReport/{day}")
    public ResponseEntity<T> getAnalyticReport(@PathVariable int day) {
        return ResponseEntity.ok(analyticReportService.getAnalyticReport(day));
    }

}

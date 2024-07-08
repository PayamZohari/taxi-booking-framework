package com.taxi.user.dao;

import com.taxi.user.model.AnalyticReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticReportRepository extends JpaRepository<AnalyticReport, Long> {
}

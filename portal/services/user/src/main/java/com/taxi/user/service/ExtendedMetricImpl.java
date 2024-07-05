package com.taxi.user.service;

import com.taxi.framework.metrics.service.AbstractMetricImpl;

public class ExtendedMetricImpl extends AbstractMetricImpl {
    public ExtendedMetricImpl(int port) {
        RunHttpServer(port);
        RegisterMetrics();
        //Initialize metrics for our own team but it is not a good practice.
    }
}

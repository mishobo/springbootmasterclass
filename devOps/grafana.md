# GRAFANA
Grafana is a powerful open-source tool that provides rich visualizations for monitoring data from various sources.
By pairing Grafana with a Spring Boot application, you can track performance metrics such as memory usage, 
CPU load, response time, and other custom metrics.

### FEATURES
* Visualization: Grafana provides a wide array of visualizations like graphs, heatmaps, and gauges.
* Alerting: Set up alerts based on the metrics you collect, helping you catch issues before they escalate.
* Custom Dashboards: Build custom dashboards to track the health of your application in real time.

### Prerequisites
1. Spring Boot application (version 2.5 or later).
2. Prometheus for metrics collection.
3. Grafana installed (can be done via Docker or directly on your machine).

```yaml
<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

* Micrometer is the metrics collection library, and the Prometheus registry helps collect and store the metrics.
* Actuator provides production-ready endpoints like /metrics that expose application metrics.
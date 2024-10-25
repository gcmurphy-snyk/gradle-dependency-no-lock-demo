package com.example.serviceb;

import com.example.core.CoreService;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.yaml.snakeyaml.Yaml;

public class ServiceB {
    private final CoreService coreService;
    private final HttpClient httpClient;
    private final Yaml yaml;

    public ServiceB() {
        this.coreService = new CoreService();
        this.httpClient = HttpClients.createDefault();
        this.yaml = new Yaml();
    }

    public String processConfig(String yamlConfig) {
        Object config = yaml.load(yamlConfig);
        return coreService.serialize(config);
    }
}
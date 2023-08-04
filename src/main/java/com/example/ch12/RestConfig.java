package com.example.ch12;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;
@ApplicationPath("/api")
public class RestConfig extends Application {
    public Map<String, Object> getProperties(){
        Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages","ch12");
        return properties;
    }
}

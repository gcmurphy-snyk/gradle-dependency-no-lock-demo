package com.example.servicea;

import com.example.core.CoreService;
import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class ServiceA {
    private final CoreService coreService;

    public ServiceA() {
        this.coreService = new CoreService();
    }

    public String processString(String input) {
        if (Strings.isNullOrEmpty(input)) {
            return StringUtils.EMPTY;
        }
        return coreService.serialize(StringUtils.capitalize(input));
    }
}
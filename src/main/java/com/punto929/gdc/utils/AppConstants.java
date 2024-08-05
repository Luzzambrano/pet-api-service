package com.punto929.gdc.utils;

public interface AppConstants {
  public static final String[] WHITE_LIST_URL = {
      "/api/v1/auth/**",
      "/swagger-resources",
      "/swagger-resources/**",
      "/configuration/ui",
      "/configuration/security",
      "/swagger-ui/**",
      "/webjars/**",
      "/swagger-ui.html",
      "/actuator/**"
  };
}

package com.yildiztech.i18n.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class LocaleConfiguration {

  //private static final String DEFAULT_LOCALE = "tr-TR";

  //@Bean
  //public LocaleResolver localeResolver() {
  //  var localeResolver = new AcceptHeaderLocaleResolver();
  //  localeResolver.setDefaultLocale(Locale.forLanguageTag(DEFAULT_LOCALE));
  //  return localeResolver;
  //}

  @Bean
  public LocaleResolver localeResolver() {
    return new CustomLocaleResolver();
  }
}

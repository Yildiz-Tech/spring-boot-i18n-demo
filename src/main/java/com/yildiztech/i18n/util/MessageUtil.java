package com.yildiztech.i18n.util;

import com.yildiztech.i18n.config.MessageSourceConfig;
import java.util.Locale;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MessageUtil {

  public static String getMessage(String message, String... dynamicValues) {
    return MessageSourceConfig.messageSource().getMessage(message, dynamicValues, LocaleContextHolder.getLocale());
  }

  public static String getMessage(String message, Locale locale, String... dynamicValues) {
    return MessageSourceConfig.messageSource().getMessage(message, dynamicValues, locale);
  }
}

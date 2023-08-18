package com.yildiztech.i18n.config;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Configuration
public class CustomLocaleResolver extends AcceptHeaderLocaleResolver {

  private static final String DEFAULT_LOCALE = "tr-TR";
  private static final List<Locale> LOCALES = Arrays.asList(Locale.forLanguageTag("tr"), Locale.forLanguageTag("en"));

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    if (StringUtils.isEmpty(request.getHeader("Accept-Language"))) {
      return Locale.forLanguageTag(DEFAULT_LOCALE);
    }
    var list = Locale.LanguageRange.parse(request.getHeader("Accept-Language"));
    return Locale.lookup(list, LOCALES);
  }
}

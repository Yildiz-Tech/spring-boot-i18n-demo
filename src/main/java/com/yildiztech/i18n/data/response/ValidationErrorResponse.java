package com.yildiztech.i18n.data.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ValidationErrorResponse {

  private String defaultMessage;

  private String objectName;

  private String field;

  private Object rejectedValue;

  private String code;
}

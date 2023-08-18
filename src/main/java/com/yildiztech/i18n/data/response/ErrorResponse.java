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
public class ErrorResponse<T> {

  private int status;

  private boolean isSuccess;

  private String error;

  private String errorCode;

  private String message;

  private T data;
}


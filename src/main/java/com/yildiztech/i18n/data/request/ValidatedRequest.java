package com.yildiztech.i18n.data.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidatedRequest {

  @NotEmpty(message = "{error.validation.empty.name}")
  private String name;

  @Size(message = "{error.validation.invalid.size.surname}", min = 5, max = 10)
  private String surname;
}

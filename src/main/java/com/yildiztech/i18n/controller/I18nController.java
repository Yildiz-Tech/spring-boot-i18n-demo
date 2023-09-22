package com.yildiztech.i18n.controller;

import com.yildiztech.i18n.data.request.ValidatedRequest;
import com.yildiztech.i18n.service.I18nService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class I18nController {

  private final I18nService i18nService;

  @GetMapping("/localized-message")
  public ResponseEntity<Object> getLocalizedMessage() {
    return ResponseEntity.ok(i18nService.getLocalizedMessage());
  }

  @PostMapping("/validation-error")
  public ResponseEntity<Void> getValidationError(@RequestBody @Valid ValidatedRequest request) {
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/not-found-error")
  public ResponseEntity<Void> getNotFoundError() {
    i18nService.getNotFoundError();
    return ResponseEntity.noContent().build();
  }
}

package com.yildiztech.i18n.service;

import com.yildiztech.i18n.exception.EntityNotFoundException;
import com.yildiztech.i18n.util.MessageUtil;
import org.springframework.stereotype.Service;

@Service
public class I18nService {

  public void getNotFoundError() {
    var message = MessageUtil.getMessage("error.entity.not.found");
    throw new EntityNotFoundException(message);
  }

  public String getLocalizedMessage() {
    return MessageUtil.getMessage("info.localized.message");
  }
}

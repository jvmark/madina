package com.duitang.madina.framework.context.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author mark
 * @since 2016-10-10 16:40.
 */
@Component
public class ContextHolder implements ApplicationContextAware {

  private static ApplicationContext context;

  public static ApplicationContext getCtx() {
    return context;
  }

  public static Object obtainBean(String name) {
    return getCtx().getBean(name);
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext)
      throws BeansException {
    context = applicationContext;
  }
}

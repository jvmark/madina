package com.duitang.madina.framework.context.config;

import com.duitang.infrastructure.utils.SystemUtil;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

/**
 * @author mark
 * @since 2016-10-10 16:45.
 */
@Configuration
public class PropertyConfig {

  @Bean
  @Profile("!test")
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();

    // 加载外部配置, 否则使用包内自带的配置
    String confDir = SystemUtil.getConfDir("saturn");

    FileSystemResource fileSystemResource =
        new FileSystemResource(confDir + "/application.properties");
    if (fileSystemResource.isReadable()) {
      pspc.setLocation(fileSystemResource);
    }
    pspc.setIgnoreUnresolvablePlaceholders(true);
    return pspc;
  }
}

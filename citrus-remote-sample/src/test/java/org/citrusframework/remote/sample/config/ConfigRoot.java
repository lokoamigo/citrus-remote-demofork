package org.citrusframework.remote.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Http.class})
public class ConfigRoot {
}

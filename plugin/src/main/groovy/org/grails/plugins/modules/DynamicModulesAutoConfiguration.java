/*
 * Copyright 2022-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.plugins.modules;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import grails.plugins.GrailsPluginManager;
import org.grails.plugins.web.DefaultWebInterfaceManager;
import org.grails.plugins.web.WebInterfaceManager;

/**
 * Auto-configure {@link WebInterfaceManager}.
 *
 * @author Michael Yan
 * @since 1.0
 */
@AutoConfiguration
@AutoConfigureOrder
public class DynamicModulesAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public WebInterfaceManager webInterfaceManager(ObjectProvider<GrailsPluginManager> grailsPluginManager) {
        return new DefaultWebInterfaceManager(grailsPluginManager.getIfAvailable());
    }

}

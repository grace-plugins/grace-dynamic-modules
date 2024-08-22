/*
 * Copyright 2022-2023 the original author or authors.
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
package org.grails.plugins.modules

import grails.plugins.Plugin
import grails.util.GrailsUtil

class DynamicModulesGrailsPlugin extends Plugin {

    def version = '1.0.0-M1'
    def grailsVersion = "2023.0.0 > *"
    def title = 'Grace Dynamic Modules Plugin'
    def author = 'Michael Yan'
    def authorEmail = 'rain@rainboyan.com'
    def description = '''\
Grace Dynamic Modules Plugin offer new ways of creating modular and maintainable Grace applications.
'''
    // URL to the plugin's documentation
    def documentation = "https://github.com/grace-plugins/grace-dynamic-modules"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "Grace Framework", url: "https://github.com/graceframework/" ]

    // Any additional developers beyond the author specified above.
    def developers = [ [ name: "Michael Yan", email: "rain@rainboyan.com" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "GitHub", url: "https://github.com/grace-plugins/grace-dynamic-modules/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/grace-plugins/grace-dynamic-modules.git" ]

}

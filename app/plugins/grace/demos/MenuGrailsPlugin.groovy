package grace.demos

import grails.plugins.*
import grails.util.Environment
import grails.util.GrailsUtil

class MenuGrailsPlugin extends DynamicPlugin {
    def version = "1.0.0"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = GrailsUtil.getGrailsVersion()

    Closure doWithSpring() { {->
        }
    }

    Closure doWithDynamicModules() { {->
        webSection(key: "topnav", name: "Top Navigation Bar", i18nNameKey: "top.navigation.bar")

        webItem(key: 'about', i18nNameKey: 'menu.about', name: 'About US', section: 'topnav', description: 'This is a description') {
            label(key: 'menu.about')
            link(linkId: "about_link", url: '/about')
        }
        webItem(key: 'product', i18nNameKey: 'menu.product', name: 'Products', section: 'topnav') {
            label(key: 'menu.product')
            link(linkId: 'product_link', url: '/product')
        }
        webItem(key: 'contact', i18nNameKey: 'menu.contact', name: 'Contact', section: 'topnav') {
            link(linkId: 'contact_link', url: '/contact')
        }
        webItem(key: 'help', i18nNameKey: 'menu.help', name: 'Help', section: 'topnav') {
            link(linkId: 'help_link', url: '/help')
        }
        webSection(key: 'application_status', i18nNameKey: 'menu.application_status', name: 'Application Status', location: 'topnav')
            webItem(key: 'env', i18nNameKey: 'menu.application_status.env', name: "Environment: ${Environment.current.name}", section: 'application_status') {
                link(linkId: 'env', url: '#')
            }
            webItem(key: 'profile', i18nNameKey: 'menu.application_status.profile', name: "App profile: ${grailsApplication.config.getProperty('grails.profile')}", section: 'application_status') {
                link(linkId: 'profile', url: '#')
            }
            webItem(key: 'appversion', i18nNameKey: 'menu.application_status.appversion', name: "App version: ${grailsApplication.config.getProperty('info.app.version')}", section: 'application_status') {
                link(linkId: 'appversion', url: '#')
            }
            webItem(key: 'grailsversion', i18nNameKey: 'menu.application_status.grailsversion', name: "Grails version: ${grailsApplication.config.getProperty('info.app.grailsVersion')}", section: 'application_status') {
                link(linkId: 'grailsversion', url: '#')
            }
            webItem(key: 'groovyversion', i18nNameKey: 'menu.application_status.groovyversion', name: "Groovy version: ${GroovySystem.getVersion()}", section: 'application_status') {
                link(linkId: 'groovyversion', url: '#')
            }
            webItem(key: 'javaversion', i18nNameKey: 'menu.application_status.javaversion', name: "JVM version: ${System.getProperty('java.version')}", section: 'application_status') {
                link(linkId: 'javaversion', url: '#')
            }
            webItem(key: 'reloadingenabled', i18nNameKey: 'menu.application_status.reloadingenabled', name: "Reloading active: ${Environment.reloadingAgentEnabled}", section: 'application_status') {
                link(linkId: 'reloadingenabled', url: '#')
            }
    }}
}

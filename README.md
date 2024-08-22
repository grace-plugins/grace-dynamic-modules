[![Main branch build status](https://github.com/grace-plugins/grace-dynamic-modules/workflows/Grace%20CI/badge.svg?style=flat)](https://github.com/grace-plugins/grace-dynamic-modules/actions?query=workflow%3A%Grace+CI%22)
[![Apache 2.0 license](https://img.shields.io/badge/License-APACHE%202.0-green.svg?logo=APACHE&style=flat)](https://opensource.org/licenses/Apache-2.0)
[![Latest version on Maven Central](https://img.shields.io/maven-central/v/org.graceframework.plugins/admin.svg?label=Maven%20Central&logo=apache-maven&style=flat)](https://search.maven.org/search?q=g:org.graceframework.plugins)
[![Grace on X](https://img.shields.io/twitter/follow/graceframework?style=social)](https://twitter.com/graceframework)

# Grace Dynamic Modules Plugin

Grace Dynamic Modules Plugin (GDMP) offer new ways of creating modular and maintainable Grace applications.

A Grace plugin can implement one or more plugin modules to develop and extend Grace applications.
We can use Dynamic Modules to maximize the use of Grace plugins and create an open, shared, and reusable plugin market.

## Grace Version

- Grace **2023.0.0**

## Usage

### Add `dynamic-modules` plugin

Add `dynamic-modules` plugin to your `build.gradle`,

```gradle

apply plugin: "org.graceframework.grace-gsp"

repositories {
    mavenCentral()
    maven {
        url "https://s01.oss.sonatype.org/content/repositories/snapshots/"
        mavenContent {
            snapshotsOnly()
        }
    }
}

dependencies {
    implementation "org.graceframework:grace-plugin-api"
    implementation "org.graceframework.plugins:dynamic-modules"
    // Use dynamic-modules with admin plugin
    implementation "org.graceframework.plugins:admin:$adminVersion"
}

```

## Development

### Build from source

```
git clone https://github.com/grace-plugins/grace-dynamic-modules.git
cd grace-dynamic-modules
./gradlew publishToMavenLocal
```

## What's New

### 1.0.0-SNAPSHOT

* Upgrade to Grace 2023.0.0
* Upgrade to Groovy 4.0.22


## Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Admin Plugin](https://github.com/grace-plugins/grace-admin)
- [Grace Dynamic Modules Plugin](https://github.com/grace-plugins/grace-dynamic-modules)

# Change Log

All notable changes to this template will be documented in this file.

## [1.32.0] 12/11/2024

* Update to kotlin 2.1.0
* Update to kslides-core 0.24.0
* Removed transitive gradle dependencies with api instead of implementation

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '2.1.0'` in `plugins{}`

### _gradle.properties_
* `kslides_version=0.24.0`
* 
## [1.31.0] 11/01/2024

* Update to kotlin 2.0.0
* Update to kslides-core 0.22.0
* Update to srcref 1.6.0

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '2.0.0'` in `plugins{}`

### _gradle.properties_
* `kslides_version=0.22.0`
* `srcref_version=1.6.0`

### _docs_

* Replace the `docs/revealjs` dir with the contents from this release


## [1.30.0] 11/01/2023

* Update to kotlin 1.9.10
* Update to kslides-core 0.21.0
* Update to srcref 1.2.0

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.9.20'` in `plugins{}`

### _gradle.properties_
* `kslides_version=0.21.0`
* `srcref_version=1.2.0`

## [1.20.0] 10/30/2023

* Update to kotlin 1.9.10
* Update to revealjs 5.0.0
* Update to CopyCode 1.1.2
* Update to kslides-core 0.20.1
* Add support for revealjs Scroll View

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.9.10'` in `plugins{}`
* `id 'com.github.ben-manes.versions' version '0.49.0'` in `plugins{}`

### _docs_

* Replace the `docs/revealjs` dir with the contents from this release

### _gradle.properties_
* Update to newest grade.properties


## [1.10.0] 05/23/2023

Update jars

### _docs_

* Replace the `docs/revealjs` dir with the contents from this release

### _gradle.properties_
* `css_version=1.0.0-pre.554`
* `kslides_version=0.10.0`

## [1.9.0] 05/16/2023

Update jars

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.9.10'` in `plugins{}`

### _gradle.properties_
* `css_version=1.0.0-pre.550`
* `kslides_version=0.18.2`
* `ktor_version=2.3.0`
* `srcref_version=1.0.25`


## [1.8.0] 04/10/2023

Update jars

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.8.20'` in `plugins{}`

### _gradle.properties_
* `css_version=1.0.0-pre.532`
* `kslides_version=0.18.1`
* `ktor_version=2.2.4`
* `srcref_version=1.0.23`

## [1.7.0] 12/31/2022

Update jars

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.8.0'` in `plugins{}`

### _gradle.properties_
* `css_version=1.0.0-pre.467`
* `kslides_version=0.17.0`
* `ktor_version=2.2.1`
* `srcref_version=1.0.18`


## [1.6.0] 12/4/2022

Update jars

### _docs_

* Replace the `docs/revealjs` dir with the contents from this release

### _gradle.properties_

* `css_version=1.0.0-pre.454`
* `kslides_version=0.16.0`


## [1.5.5] 12/3/2022

Update jars

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.7.21'` in `plugins{}`
* `id 'com.github.ben-manes.versions' version '0.44.0'` in `plugins{}`

### _gradle.properties_

* `css_version=1.0.0-pre.453`
* `kslides_version=0.15.3`
* `ktor_version=2.1.3`
* `srcref_version=1.0.17`

## [1.5.4] 10/17/2022

Update jars

### _build.gradle_

* `id 'com.github.ben-manes.versions' version '0.43.0'` in `plugins{}`

### _gradle.properties_

* `css_version=1.0.0-pre.408`
* `kslides_version=0.15.2`
* `srcref_version=1.0.14`


## [1.5.3] 10/3/2022

Update jars

### _gradle.properties_

* `srcref_version=1.0.12`


## [1.5.2] 10/2/2022

Update jars

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.7.20'` in `plugins{}`

### _gradle.properties_

* `css_version=1.0.0-pre.397`
* `kslides_version=0.15.1`
* `ktor_version=2.1.2`
* `plotly_version=0.5.0`
* `srcref_version=1.0.10`

## [1.5.1] 9/19/2022

Change `diagram.content` to `diagram.source`.

### _gradle.properties_

* `css_version=1.0.0-pre.388`
* `kslides_version=0.14.1`

## [1.5.0] 9/18/2022

Added support for Kroki diagrams and removed iframes-based Mermaid diagrams.

### _gradle.properties_

* `css_version=1.0.0-pre.387`
* `kslides_version=0.14.0`


## [1.4.4] 9/10/2022

Converted Mermaid diagrams to use iframes.

### _gradle.properties_

* `css_version=1.0.0-pre.383`
* `kslides_version=0.13.3`
* `ktor_version=2.1.1`


## [1.4.3] 8/30/2022

Added support for topLeftSvgClass, topLeftSvgStyle, topRightSvgClass, and topRightSvgStyle.

### _gradle.properties_

* `css_version=1.0.0-pre.381`
* `kslides_version=0.13.2`


## [1.4.2] 8/30/2022

### _gradle.properties_

Added support for topLeftSvgSrc and topRightSvgSrc.

* `css_version=1.0.0-pre.380`
* `kslides_version=0.13.1`
* `ktor_version=2.1.0`
* `srcref_version=1.0.9`


## [1.4.1] 8/10/2022

### _gradle.properties_

* `kslides_version=0.12.2`


## [1.4.0] 8/9/2022

Added support for [Mermaid](https://mermaid-js.github.io/) diagrams.

### _build.gradle_

* plotly support is now in a separate module: `com.github.kslides.kslides:kslides-plotly`

### _gradle.properties_

* `kslides_version=0.12.0`
* `plotly_version=0.5.3-dev-1`
* `css_version=1.0.0-pre.365`


## [1.3.0] 7/16/2022

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.7.10'` in `plugins{}`

### _gradle.properties_

* `kslides_version=0.11.0`
* `ktor_version=2.0.3`
* `css_version=1.0.0-pre.357`


## [1.2.5] 6/11/2022

### _build.gradle_

* `id 'org.jetbrains.kotlin.jvm' version '1.7.0'` in `plugins{}`

### _gradle.properties_

* `css_version=1.0.0-pre.343`
* `kslides_version=0.10.6`
* `srcref_version=1.0.8`
* `utils_version=1.27.0`


## [1.2.4] 6/5/2022

### _gradle.properties_

* `css_version=1.0.0-pre.341`
* `kslides_version=0.10.4`
* `ktor_version=2.0.2`
* `logging_version=2.1.23`
* `srcref_version=1.0.7`
* `utils_version=1.26.0`


## [1.2.3] 5/25/2022

Added a `/favicon.ico` file.

* Add `docs/favicon.ico`
* Add `src/main/resources/public/favicon.ico` and run `./gradlew clean build`

### _gradle.properties_

* `kslides_version=0.10.3`


## [1.2.2] 5/25/2022

Added support for including [srcref](https://www.srcref.com) GitHub links.

### _gradle.properties_

* `kslides_version=0.10.2`
* `css_version=1.0.0-pre.340`
* `plotly_version=0.5.2-dev-2`
* Add `srcref_version=1.0.3`

### _build.gradle_

* Add `implementation "com.github.pambrose:srcref:$srcref_version"` to `dependencies{}`


## [1.2.1] 5/19/2022

Added support for specifying playground css, which is useful for increasing
the playground font size, as seen [here](https://kslides.com/#/playground).
Playground css values are specified in any _PlaygroundConfig_ `css{}` block
using the CSS DSL or via css strings.

### _gradle.properties_

* `kslides_version=0.10.1`
* `css_version=1.0.0-pre.338`


## [1.2.0] 5/18/2022

Added support for plotly-kt ([Example](https://kslides.com/#/plotly))

### _gradle.properties_

* Add `plotly_version=0.5.1-dev-4`

### _build.gradle_

* Add `maven { url = 'https://repo.kotlin.link' }` to `repositories{}`
* Add `implementation "space.kscience:plotlykt-core:$plotly_version"` to `dependencies{}`
* `kslides_version=0.10.0`
* `jvmTarget = '11'` in _compileKotlin.kotlinOptions_ and _compileTestKotlin.kotlinOptions_


## [1.1.5] 5/14/2022

### _gradle.properties_

* `kslides_version=0.9.0` 
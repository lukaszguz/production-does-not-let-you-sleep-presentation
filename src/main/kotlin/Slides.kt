import com.kslides.Effect
import com.kslides.PresentationTheme
import com.kslides.Speed
import com.kslides.Transition
import com.kslides.fragment
import com.kslides.kslides
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.h2
import kotlinx.html.h3
import kotlinx.html.h4
import kotlinx.html.img
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.small
import kotlinx.html.style
import kotlinx.html.ul

fun main() {

    val slides = "src/main/kotlin/Slides.kt"

    val imgDir = "images-blur"

    kslides {
        output {
            // Write the presentation's html files to /docs for GitHub Pages or netlify.com
            enableFileSystem = true

            // Run locally or on Heroku
            enableHttp = true
        }

        // CSS values assigned here are applied to all the presentations
        css +=
            """
      #githubCorner path {
        fill: #258BD2;
      }
      """

        presentationConfig {
            history = true
            transition = Transition.SLIDE
            transitionSpeed = Speed.SLOW

            enableMenu = true
            theme = PresentationTheme.MOON
            slideNumber = "c/t"
            enableSpeakerNotes = true

            menuConfig {
                numbers = true
            }

            copyCodeConfig {
                timeout = 2000
                copy = "Copy"
                copied = "Copied!"
            }

            slideConfig {
                // Assign slide config defaults for all presentations
                // backgroundColor = "blue"
            }
        }

        presentation {
            css +=
                """
        #ghsrc {
          font-size: 30px;
          text-decoration: underline;
        }
        img[alt=revealjs-image] {
          width: 1000px;
        }
        .scrollable {
          bottom: 0px;
          overflow-y: auto  !important;
          overflow-x: hidden !important;
        }
        .background-wheat {
            background: wheat;
        }
        img[alt=change-postgres-cluster] {
            max-width: 70%;
        }
        .reveal-viewport {
            background-image: url(${imgDir}/logos/xtb_logo.png);
            background-size: 8%, 4%;
            background-repeat: no-repeat;
            background-position: 97% 3%, 88% 2%;
        }
        """

            presentationConfig {
                transition = Transition.CONCAVE

                slideConfig {
                    // Assign slide config defaults for all slides in this presentation
                    //backgroundColor = "red"
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h2 { +"Production doesn't let you sleep, a quarter of the fight for a better tomorrow" }
                    }
                }

                dslSlide {
                    content {
                        h2 { +"Context" }
                    }
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h1 { +"Adventory has problems!" }
                    }
                }
                dslSlide {
                    autoAnimate = true
                    content {
                        h2 { +"Ring! Ring!" }
                    }
                }
                dslSlide {
                    autoAnimate = true
                    content {
                        h2 { +"Ring! Ring!" }
                        img {
                            src = "$imgDir/adventory-call.png"
                        }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"Kowalski analysis!" }
                        img {
                            src = "${imgDir}/kowalski_analysis.jpg"
                        }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"Memory App" }
                        img {
                            src = "${imgDir}/adventory-memory-before.png"
                        }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"JVM Heap" }
                        img {
                            src = "${imgDir}/adventory-heap_before.png"
                        }
                    }
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h1 { +"Off-heap is a problem" }
                    }
                }
                dslSlide {
                    classes = "scrollable"
                    content {
                        div {
                            img {
                                src = "${imgDir}/jxray-offheap-2023-02-12.png"
                                alt = "jxray-offheap-2023-02-12"
                            }
                        }
                    }
                }
                dslSlide {
                    content {
                        h1 { +"What is DirectByteBuffer?" }
                    }
                }
                dslSlide {
                    content {
                        h3 { +"DirectByteBuffer" }
                        p { +"""The contents of direct buffers may reside outside of the normal garbage-collected heap, and so their impact upon the memory footprint of an application might not be obvious. It is therefore recommended that direct buffers be allocated primarily for large, long-lived buffers that are subject to the underlying system's native I/O operations.""" }
                        p {
                            small { +"~https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/ByteBuffer.html" }
                        }
                    }
                }
                dslSlide {
                    classes = "scrollable"
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        div {
                            img {
                                src = "${imgDir}/jxray-offheap-2023-02-12.png"
                                alt = "jxray-offheap-2023-02-12"
                            }
                        }
                    }
                }
                dslSlide {
                    classes = "scrollable"
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        div {
                            img {
                                src = "${imgDir}/jxray-offheap-2023-02-12-marked.png"
                                alt = "jxray-offheap-2023-02-12"
                                /**
                                 * Explanation
                                 * Off-heap memory used by java.nio.DirectByteBuffers.  Size 941.4%  ( 898,569Kb )
                                 * Percentage is a ration of [8. Off-heap memory used by java.nio.DirectByteBuffers (total size column)] divided by [1. Top-Level Stats (total column)]
                                 */
                            }
                        }
                    }
                }
                dslSlide {
                    classes = "scrollable"
                    autoAnimate = true
                    content {
                        div {
                            img {
                                src = "${imgDir}/listOfDirectBuffers.png"
                            }
                        }
                    }
                }
                dslSlide {
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        img {
                            src = "${imgDir}/incoming-reference-to_directbuffer.png"
                        }
                    }
                }
                dslSlide {
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        img {
                            src = "${imgDir}/incoming-reference-to_directbuffer-marked.png"
                        }
                    }
                }
                dslSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        img {
                            src = "${imgDir}/thread_details.png"
                        }
                    }
                }
                markdownSlide {
                    style = "width: 1000px;"
                    content {
                        """
            ## What are the threads called?
            ```java
            new DefaultConnectingIOReactor(
                IOReactorConfig.custom()
                    .setIoThreadCount(elasticSearchProperties.getIoThreadCount())
                    .build()
                }
            )
            ```
            """
                    }
                }

                markdownSlide {
                    style = "width: 1000px;"
                    content {
                        """
            ## Answer
            ```java [|5]
            static class DefaultThreadFactory implements ThreadFactory {
                //...
                @Override
                public Thread newThread(final Runnable r) {
                    return new Thread(r, "I/O dispatcher " +
                    COUNT.getAndIncrement());
                }
            }
            ```
            """
                    }
                }

                markdownSlide {
                    style = "width: 1100px;"
                    content {
                        """
            ## Our name
            ```java [|5-11|9|3]
            new DefaultConnectingIOReactor(
                IOReactorConfig.custom()
                    .setIoThreadCount(elasticSearchProperties.getIoThreadCount())
                    .build(),
                new ThreadFactory() {
                    private final static AtomicLong COUNT = new AtomicLong(1);
                    @Override
                    public Thread newThread(@NotNull Runnable r) {
                        return new Thread(r, "I/O elasticsearch " +
                        COUNT.getAndIncrement());
                    }
                }
            )
            ```
            """
                    }
                }

                dslSlide {
                    content {
                        h2 { +"Result" }
                        img {
                            src = "${imgDir}/adventory-memory-after.png"
                            alt = "adventory-memory-before"
                        }
                    }
                }
            }


            // Aggregator
            verticalSlides {
                dslSlide {
                    content {
                        h1 { +"Aggregator has problems!" }
                    }
                }
                dslSlide {
                    autoAnimate = true
                    content {
                        h2 { +"Ring! Ring!" }
                    }
                }
                dslSlide {
                    autoAnimate = true
                    content {
                        h2 { +"Ring! Ring! Ring! Ring! Ring! ..." }
                        img {
                            src = "${imgDir}/aggregator/aggregator-pagerduty-report.png"
                        }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"Kowalski analysis!" }
                        img {
                            src = "${imgDir}/kowalski_analysis.jpg"
                        }
                    }
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h2 { +"Lots of app restarts" }
                        img {
                            src = "${imgDir}/aggregator/aggregator-restart-alert.png"
                        }
                    }
                }
                dslSlide {
                    content {
                        h3 { +"Firstly. Where are the metrics?" }
                        div {
                            img {
                                src = "${imgDir}/aggregator/aggregator-missing-metrics.png"
                            }
                        }
                    }
                }
                markdownSlide {
                    style = "width: 1200px;"
                    content {
                        """
            ```kotlin
            @PostConstruct
            fun registerMetrics() {
                registerGauge("stats.all", EntityGroupsStats::numberOfEntityGroups)
                registerGauge("stats.active", EntityGroupsStats::numberOfActiveEntityGroups)
                registerGauge("stats.units.active", EntityGroupsStats::numberOfActiveUnits)
            }
            ```
            """
                    }
                }

                markdownSlide {
                    content {
                        """
            ```sql
            SELECT
                STATUS,
                COUNT(*) AS NUMBER_OF_ENTITY_GROUPS,
                SUM(UNITS_COUNT) AS NUMBER_OF_UNITS
            FROM ENTITY_GROUPS GROUP BY STATUS
            ```
            """
                    }
                }

                dslSlide {
                    content {
                        h3 { +"The database is busy and we are doing 'metrics'" }
                        div {
                            img {
                                src = "${imgDir}/aggregator/postgres-timeouts.png"
                            }
                        }
                    }
                }

                dslSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        h3 { +"Solution" }
                        p {
                            +"""Deleting these metrics unblocked the metrics publishing thread.
                  """.trimMargin()
                        }
                    }
                }

                dslSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        h3 { +"Solution" }
                        p {
                            +"""Deleting these metrics unblocked the metrics publishing thread.
                  """.trimMargin()
                        }
                        h4 { +"Metrics came back!" }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"The service did not respond to health checks" }
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-34-1.svg"
                            }
                        }
//            diagram("mermaid") {
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {
//                    "sequenceDiagram": { "curve": "linear" },
//                    'themeVariables': {
//                        'signalTextColor': '#F0F8FF',
//                        'signalColor': '#F0F8FF'
//                    }
//                }}%%
//                sequenceDiagram
//                  Editor-->>Aggregator: Create a new entity
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v2
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v3
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v4
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: ...
//                  activate Aggregator
//                  deactivate Aggregator
//                  Editor->>Aggregator: Fetch statistics
//                  activate Aggregator
//                  Aggregator->>Editor: Return statistics
//                  deactivate Aggregator
//                """
//            }
                    }
                }

                dslSlide {
                    classes = "scrollable"
                    content {
                        h2 { +"Response time" }
                        div {
                            img {
                                src = "${imgDir}/aggregator/aggregator-long-time-response.png"
                            }
                        }
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-36-1.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {}}%%
//                gantt
//                    dateFormat ss
//                    axisFormat %Ss
//                    title Undertow Utilization
//                    section Thread_1
//                        Update Entity Request : 00, 55s
//                    section Thread_2
//                        Create Entity Request : 05, 45s
//                    section Thread_3
//                        Fetch Statistics: 03, 60s
//                    section Thread_4
//                        Update Entity Request: 10, 45s
//                    section Thread_n
//                        Blocking Task...: 00, 60s
//                """
//            }

                        div {
                            img {
                                src = "diagrams/slide-36-2.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: { }}%%
//                gantt
//                    dateFormat mm
//                    axisFormat %S
//                    title Undertow Queue
//                    section Queue
//                        Update Entity      :  t1, 0, 10s
//                        HealthCheck        :  t2, after t1, 10s
//                        Create Entity      :  t3, after t2, 10s
//                        Fetch Statistics   :  t4, after t3, 10s
//                """
//            }
                    }
                }
                dslSlide {
                    content {
                        h2 { +"Bulkhead Pattern" }
                        img {
                            src = "${imgDir}/aggregator/bulkhead/bulkhead-ship.png"
                            alt =
                                "https://aws.amazon.com/blogs/containers/building-a-fault-tolerant-architecture-with-a-bulkhead-pattern-on-aws-app-mesh/"
                        }
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-34-1.svg"
                            }
                        }
//            diagram("mermaid") {
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {
//                    "sequenceDiagram": { "curve": "linear" },
//                    'themeVariables': {
//                        'signalTextColor': '#F0F8FF',
//                        'signalColor': '#F0F8FF'
//                    }
//                }}%%
//                sequenceDiagram
//                  Editor-->>Aggregator: Create a new entity
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v2
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v3
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: Update the entity v4
//                  activate Aggregator
//                  deactivate Aggregator
//                  Budgeteer-->>Aggregator: ...
//                  activate Aggregator
//                  deactivate Aggregator
//                  Editor->>Aggregator: Fetch statistics
//                  activate Aggregator
//                  Aggregator->>Editor: Return statistics
//                  deactivate Aggregator
//                """
//            }
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-39-1.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {}}%%
//                gantt
//                    dateFormat ss
//                    axisFormat %Ss
//                    title creation-events-handling thread pool
//                    section Thread_1
//                        Update Creation Request : 00, 15s
//                    section Thread_2
//                        Create Creation Request : 03, 7s
//                    section Thread_3
//                        Update Creation Request : 00, 5s
//                    section Thread_4
//                        Update Creation Request : 03, 7s
//                """
//            }

                        div {
                            img {
                                src = "diagrams/slide-39-2.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: { }}%%
//                gantt
//                    dateFormat ss
//                    axisFormat %Ss
//                    title campaign-events-handling thread pool
//                    section Thread_1
//                        Update Campaign Request : 00, 15s
//                    section Thread_2
//                        Create Campaign Request : 01, 10s
//                    section Thread_3
//                        Create Campaign Request : 00, 10s
//                    section Thread_4
//                        Create Campaign Request : 03, 7s
//                """
//            }

                        div {
                            img {
                                src = "diagrams/slide-39-3.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: { }}%%
//                gantt
//                    dateFormat S
//                    axisFormat %Lms
//                    title Undertow thread pool
//                    section Thread_1
//                        Healthcheck Request : 00, 10ms
//                    section Thread_2
//                        Dispatch Create Campaign Request : 0, 9ms
//                    section Thread_3
//                        Dispatch Update Creation Request : 0, 10ms
//                    section Thread_n
//                        Healthcheck Request : 0, 10ms
//                """
//            }
                    }
                }
                dslSlide {
                    content {
                        img {
                            src = "${imgDir}/aggregator/bulkhead/thread-pools-utilization.png"
                        }
                    }
                }
                markdownSlide {
                    content {
                        """
                           ## What do we have? 📝
                           * We see metrics ${fragment(Effect.FADE_LEFT)}
                           * The application doesn't restart ${fragment(Effect.FADE_LEFT)}
                           * We have a bulkhead pattern and we can control the number of database connections for thread pools ${
                            fragment(
                                Effect.FADE_LEFT
                            )
                        }
                           * We added retention to our tables ${fragment(Effect.FADE_LEFT)}
                           * We have changed our approach from find-and-save an entity to upsert row ${fragment(Effect.FADE_LEFT)}
                           * The application still doesn't work ${fragment(Effect.FADE_LEFT)}
                        """
                    }
                }
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                            # The database is a problem
                        """
                    }
                }
                markdownSlide {
                    content {
                        """
                            ## Time to change db server!
                        """
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "${imgDir}/aggregator/change-postgres-cluster.png"
                                alt = "change-postgres-cluster"
                            }
                        }
                    }
                }
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                           ## And ...
                        """
                    }
                }
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                           ## And ...
                           # Nothing has changed 😂
                        """
                    }
                }

                dslSlide {
                    content {
                        img {
                            src = "${imgDir}/aggregator/aggregator-metric-before.png"
                            alt = "aggregator-metric-before"
                        }
                    }
                }


                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                            # Why?
                        """
                    }
                }
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                            ## Updating the index in random places is really expensive for db.
                        """
                    }
                }
            }
            verticalSlides {
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                            ## Solution
                        """
                    }
                }
                markdownSlide {
                    autoAnimate = true
                    slideConfig {
                        transition = Transition.NONE
                    }
                    content {
                        """
                            ## Quasi-CQRS
                        """
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-52-1.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {}}%%
//                stateDiagram-v2
//                    state How_the_event_was_handled? {
//                        [*] --> insert/update_entity_table : Handle Event
//                    }
//                """
//            }
                    }
                }
                dslSlide {
                    content {
                        div {
                            img {
                                src = "diagrams/slide-54-1.svg"
                                style = "background: wheat;"
                            }
                        }
//            diagram("mermaid") {
//              style = "background: wheat;"
//              outputType = DiagramOutputType.SVG
//              source =
//                """
//                %%{init: {}}%%
//                stateDiagram-v2
//                    state quasi_CQRS_approach {
//                        [*] --> insert_to_write_model_table : Handle Event
//                        --
//                        state Cron {
//                            [*] --> application_of_changes_on_entity_rows : fetch_all_rows_from_write_model
//                        }
//                    }
//               """
//            }
                    }
                }
            }

            verticalSlides {
                markdownSlide {
                    content {
                        """
                        ## Takeaways
                        - If something doesn't work, it won't fix itself. Fix it or find someone to fix it.${
                            fragment(
                                Effect.FADE_LEFT
                            )
                        }
                           - Our team has changed the way we respond to false positive alerts ${fragment(Effect.FADE_LEFT)}
                        - Many alerts are created wishfully ${fragment(Effect.FADE_LEFT)}
                        """
                    }
                }

                markdownSlide {
                    content {
                        """
                        ## Takeaways ...
                        - It's not worth maintaining alerts that calls in the middle of the night and you can do anything with them ${
                            fragment(
                                Effect.FADE_LEFT
                            )
                        }
                        - A permanent code review partner guarantees optimal speed ${fragment(Effect.FADE_LEFT)}
                        - Without metrics and charts, it is impossible to convince business people ${fragment(Effect.FADE_LEFT)}
                        """
                    }
                }
            }

            verticalSlides {
                dslSlide {
                    content {
                        h2 { +"References" }
                        p {
                            ul {
                                style = "font-size: 25px;"
                                li { a(href = "https://jxray.com") { +"JxRay" } }
                                li { a(href = "https://eclipse.dev/mat") { +"Memory Analyzer (MAT)" } }
                                li { a(href = "https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/nio/ByteBuffer.html") { +"ByteBuffer" } }
                                li { a(href = "https://www.mastertheboss.com/java/troubleshooting-outofmemoryerror-direct-buffer-memory") { +"Troubleshooting OutOfMemoryError: Direct buffer memory" } }
                                li { a(href = "https://dzone.com/articles/troubleshooting-problems-with-native-off-heap-memo") { +"Troubleshooting Problems With Native (Off-Heap) Memory in Java Applications" } }
                                li { a(href = "https://innovation.ebayinc.com/tech/engineering/sre-case-study-triage-a-non-heap-jvm-out-of-memory-issue") { +"SRE Case Study: Triaging a Non-Heap JVM Out of Memory Issue" } }
                                li { a(href = "https://resilience4j.readme.io/docs/bulkhead") { +"Bulkhead" } }
                                li { a(href = "https://www.postgresqltutorial.com/postgresql-tutorial/postgresql-upsert") { +"PostgreSQL UPSERT using INSERT ON CONFLICT Statement" } }
                                li { a(href = "https://martinfowler.com/bliki/CQRS.html") { +"CQRS" } }
                            }
                        }
                    }
                }
                dslSlide {
                  content {
                    h1 { +"Thank you!" }
                    div {
                      img {
                        src = "${imgDir}/presentation-qr-code.png"
                        alt = "presentation-qrcode"
                      }
                    }
                  }
                }
            }
        }
    }
}

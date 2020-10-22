# EmbedSampleApplication

This application breaks when embed is > 1.2.16.

To reproduce,

1. install `base` and `moduled`

    ```
    ./gradlew base:install
    ./gradlew moduled:install
    ```

    This will install the `base` and `moduled` modules into your local maven repository.

2. Run the `app` application on your device.

3. Tap the `Launch Test` button

4. Tap the `Break Me` button.

5. Note that the text below the `Break Me` button changes to `D STRINGB STRINGC STRING`.

6. Change the version of the the `embed` plugin to the latest (1.2.18) in the project build.gradle.

7. re-install moduled

    ```
    ./gradlew moduled:install
    ```

8. Run the application, note that the application crashes when the `Break Me` button is tapped.

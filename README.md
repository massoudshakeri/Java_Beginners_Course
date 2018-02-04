# Advanced-Java
Collection of Examples &amp; Exercises for Advanced Java online course from Amouzesh.online

The included Gradle build file lists all the required dependencies.

The data access sections use a MySQL database named `hr` running on localhost,
so the JDBC URL is `jdbc:mysql://localhost:3306/hr`. The assumed username is
 `jpa` and the password is `java`. A Groovy script called
 `database.initialize_database` is provided to reset the database if necessary.
 The Gradle build file uses the `application` plugin where that script is the
 main class, so running `gradlew run` will execute it.

Executing `gradle build` should compile everything, run all the tests,
and produce an HTML test report in the `build/reports/tests/index.html`
location.

Please let me know if there are any questions or problems.

Massoud Shakeri

Winter 2018

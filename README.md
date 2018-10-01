# sbt-scalate-precompiler-example

A simple example that shows the usage of
[sbt-scalate-precompiler](https://github.com/scalate/sbt-scalate-precompiler)
with SBT 0.13.x and 1.x:

* Run `sbt clean compile`.
* Directory `target/scala-2.12/src_managed` will be created, containing Scala
  source files for Scalate templates in directory `src/main/scalate`.
* The generated Scala source files will be compiled to
  `target/scala-2.12/classes`.

To switch between SBT 0.13.x and 1.x,
see comments at these files:

* `project/build.properties`
* `project/plugins.sbt`
* `build.sbt`

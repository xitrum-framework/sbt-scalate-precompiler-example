organization := "tv.cntt"
name         := "scalate-precompiler-example"
version      := "1.0-SNAPSHOT"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
javacOptions  ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies += "org.scalatra.scalate" %% "scalate-core" % "1.9.0"

// For SBT 1.x
import org.fusesource.scalate.ScalatePlugin._

scalateSettings
ScalateKeys.scalateTemplateConfig in Compile := Seq(
  TemplateConfig(
    (sourceDirectory in Compile).value / "scalate",
    Seq(),
    Seq()
  )
)

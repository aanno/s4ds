name := """ghub-display"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(SbtWeb)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.webjars.npm" % "requirejs" % "2.3.6",
  "org.webjars.npm" % "jquery" % "3.3.1",
  "org.webjars.npm" % "underscore" % "1.9.1",
  "org.webjars.npm" % "nvd3" % "1.8.6",
  "org.webjars.npm" % "d3" % "3.5.17",
  "org.webjars.npm" % "bootstrap" % "4.3.1"
  )

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

pipelineStages := Seq(rjs)

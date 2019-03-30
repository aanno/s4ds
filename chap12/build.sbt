
name := "spam_filter"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-mllib" % "2.4.0" % "provided",
  "org.scalanlp" %% "breeze" % "1.0-RC2",
  "org.scalanlp" %% "breeze-natives" % "1.0-RC2",
  "org.scalanlp" %% "breeze-viz" % "1.0-RC2"
)

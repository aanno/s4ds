
scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.3.0",
  "org.slf4j" % "slf4j-nop" % "1.7.26",
  "mysql" % "mysql-connector-java" % "8.0.15",
  "com.github.tototoshi" %% "scala-csv" % "1.3.5"
)


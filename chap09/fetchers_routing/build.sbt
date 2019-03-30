name := "S4DS"

organization := "s4ds"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.8"

//resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.1",
  "com.typesafe.akka" %% "akka-actor" % "2.5.21"
)

scalacOptions ++= Seq("-feature", "-language:postfixOps", "-deprecation")


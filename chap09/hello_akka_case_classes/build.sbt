
scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.1",
  "com.typesafe.akka" %% "akka-actor" % "2.5.21"
)

scalacOptions ++= Seq("-feature", "-language:postfixOps", "-deprecation")

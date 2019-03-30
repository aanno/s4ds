scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalaj" %% "scalaj-http" % "2.4.1",
  "org.json4s" %% "json4s-native" % "3.6.5",
  "org.mongodb" %% "casbah" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.7.26"
)

scalacOptions ++= Seq("-feature", "-language:postfixOps", "-deprecation")


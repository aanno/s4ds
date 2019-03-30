name := "Scala-for-Data-Science"

version := "0.1"

scalaVersion := "2.12.8"

organization := "com.packt"

lazy val root = project.in(file("."))
  .aggregate(chap02)
  .aggregate(chap03)
  .aggregate(chap04)
  .aggregate(chap05)
  .aggregate(chap06)
  .aggregate(chap07)
  .aggregate(chap08)
  // .aggregate(chap09)
  .aggregate(chap10)
  .aggregate(chap11)
  .aggregate(chap12)
  .aggregate(chap13)
  .aggregate(chap14)

lazy val chap02 = project.in( file("chap02"))
lazy val chap03 = project.in( file("chap03"))
lazy val chap04 = project.in( file("chap04"))
lazy val chap05 = project.in( file("chap05"))
lazy val chap06 = project.in( file("chap06"))
lazy val chap07 = project.in( file("chap07"))
lazy val chap08 = project.in( file("chap08"))
// lazy val chap09 = project.in( file("chap09"))
lazy val chap10 = project.in( file("chap10"))
lazy val chap11 = project.in( file("chap11"))
lazy val chap12 = project.in( file("chap12"))
lazy val chap13 = project.in( file("chap13"))
lazy val chap14 = project.in( file("chap14"))

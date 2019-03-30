organization := "com.packt"

name := "scala-datascience-akka"

// lazy val root = RootProject(file(".."))
lazy val akkaRoot = project.in(file("."))
  .aggregate(all_workers)
  .aggregate(fetchers_alone)
  .aggregate(fetchers_routing)
  .aggregate(ghub_crawler)
  .aggregate(ghub_crawler_fault_tolerant)
  .aggregate(hello_akka)
  .aggregate(hello_akka_case_classes)

lazy val all_workers = project.in( file("all_workers"))
lazy val fetchers_alone = project.in( file("fetchers_alone"))
lazy val fetchers_routing = project.in( file("fetchers_routing"))
lazy val ghub_crawler = project.in( file("ghub_crawler"))
lazy val ghub_crawler_fault_tolerant = project.in( file("ghub_crawler_fault_tolerant"))
lazy val hello_akka = project.in( file("hello_akka"))
lazy val hello_akka_case_classes = project.in( file("hello_akka_case_classes"))

scalaVersion := "2.12.8"

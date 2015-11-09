import play.routes.compiler.InjectedRoutesGenerator

name := """Reminder"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.hibernate" % "hibernate-entitymanager" % "4.1.3.Final",
  "postgresql" % "postgresql" % "9.1-901-1.jdbc4"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, QueryDSLPlugin)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

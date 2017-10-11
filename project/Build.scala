import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.github.gilbertw1"
  val buildVersion      = "0.1.0"
  val buildScalaVersion = "2.12.3"

  val settings = Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion)
}

object Resolvers {
  val typesafeRepo = "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
}

object Dependencies {
  val akkaVersion = "2.5.6"

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.0.10"

  val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.9.6"
  val playJson = "com.typesafe.play" %% "play-json" % "2.6.6"

  val scalatest = "org.scalatest" %% "scalatest" % "3.0.1" % "test"

  val akkaDependencies = Seq(akkaActor, akkaSlf4j, akkaStream, akkaHttp)
  val miscDependencies = Seq(playJson, scalaAsync)
  val testDependencies = Seq(scalatest)

  val allDependencies = akkaDependencies ++ miscDependencies ++ testDependencies
}

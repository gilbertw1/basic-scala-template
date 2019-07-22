import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "com.github.gilbertw1"
  val buildVersion      = "0.1.0"
  val buildScalaVersion = "2.12.8"

  val settings = Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion)
}

object Resolvers {
  val typesafeRepo = "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"
}

object Dependencies {
  val akkaVersion = "2.5.23"

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.1.9"

  val scalaAsync = "org.scala-lang.modules" %% "scala-async" % "0.10.0"
  val playJson = "com.typesafe.play" %% "play-json" % "2.6.10"
  val postgres = "org.postgresql" % "postgresql" % "42.2.6"
  val scalalikeJdbc = "org.scalikejdbc" %% "scalikejdbc" % "3.3.5"
  val playWS = "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.0.6"
  val playWSJson = "com.typesafe.play" %% "play-ws-standalone-json" % "2.0.6"

  val akkaDependencies = Seq(akkaActor, akkaSlf4j, akkaStream)
  val miscDependencies = Seq(playJson, scalaAsync, playWS, playWSJson)

  val allDependencies = akkaDependencies ++ miscDependencies
}

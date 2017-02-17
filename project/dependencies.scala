import sbt._

object Dependencies {
  val jerseyVersion = "1.19"
  val scalatestVersion = "3.0.0"
  val playVersion = "2.4.3"

  val jersey = "com.sun.jersey" % "jersey-core" % jerseyVersion
  val jerseyClient = "com.sun.jersey" % "jersey-client" % jerseyVersion

  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion

  val playJson = "com.typesafe.play" %% "play-json" % playVersion % "test"


  val resttestDependencies = Seq(jersey, jerseyClient, scalatest/*, playJson*/)
}

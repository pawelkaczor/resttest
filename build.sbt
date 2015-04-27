import Dependencies._

name := "resttest"

version := "0.1.0"

scalaVersion := "2.11.5"

resolvers += "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "spray repo" at "http://repo.spray.io/"

libraryDependencies ++= resttestDependencies

dependencyOverrides += "org.slf4j" % "slf4j-api" % "1.7.2"

parallelExecution in Test := false


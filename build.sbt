name := "todoJava"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.1.0"
)

javaOptions in Test += "-Dconfig.file=conf/test.conf"

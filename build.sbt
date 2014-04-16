name := "todoJava"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.1.0"
)

javaOptions in Test += "-Dconfig.file=conf/test.conf"

play.Project.playJavaSettings

name := "todoJava"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.0.0"
)

play.Project.playJavaSettings

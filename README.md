What's new:

- Updated to 2.3.1, there is no play-mongo-jackson-wrapper lib for 2.11 scala (default for play 2.3.1), that's why we manually set scala version to 2.10.0 in build.sbt

First steps with Playframework 2.3.1 (Java) and MongoDb (Jackson)
--------------------------------------------------

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application:
```
sbt run
```

Please report if there is any issue with running this tutorial, thanks!

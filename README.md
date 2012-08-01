First steps with Playframework 2.0 (Java) and MongoDb (Jackson)
--------------------------------------------------

In the official wiki there is a tutorial about how to create a todo
application using Play 2.0 framework with Java, you can find it here http://www.playframework.org/documentation/2.0.2/JavaTodoList 

But it uses an Sql database (H2).

We will try to make it use MongoDb instead.

We will use Jackson library for MongoDb support (https://github.com/vznet/play-mongo-jackson-mapper).

Steps
-----

* Complete the tutorial mentioned before if you didn't already do that (don't forget to add @Entity annotation to your model as it is not mentionned in the tutorial).

* Replace project/Build.scala file by the one from this repo.

* Do "play dependencies" in your console (in the project's root folder)

* Replace next files in your application by files from this repo.

```
app/controllers/Application.java
app/models/Task.java
conf/application.conf
conf/routes
```

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application, if everything works, congratulations, you've done it!

* Have fun!

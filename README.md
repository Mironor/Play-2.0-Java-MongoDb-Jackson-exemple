Update:
- Added tests for Task model

First steps with Playframework 2.2.1 (Java) and MongoDb (Jackson)
--------------------------------------------------

Finish the todo application turorial from the official wiki Play 2.2.1 framework with Java (http://www.playframework.com/documentation/2.2.1/JavaTodoList)

It uses an Sql database (H2) and we will try to use MongoDb instead.

We will use Jackson library for MongoDb support (https://github.com/vznet/play-mongo-jackson-mapper).

Steps
-----

* Complete the tutorial.

* Replace corresponding files in your application by files from this repo.

* Do "play dependencies" in your console (in the project's root folder)

* Don't forget to start mongodb daemon! It should use the default host (localhost) and the default port.

* Run the application, if everything works, congratulations, you've done it!

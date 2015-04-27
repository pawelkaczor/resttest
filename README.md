# RestTest

A lightweight Scala DSL for system testing REST web services

## Example

```scala
val Jason: Person = ???
val personJson = Json.stringify(Jason)
val EmptyList = List[Person]()

using(_ url "http://api.rest.org/person") { implicit rb =>
  GET asserting (statusCode is Status.OK, jsonBodyAsList[Person] is EmptyList)
  val id = POST body personJson asserting (statusCode is Status.Created) returning (header("X-Person-Id"))
  GET / id asserting (statusCode is Status.OK, jsonBodyAs[Person] is Jason)
  GET asserting (statusCode is Status.OK, jsonBodyAsList[Person] is Seq(Jason))
  DELETE / id asserting (statusCode is Status.OK)
  GET / id asserting (statusCode is Status.NotFound)
  GET asserting (statusCode is Status.OK, jsonBodyAsList[Person] is EmptyList)
}
```

## License

RestTest is licensed under the permissive [Apache 2 Open Source License](http://www.apache.org/licenses/LICENSE-2.0.txt).

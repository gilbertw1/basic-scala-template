package template

import scala.concurrent.Future

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import play.api.libs.json.{ Json, JsValue }
import play.api.libs.ws._
import play.api.libs.ws.ahc._
import play.api.libs.ws.DefaultBodyWritables._
import play.api.libs.ws.JsonBodyWritables._

object Main extends App {

  implicit val bioFmt = Json.format[Bio]
  implicit val responseFmt = Json.format[Response]

  implicit val system = ActorSystem()
  implicit val ec = system.dispatcher
  implicit val materializer = ActorMaterializer()

  val ws = StandaloneAhcWSClient()

  ws.url("http://api.bryangilbert.com/profile").get.foreach { response =>
    val parsed = Json.parse(response.body).as[Response]
    println(s"Received Name: ${parsed.bio.middlename}")
  }
}

case class Response(
  bio: Bio)

case class Bio(
  middlename: String)

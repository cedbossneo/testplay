package controllers

import play.api._
import play.api.libs.json.Json
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def geowarin = Action { request =>
    val name = request.queryString("name").mkString
    Ok(Json.toJson(
        Map("status" -> "OK", "message" -> (s"Hello $name"))
      ))
  }

}
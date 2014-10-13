package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  //  def geowarin = Action { request =>
  //    val name = request.queryString("name").mkString
  //    Ok(Json.toJson(
  //        Map("status" -> "OK", "message" -> (s"Hello $name"))
  //      ))
  //  }

}
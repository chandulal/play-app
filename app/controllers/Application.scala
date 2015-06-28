package controllers

import javax.inject.Inject
import play.api._
import play.api.libs.ws.WSClient
import play.api.mvc._
class Application @Inject() (ws: WSClient) extends Controller {

  def index = Action {
    Ok(views.html.index("Hi this is helloworld application."))
  }

}

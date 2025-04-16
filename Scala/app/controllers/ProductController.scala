package controllers

import javax.inject._
import models._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.data.Form
import play.api.data.Forms._

@Singleton
class ProductController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  
  def index() = Action {  implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def addProduct = Action {
    Ok(views.html.add())
  }
  
  def validateAdd = Action { request =>
    val postVal = request.body.asFormUrlEncoded
    postVal.map { args =>
      val name = args("name").head
      val id = Product.addProduct(name)
      Ok(views.html.productInfo(name, id))
    }.getOrElse(Redirect(routes.ProductController.addProduct))
  }

  def deleteProduct = Action {
    Ok(views.html.delete())
  }

  def validateDelete = Action { request =>
    val postVal = request.body.asFormUrlEncoded
    postVal.map { args =>
      val id = args("id").head.toLong
      val product = Product.deleteProduct(id)
      Redirect(routes.ProductController.index)
    }.getOrElse(Redirect(routes.ProductController.index))
  }
  
  def getProduct = Action {
    Ok(views.html.get())
  }

  def validateGet = Action { request =>
    val postVal = request.body.asFormUrlEncoded
    postVal.map { args =>
      val id = args("id").head.toLong
      val name = Product.getProduct(id).head
      Ok(views.html.productInfo(name, id))
    }.getOrElse(Redirect(routes.ProductController.getProduct))
  }

  def updateProduct = Action {
    Ok(views.html.update())
  }

  def validateUpdate = Action { request =>
    val postVal = request.body.asFormUrlEncoded
    postVal.map { args =>
      val id = args("id").head.toLong
      val name = args("name").head
      Product.updateProduct(id, name)
      Ok(views.html.productInfo(name, id))
    }.getOrElse(Redirect(routes.ProductController.index))
  }
}

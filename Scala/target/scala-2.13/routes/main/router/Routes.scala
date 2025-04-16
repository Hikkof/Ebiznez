// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ProductController_0: controllers.ProductController,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ProductController_0: controllers.ProductController,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, ProductController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_0, Assets_1, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.ProductController.deleteProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get""", """controllers.ProductController.getProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update""", """controllers.ProductController.updateProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateAdd""", """controllers.ProductController.validateAdd"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateDelete""", """controllers.ProductController.validateDelete"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateGet""", """controllers.ProductController.validateGet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateUpdate""", """controllers.ProductController.validateUpdate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:7
  private lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private lazy val controllers_ProductController_addProduct1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_0.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """add""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private lazy val controllers_ProductController_deleteProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private lazy val controllers_ProductController_deleteProduct2_invoker = createInvoker(
    ProductController_0.deleteProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProduct",
      Nil,
      "GET",
      this.prefix + """delete""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private lazy val controllers_ProductController_getProduct3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get")))
  )
  private lazy val controllers_ProductController_getProduct3_invoker = createInvoker(
    ProductController_0.getProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Nil,
      "GET",
      this.prefix + """get""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private lazy val controllers_ProductController_updateProduct4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update")))
  )
  private lazy val controllers_ProductController_updateProduct4_invoker = createInvoker(
    ProductController_0.updateProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProduct",
      Nil,
      "GET",
      this.prefix + """update""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private lazy val controllers_ProductController_validateAdd5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateAdd")))
  )
  private lazy val controllers_ProductController_validateAdd5_invoker = createInvoker(
    ProductController_0.validateAdd,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "validateAdd",
      Nil,
      "POST",
      this.prefix + """validateAdd""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:15
  private lazy val controllers_ProductController_validateDelete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateDelete")))
  )
  private lazy val controllers_ProductController_validateDelete6_invoker = createInvoker(
    ProductController_0.validateDelete,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "validateDelete",
      Nil,
      "POST",
      this.prefix + """validateDelete""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:17
  private lazy val controllers_ProductController_validateGet7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateGet")))
  )
  private lazy val controllers_ProductController_validateGet7_invoker = createInvoker(
    ProductController_0.validateGet,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "validateGet",
      Nil,
      "POST",
      this.prefix + """validateGet""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:19
  private lazy val controllers_ProductController_validateUpdate8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateUpdate")))
  )
  private lazy val controllers_ProductController_validateUpdate8_invoker = createInvoker(
    ProductController_0.validateUpdate,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "validateUpdate",
      Nil,
      "POST",
      this.prefix + """validateUpdate""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:22
  private lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_0.index())
      }
  
    // @LINE:8
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_0.addProduct)
      }
  
    // @LINE:9
    case controllers_ProductController_deleteProduct2_route(params@_) =>
      call { 
        controllers_ProductController_deleteProduct2_invoker.call(ProductController_0.deleteProduct)
      }
  
    // @LINE:10
    case controllers_ProductController_getProduct3_route(params@_) =>
      call { 
        controllers_ProductController_getProduct3_invoker.call(ProductController_0.getProduct)
      }
  
    // @LINE:11
    case controllers_ProductController_updateProduct4_route(params@_) =>
      call { 
        controllers_ProductController_updateProduct4_invoker.call(ProductController_0.updateProduct)
      }
  
    // @LINE:13
    case controllers_ProductController_validateAdd5_route(params@_) =>
      call { 
        controllers_ProductController_validateAdd5_invoker.call(ProductController_0.validateAdd)
      }
  
    // @LINE:15
    case controllers_ProductController_validateDelete6_route(params@_) =>
      call { 
        controllers_ProductController_validateDelete6_invoker.call(ProductController_0.validateDelete)
      }
  
    // @LINE:17
    case controllers_ProductController_validateGet7_route(params@_) =>
      call { 
        controllers_ProductController_validateGet7_invoker.call(ProductController_0.validateGet)
      }
  
    // @LINE:19
    case controllers_ProductController_validateUpdate8_route(params@_) =>
      call { 
        controllers_ProductController_validateUpdate8_invoker.call(ProductController_0.validateUpdate)
      }
  
    // @LINE:22
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}

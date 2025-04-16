// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def validateAdd: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateAdd")
    }
  
    // @LINE:10
    def getProduct: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "get")
    }
  
    // @LINE:11
    def updateProduct: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update")
    }
  
    // @LINE:17
    def validateGet: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateGet")
    }
  
    // @LINE:8
    def addProduct: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add")
    }
  
    // @LINE:15
    def validateDelete: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateDelete")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def deleteProduct: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:19
    def validateUpdate: Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validateUpdate")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

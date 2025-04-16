
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object productInfo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Prodct Information")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
  """),format.raw/*4.3*/("""<p>Product name: <em>"""),_display_(/*4.25*/name),format.raw/*4.29*/("""</em></p>
  <p>Product id: <em>"""),_display_(/*5.23*/id),format.raw/*5.25*/("""</em></p>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(name:String,id:Long): play.twirl.api.HtmlFormat.Appendable = apply(name,id)

  def f:((String,Long) => play.twirl.api.HtmlFormat.Appendable) = (name,id) => apply(name,id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/productInfo.scala.html
                  HASH: 622fd9fc7d91aa8707a37122e34bdd3070951939
                  MATRIX: 740->1|858->26|885->28|919->54|958->56|987->59|1035->81|1059->85|1117->117|1139->119|1179->130
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5|30->6
                  -- GENERATED --
              */
          
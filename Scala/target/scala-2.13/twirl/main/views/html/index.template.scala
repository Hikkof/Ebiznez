
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Basic page")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
  """),format.raw/*4.3*/("""<p>Aby dodać produkt przejdz do "http://localhost:9000/add"</p>
  <p>Aby usunąć produkt przejdz do "http://localhost:9000/delete"</p>
  <p>Aby zobaczyć informacje o produkcie przejdz do "http://localhost:9000/get"</p>
  <p>Aby zaktualizować produkt przejdz do "http://localhost:9000/update"</p>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: c6e6dd2a17f05865014b96625c00ddee94e3d2bd
                  MATRIX: 722->1|818->4|845->6|871->24|910->26|939->29|1264->325
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|32->8
                  -- GENERATED --
              */
          
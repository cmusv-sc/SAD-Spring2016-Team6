
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""


<html>
  <head>
    <title>Zentasks</title>
    <link href='"""),_display_(Seq[Any](/*7.18*/routes/*7.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.59*/("""'
    rel="stylesheet"/>
    <link href='"""),_display_(Seq[Any](/*9.18*/routes/*9.24*/.Assets.at("css/header.css"))),format.raw/*9.52*/("""'
    rel="stylesheet"/>
    <link href='"""),_display_(Seq[Any](/*11.18*/routes/*11.24*/.Assets.at("css/login.css"))),format.raw/*11.51*/("""'
    rel="stylesheet"/>

    <script src='"""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("js/jquery-1.1.js"))),format.raw/*14.55*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("js/login.js"))),format.raw/*15.50*/("""'></script>
  </head>
  <body>
  <div id="header">
    """),_display_(Seq[Any](/*19.6*/fixed/*19.11*/.header("undefined",-1, -1, "undefined"))),format.raw/*19.51*/("""
  </div>

    <form class="form-horizontal" action=""""),_display_(Seq[Any](/*22.44*/routes/*22.50*/.Application.authenticate)),format.raw/*22.75*/("""" method="post">
    <div class="container-fluid row">
      <div class="col-xs-10 col-xs-offset-1 col-md-6 col-md-offset-3 col-lg-4 col-lg-offset-4">
        
        <div class="login-box">
          <div class="form-title">
            <h1><a href='/login' class="title_lable active">Log in</a> / <a href='/signup' class="title_lable <>">Sign
              up</a></h1>
          </div>
          """),_display_(Seq[Any](/*31.12*/if(form.hasGlobalErrors)/*31.36*/ {_display_(Seq[Any](format.raw/*31.38*/("""
            <p class="error">
            """),_display_(Seq[Any](/*33.14*/form/*33.18*/.globalError.message)),format.raw/*33.38*/("""
            </p>
          """)))})),format.raw/*35.12*/("""
          """),_display_(Seq[Any](/*36.12*/flashmsg())),format.raw/*36.22*/("""
          <div class="form-group">
            <label for="inputUname" class="col-sm-2 control-label">Email</label>

            <div class="col-sm-10">
              <input type="email" class="form-control" name="email" id="inputUname" placeholder="email">
            </div>
          </div>
          <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label">Password</label>

            <div class="col-sm-10">
              <input type="password" class="form-control" id="inputPassword" name="password"
              placeholder="Password">
            </div>
          </div>

          <div class="form-group">
                <label for="inputUname" class="col-sm-2 control-label">Priviledge</label>

                <div class="col-sm-10">
                  <select class="form-control" name="priviledge">
                      <option value ="User">User</option>
                      <option value ="Guest">Guest</option>
                      <option value ="Administrator">Administrator</option>
                  </select>
                </div>
            </div>

        </div>

        <div class="form-group">
          <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Log in</button>
          </div>
        </div>
      </div>
    </div>
  </form>
  </body>
</html>"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/login.scala.html
                    HASH: 3bb94863e32cdb8a45c6659945359068c7efea9a
                    MATRIX: 791->1|916->32|1015->96|1029->102|1085->137|1162->179|1176->185|1225->213|1303->255|1318->261|1367->288|1447->332|1462->338|1514->368|1580->398|1595->404|1642->429|1733->485|1747->490|1809->530|1899->584|1914->590|1961->615|2397->1015|2430->1039|2470->1041|2550->1085|2563->1089|2605->1109|2666->1138|2714->1150|2746->1160
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|47->19|47->19|47->19|50->22|50->22|50->22|59->31|59->31|59->31|61->33|61->33|61->33|63->35|64->36|64->36
                    -- GENERATED --
                */
            
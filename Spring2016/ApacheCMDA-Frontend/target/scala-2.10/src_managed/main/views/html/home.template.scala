
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: String, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("css/home.css"))),format.raw/*9.54*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*10.59*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/home.js"))),format.raw/*11.53*/("""'></script>
    </head>
    <body>
        <div id="header">"""),_display_(Seq[Any](/*14.27*/fixed/*14.32*/.header(username, Long.parseLong(userId), Long.parseLong(userId), priviledge))),format.raw/*14.109*/("""</div>
        <section class="sec-2">
            <div class="banner">
                <div class="hello">
                    <p>Workflow</p>
                    <p>Centric Scientific Social Network</p>
                </div>
                <div class="entry">
                    """),_display_(Seq[Any](/*22.22*/if(userId != "-1")/*22.40*/{_display_(Seq[Any](format.raw/*22.41*/("""
                        <a href="/timeline/0">Explore Workflows ></a>
                    """)))}/*24.22*/else/*24.26*/{_display_(Seq[Any](format.raw/*24.27*/("""
                        <a href="/login">Explore Workflows ></a>
                    """)))})),format.raw/*26.22*/("""

                </div>
            </div>
        </section>
    </body>
</html>"""))}
    }
    
    def render(username:String,userId:String,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(username,userId,priviledge)
    
    def f:((String,String,String) => play.api.templates.HtmlFormat.Appendable) = (username,userId,priviledge) => apply(username,userId,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/home.scala.html
                    HASH: 289c57ac63eecd33b1561e705d6c1894aa0df925
                    MATRIX: 787->1|935->55|1099->184|1113->190|1169->225|1246->267|1260->273|1309->301|1386->343|1400->349|1447->375|1526->418|1541->424|1593->454|1663->488|1678->494|1724->518|1821->579|1835->584|1935->661|2256->946|2283->964|2322->965|2433->1057|2446->1061|2485->1062|2604->1149
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|50->22|50->22|50->22|52->24|52->24|52->24|54->26
                    -- GENERATED --
                */
            

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
object join_group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/header.css"))),format.raw/*7.56*/("""'
        rel="stylesheet"/>

        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*10.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*14.10*/fixed/*14.15*/.header(userName, userId, userId, priviledge ))),format.raw/*14.61*/("""
        </div>
        <div class="container">
            <div class="alert-info" role="alert">
                """),_display_(Seq[Any](/*18.18*/if(flash.containsKey("success"))/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
                    """),_display_(Seq[Any](/*19.22*/flash/*19.27*/.get("success"))),format.raw/*19.42*/("""
                """)))})),format.raw/*20.18*/("""
                """),_display_(Seq[Any](/*21.18*/if(flash.containsKey("failed"))/*21.49*/ {_display_(Seq[Any](format.raw/*21.51*/("""
                    """),_display_(Seq[Any](/*22.22*/flash/*22.27*/.get("failed"))),format.raw/*22.41*/("""
                """)))})),format.raw/*23.18*/("""
            </div>
            <div>
                <h3>Join group</h3>
                <form action=""""),_display_(Seq[Any](/*27.32*/routes/*27.38*/.GroupController.joinGroup())),format.raw/*27.66*/("""" method="POST">
                    <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*28.64*/userId)),format.raw/*28.70*/("""">
                    <input type="text" name="groupUrl" placeholder="pass code">
                    <button type="submit">Join</button>
                </form>
            </div>
        </div>
    </body>
</html>




"""))}
    }
    
    def render(userName:String,userId:Long,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,priviledge)
    
    def f:((String,Long,String) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,priviledge) => apply(userName,userId,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/join_group.scala.html
                    HASH: cbc72fe75c61f2464c98c140fcb677305f722f31
                    MATRIX: 791->1|937->53|1013->94|1027->100|1083->135|1168->185|1182->191|1231->219|1319->271|1334->277|1386->307|1492->377|1506->382|1574->428|1725->543|1766->575|1806->577|1864->599|1878->604|1915->619|1965->637|2019->655|2059->686|2099->688|2157->710|2171->715|2207->729|2257->747|2398->852|2413->858|2463->886|2579->966|2607->972
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|55->27|55->27|55->27|56->28|56->28
                    -- GENERATED --
                */
            
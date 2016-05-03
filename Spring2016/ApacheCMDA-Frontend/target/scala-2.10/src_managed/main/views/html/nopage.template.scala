
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
object nopage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Long,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, offset: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*18.14*/plus/*18.18*/(input: Long) = {{
                input + 1
            }};def /*21.14*/minus/*21.19*/(input: Long) = {{
                input - 1
            }};
Seq[Any](format.raw/*1.48*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*9.39*/routes/*9.45*/.Assets.at("css/workflow.css"))),format.raw/*9.75*/("""' rel="stylesheet">

        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*11.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*15.10*/fixed/*15.15*/.header(userName, userId, userId, "undefind"))),format.raw/*15.60*/("""
        </div>
        <div class="container">
            """),format.raw/*20.14*/("""
            """),format.raw/*23.14*/("""

            <h1> There is no workflow</h1>
            <a href="/workflow">Please add a new workflow ></a>

            """),_display_(Seq[Any](/*28.14*/if(offset > 0)/*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
                <form action="/timeline/"""),_display_(Seq[Any](/*29.42*/minus(offset))),format.raw/*29.55*/("""">
                    <button name="subject" type="submit" value="Back">Back</button>
                </form>
            """)))})),format.raw/*32.14*/("""
        </div>
    </body>
</html>"""))}
    }
    
    def render(userName:String,userId:Long,offset:Long): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,offset)
    
    def f:((String,Long,Long) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,offset) => apply(userName,userId,offset)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 06:43:39 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/nopage.scala.html
                    HASH: 9b00515d1a4313f529afca9b6c47e6d1152de600
                    MATRIX: 785->1|910->648|923->652|996->724|1010->729|1098->47|1262->176|1276->182|1332->217|1409->259|1423->265|1472->293|1566->352|1580->358|1631->388|1710->431|1725->437|1777->467|1883->537|1897->542|1964->587|2052->710|2093->787|2252->910|2275->924|2315->926|2393->968|2428->981|2584->1105
                    LINES: 26->1|28->18|28->18|30->21|30->21|33->1|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|43->11|43->11|43->11|47->15|47->15|47->15|50->20|51->23|56->28|56->28|56->28|57->29|57->29|60->32
                    -- GENERATED --
                */
            
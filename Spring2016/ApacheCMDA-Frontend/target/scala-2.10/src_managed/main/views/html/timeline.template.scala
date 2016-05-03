
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
object timeline extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,Long,List[Workflow],Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, allTimeline: List[Workflow], offset: Long, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*18.14*/plus/*18.18*/(input: Long) = {{
                input + 1
            }};def /*21.14*/minus/*21.19*/(input: Long) = {{
                input - 1
            }};
Seq[Any](format.raw/*1.97*/("""
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
        """),_display_(Seq[Any](/*15.10*/fixed/*15.15*/.header(userName, userId, userId, priviledge ))),format.raw/*15.61*/("""
        </div>
        <div class="container">
            """),format.raw/*20.14*/("""
            """),format.raw/*23.14*/("""

            """),_display_(Seq[Any](/*25.14*/if(allTimeline != null)/*25.37*/ {_display_(Seq[Any](format.raw/*25.39*/("""
                <h1>Workflows</h1>
                <hr>
                """),_display_(Seq[Any](/*28.18*/for( result <- allTimeline) yield /*28.45*/ {_display_(Seq[Any](format.raw/*28.47*/("""
                    """),_display_(Seq[Any](/*29.22*/if(result.getWfStatus == "norm")/*29.54*/ {_display_(Seq[Any](format.raw/*29.56*/("""
                        """),_display_(Seq[Any](/*30.26*/fixed/*30.31*/.workflowcard(result))),format.raw/*30.52*/("""
                    """)))})),format.raw/*31.22*/("""
                """)))})),format.raw/*32.18*/("""
                <form action="/timeline/"""),_display_(Seq[Any](/*33.42*/plus(offset))),format.raw/*33.54*/(""" ">
                    <button name="subject" type="submit" value="Next Page">Next Page</button>
                </form>
            """)))})),format.raw/*36.14*/("""

            """),_display_(Seq[Any](/*38.14*/if(offset > 0)/*38.28*/ {_display_(Seq[Any](format.raw/*38.30*/("""
                <form action="/timeline/"""),_display_(Seq[Any](/*39.42*/minus(offset))),format.raw/*39.55*/("""">
                    <button name="subject" type="submit" value="Back">Back</button>
                </form>
            """)))})),format.raw/*42.14*/("""
        </div>
    </body>
</html>"""))}
    }
    
    def render(userName:String,userId:Long,allTimeline:List[Workflow],offset:Long,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,allTimeline,offset,priviledge)
    
    def f:((String,Long,List[Workflow],Long,String) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,allTimeline,offset,priviledge) => apply(userName,userId,allTimeline,offset,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/timeline.scala.html
                    HASH: 8b0cdb5db9d8a0ce921387426e9790205fbf53f6
                    MATRIX: 809->1|983->698|996->702|1069->774|1083->779|1171->96|1335->225|1349->231|1405->266|1482->308|1496->314|1545->342|1639->401|1653->407|1704->437|1783->480|1798->486|1850->516|1956->586|1970->591|2038->637|2126->760|2167->837|2218->852|2250->875|2290->877|2400->951|2443->978|2483->980|2541->1002|2582->1034|2622->1036|2684->1062|2698->1067|2741->1088|2795->1110|2845->1128|2923->1170|2957->1182|3124->1317|3175->1332|3198->1346|3238->1348|3316->1390|3351->1403|3507->1527
                    LINES: 26->1|28->18|28->18|30->21|30->21|33->1|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|43->11|43->11|43->11|47->15|47->15|47->15|50->20|51->23|53->25|53->25|53->25|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|60->32|61->33|61->33|64->36|66->38|66->38|66->38|67->39|67->39|70->42
                    -- GENERATED --
                */
            
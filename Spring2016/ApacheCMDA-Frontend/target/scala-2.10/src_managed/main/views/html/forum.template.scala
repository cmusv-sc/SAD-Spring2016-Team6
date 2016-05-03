
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
object forum extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Workflow],String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(workflows: List[Workflow], userName: String, userId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.61*/("""

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*8.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("css/header.css"))),format.raw/*10.56*/("""'
        rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*12.59*/("""'></script>

        <style>
        .forum.table > tbody > tr > td """),format.raw/*15.40*/("""{"""),format.raw/*15.41*/("""
        vertical-align: middle ;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""

        .forum.fa """),format.raw/*19.19*/("""{"""),format.raw/*19.20*/("""
        width: 1em ;
        text-align: center ;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        .forum.table th.cell-stat """),format.raw/*24.35*/("""{"""),format.raw/*24.36*/("""
        width: 6em ;
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""

        .forum.table th.cell-stat-2x """),format.raw/*28.38*/("""{"""),format.raw/*28.39*/("""
        width: 14em ;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""
        </style>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*35.10*/fixed/*35.15*/.header(userName, userId, userId, "undefined"))),format.raw/*35.61*/("""
        </div>

        <div class="container">

            <h1>Forums</h1>
            <hr>
            <table class="table forum table-striped">
                <thead>
                    <tr>
                        <th class="cell-stat"></th>
                        <th>Workflows</th>
                        <th class="cell-stat text-center hidden-xs hidden-sm">Creator</th>
                        <th class="cell-stat text-center hidden-xs hidden-sm">Category</th>
                        <th class="cell-stat text-center hidden-xs hidden-sm">Views</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(Seq[Any](/*53.18*/for( workflow <- workflows) yield /*53.45*/ {_display_(Seq[Any](format.raw/*53.47*/("""
                    <tr>
                        <td class="text-center"><i class="fa fa-question fa-2x text-primary"></i></td>
                        <td><a href="/workflow/get/"""),_display_(Seq[Any](/*56.53*/workflow/*56.61*/.getId)),format.raw/*56.67*/("""">"""),_display_(Seq[Any](/*56.70*/workflow/*56.78*/.getWfTitle)),format.raw/*56.89*/("""</a> <br> <small>"""),_display_(Seq[Any](/*56.107*/workflow/*56.115*/.getShortWfDesc)),format.raw/*56.130*/("""</small></td>
                        <td class="text-center hidden-xs hidden-sm"><a href="/profile/"""),_display_(Seq[Any](/*57.88*/workflow/*57.96*/.getUserId)),format.raw/*57.106*/("""">"""),_display_(Seq[Any](/*57.109*/workflow/*57.117*/.getUserName)),format.raw/*57.129*/("""</a></td>
                        <td class="text-center hidden-xs hidden-sm">"""),_display_(Seq[Any](/*58.70*/workflow/*58.78*/.getWfCategory)),format.raw/*58.92*/("""</td>
                        <td class="text-center hidden-xs hidden-sm">"""),_display_(Seq[Any](/*59.70*/workflow/*59.78*/.getWfViewCount)),format.raw/*59.93*/("""</td>
                    </tr>
                """)))})),format.raw/*61.18*/("""
                </tbody>
            </table>
        </div>
    </body>
</html>




"""))}
    }
    
    def render(workflows:List[Workflow],userName:String,userId:Long): play.api.templates.HtmlFormat.Appendable = apply(workflows,userName,userId)
    
    def f:((List[Workflow],String,Long) => play.api.templates.HtmlFormat.Appendable) = (workflows,userName,userId) => apply(workflows,userName,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:49:16 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/forum.scala.html
                    HASH: a75bc1da1ea3fe198b89f1aefe7f25c122088d11
                    MATRIX: 794->1|947->60|1112->190|1126->196|1182->231|1268->281|1283->287|1333->315|1420->366|1435->372|1487->402|1583->470|1612->471|1681->513|1710->514|1758->534|1787->535|1873->594|1902->595|1966->631|1995->632|2052->662|2081->663|2148->702|2177->703|2235->734|2264->735|2376->811|2390->816|2458->862|3151->1519|3194->1546|3234->1548|3451->1729|3468->1737|3496->1743|3535->1746|3552->1754|3585->1765|3640->1783|3658->1791|3696->1806|3833->1907|3850->1915|3883->1925|3923->1928|3941->1936|3976->1948|4091->2027|4108->2035|4144->2049|4255->2124|4272->2132|4309->2147|4390->2196
                    LINES: 26->1|29->1|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|43->15|43->15|45->17|45->17|47->19|47->19|50->22|50->22|52->24|52->24|54->26|54->26|56->28|56->28|58->30|58->30|63->35|63->35|63->35|81->53|81->53|81->53|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|85->57|85->57|85->57|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|89->61
                    -- GENERATED --
                */
            
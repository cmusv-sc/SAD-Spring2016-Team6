
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
object create_group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Long,List[Group],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, groups: List[Group],priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.74*/("""

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
        """),_display_(Seq[Any](/*14.10*/fixed/*14.15*/.header(userName, userId, userId, priviledge))),format.raw/*14.60*/("""
        </div>
        <div class="container">
            <div class="alert-info" role="alert">
                """),_display_(Seq[Any](/*18.18*/if(flash.containsKey("linkstring"))/*18.53*/ {_display_(Seq[Any](format.raw/*18.55*/("""
                    Congratulations, the pass for the group is """),_display_(Seq[Any](/*19.65*/flash/*19.70*/.get("linkstring"))),format.raw/*19.88*/(""" !
                """)))})),format.raw/*20.18*/("""
                """),_display_(Seq[Any](/*21.18*/if(flash.containsKey("failed"))/*21.49*/ {_display_(Seq[Any](format.raw/*21.51*/("""
                    """),_display_(Seq[Any](/*22.22*/flash/*22.27*/.get("failed"))),format.raw/*22.41*/("""
                """)))})),format.raw/*23.18*/("""
            </div>
            <div>
                <h3>Create new group</h3>
                <form action=""""),_display_(Seq[Any](/*27.32*/routes/*27.38*/.GroupController.createGroup())),format.raw/*27.68*/("""" method="POST">
                    <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*28.64*/userId)),format.raw/*28.70*/("""">
                    <input type="text" name="groupName" placeholder="groupName">
                    <input type="text" name="groupDescription" placeholder="groupDescription">
                    <button type="submit">Create</button>
                </form>
            </div>

            <h1>Your Groups</h1>
            """),_display_(Seq[Any](/*36.14*/if(groups != null)/*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
                <table>
                    <tr><th>Group Name</th><th>Pass code</th></tr>
                    """),_display_(Seq[Any](/*39.22*/for( group <- groups) yield /*39.43*/ {_display_(Seq[Any](format.raw/*39.45*/("""
                        <tr>
                            <td>"""),_display_(Seq[Any](/*41.34*/group/*41.39*/.getGroupName)),format.raw/*41.52*/("""</td>
                            <td>"""),_display_(Seq[Any](/*42.34*/group/*42.39*/.getGroupUrl)),format.raw/*42.51*/("""</td>
                        </tr>
                    """)))})),format.raw/*44.22*/("""
                </table>
            """)))}/*46.15*/else/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
                <p>You are not the admin of any group!</p>
            """)))})),format.raw/*48.14*/("""
        </div>
    </body>
</html>





"""))}
    }
    
    def render(userName:String,userId:Long,groups:List[Group],priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(userName,userId,groups,priviledge)
    
    def f:((String,Long,List[Group],String) => play.api.templates.HtmlFormat.Appendable) = (userName,userId,groups,priviledge) => apply(userName,userId,groups,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/create_group.scala.html
                    HASH: 186a9801c265f3181a96a74050891349ef8faf46
                    MATRIX: 805->1|971->73|1047->114|1061->120|1117->155|1202->205|1216->211|1265->239|1353->291|1368->297|1420->327|1526->397|1540->402|1607->447|1758->562|1802->597|1842->599|1943->664|1957->669|1997->687|2049->707|2103->725|2143->756|2183->758|2241->780|2255->785|2291->799|2341->817|2488->928|2503->934|2555->964|2671->1044|2699->1050|3062->1377|3089->1395|3129->1397|3278->1510|3315->1531|3355->1533|3454->1596|3468->1601|3503->1614|3578->1653|3592->1658|3626->1670|3715->1727|3773->1767|3786->1772|3825->1773|3930->1846
                    LINES: 26->1|29->1|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|42->14|42->14|42->14|46->18|46->18|46->18|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|55->27|55->27|55->27|56->28|56->28|64->36|64->36|64->36|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|72->44|74->46|74->46|74->46|76->48
                    -- GENERATED --
                */
            

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
object notification extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[User],List[PMessage],List[PMessage],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(req: List[User], inbox: List[PMessage], outbox: List[PMessage], username: String, userId: String, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.120*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("css/header.css"))),format.raw/*9.56*/("""'
        rel="stylesheet"/>
        <style>
            .dark"""),format.raw/*12.18*/("""{"""),format.raw/*12.19*/("""
                background-color:#F3F3F3;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
        </style>
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*16.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*20.10*/fixed/*20.15*/.header(username, Long.parseLong(userId), Long.parseLong(userId), priviledge))),format.raw/*20.92*/("""
        </div>

        <div class="container">
            """),_display_(Seq[Any](/*24.14*/flashmsg())),format.raw/*24.24*/("""
            <h1>Notification Center</h1>
            <hr>
            """),_display_(Seq[Any](/*27.14*/if(req.isEmpty & inbox.isEmpty & outbox.isEmpty)/*27.62*/ {_display_(Seq[Any](format.raw/*27.64*/("""
                <p>You don't have new messages.</p>
            """)))}/*29.15*/else/*29.20*/{_display_(Seq[Any](format.raw/*29.21*/("""
                """),_display_(Seq[Any](/*30.18*/if(!req.isEmpty)/*30.34*/ {_display_(Seq[Any](format.raw/*30.36*/("""
                    <h2>Friend Requests</h2>
                    <table class="table">
                        <tr><th>User</th><th>Email</th><th>Action</th></tr>
                        """),_display_(Seq[Any](/*34.26*/for( result <- req) yield /*34.45*/ {_display_(Seq[Any](format.raw/*34.47*/("""
                            <tr>
                                <td>"""),_display_(Seq[Any](/*36.38*/result/*36.44*/.getUserName)),format.raw/*36.56*/("""</td>
                                <td>"""),_display_(Seq[Any](/*37.38*/result/*37.44*/.getEmail)),format.raw/*37.53*/("""</td>
                                <td><a href="/friends/accept/"""),_display_(Seq[Any](/*38.63*/result/*38.69*/.getId)),format.raw/*38.75*/("""">Accept</a> <a href="/friends/reject/"""),_display_(Seq[Any](/*38.114*/result/*38.120*/.getId)),format.raw/*38.126*/("""">Reject</a></td>
                            </tr>
                        """)))})),format.raw/*40.26*/("""
                    </table>
                """)))})),format.raw/*42.18*/("""

                """),_display_(Seq[Any](/*44.18*/if(!inbox.isEmpty)/*44.36*/ {_display_(Seq[Any](format.raw/*44.38*/("""
                    <h2>Inbox</h2>
                    <table class="table">
                        <tr><th>From</th><th>Title</th><th>Date</th></tr>
                        """),_display_(Seq[Any](/*48.26*/for( result <- inbox) yield /*48.47*/ {_display_(Seq[Any](format.raw/*48.49*/("""
                            """),_display_(Seq[Any](/*49.30*/if(result.isReadstatus)/*49.53*/{_display_(Seq[Any](format.raw/*49.54*/("""
                                <tr class="dark">
                            """)))}/*51.30*/else/*51.34*/{_display_(Seq[Any](format.raw/*51.35*/("""
                                <tr>
                            """)))})),format.raw/*53.30*/("""
                                <td>"""),_display_(Seq[Any](/*54.38*/result/*54.44*/.getFromUserMail)),format.raw/*54.60*/("""</td>
                                <td><a href="/mail/detail/"""),_display_(Seq[Any](/*55.60*/result/*55.66*/.getId)),format.raw/*55.72*/("""">"""),_display_(Seq[Any](/*55.75*/result/*55.81*/.getMailTitle)),format.raw/*55.94*/("""</a></td>
                                <td>"""),_display_(Seq[Any](/*56.38*/result/*56.44*/.getMailDate)),format.raw/*56.56*/("""</td>
                            </tr>
                        """)))})),format.raw/*58.26*/("""
                    </table>
                """)))})),format.raw/*60.18*/("""

                """),_display_(Seq[Any](/*62.18*/if(!outbox.isEmpty)/*62.37*/ {_display_(Seq[Any](format.raw/*62.39*/("""
                    <h2>OutBox</h2>
                    <table class="table">
                        <tr><th>To</th><th>Title</th><th>Date</th><th>isRead</th></tr>
                        """),_display_(Seq[Any](/*66.26*/for( result <- outbox) yield /*66.48*/ {_display_(Seq[Any](format.raw/*66.50*/("""
                            <tr>
                                <td>"""),_display_(Seq[Any](/*68.38*/result/*68.44*/.getToUserMail)),format.raw/*68.58*/("""</td>
                                <td>"""),_display_(Seq[Any](/*69.38*/result/*69.44*/.getMailTitle)),format.raw/*69.57*/("""</td>
                                <td>"""),_display_(Seq[Any](/*70.38*/result/*70.44*/.getMailDate)),format.raw/*70.56*/("""</td>
                                <td>"""),_display_(Seq[Any](/*71.38*/result/*71.44*/.isReadstatus)),format.raw/*71.57*/("""</td>
                            </tr>
                        """)))})),format.raw/*73.26*/("""
                    </table>
                """)))})),format.raw/*75.18*/("""
            """)))})),format.raw/*76.14*/("""
        <hr>
            <h3>Private Mail</h3>
            """),_display_(Seq[Any](/*79.14*/fixed/*79.19*/.write_message(""))),format.raw/*79.37*/("""
        </div>
    </body>
</html>




"""))}
    }
    
    def render(req:List[User],inbox:List[PMessage],outbox:List[PMessage],username:String,userId:String,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(req,inbox,outbox,username,userId,priviledge)
    
    def f:((List[User],List[PMessage],List[PMessage],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (req,inbox,outbox,username,userId,priviledge) => apply(req,inbox,outbox,username,userId,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/notification.scala.html
                    HASH: 1abc949f7033259984aedd51c1a9b154b96e4949
                    MATRIX: 836->1|1049->119|1213->248|1227->254|1283->289|1368->339|1382->345|1431->373|1521->435|1550->436|1633->491|1662->492|1738->532|1753->538|1805->568|1911->638|1925->643|2024->720|2122->782|2154->792|2262->864|2319->912|2359->914|2444->981|2457->986|2496->987|2550->1005|2575->1021|2615->1023|2840->1212|2875->1231|2915->1233|3022->1304|3037->1310|3071->1322|3150->1365|3165->1371|3196->1380|3300->1448|3315->1454|3343->1460|3419->1499|3435->1505|3464->1511|3573->1588|3652->1635|3707->1654|3734->1672|3774->1674|3987->1851|4024->1872|4064->1874|4130->1904|4162->1927|4201->1928|4300->2008|4313->2012|4352->2013|4451->2080|4525->2118|4540->2124|4578->2140|4679->2205|4694->2211|4722->2217|4761->2220|4776->2226|4811->2239|4894->2286|4909->2292|4943->2304|5040->2369|5119->2416|5174->2435|5202->2454|5242->2456|5469->2647|5507->2669|5547->2671|5654->2742|5669->2748|5705->2762|5784->2805|5799->2811|5834->2824|5913->2867|5928->2873|5962->2885|6041->2928|6056->2934|6091->2947|6188->3012|6267->3059|6313->3073|6410->3134|6424->3139|6464->3157
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|42->14|42->14|44->16|44->16|44->16|48->20|48->20|48->20|52->24|52->24|55->27|55->27|55->27|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|66->38|68->40|70->42|72->44|72->44|72->44|76->48|76->48|76->48|77->49|77->49|77->49|79->51|79->51|79->51|81->53|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|86->58|88->60|90->62|90->62|90->62|94->66|94->66|94->66|96->68|96->68|96->68|97->69|97->69|97->69|98->70|98->70|98->70|99->71|99->71|99->71|101->73|103->75|104->76|107->79|107->79|107->79
                    -- GENERATED --
                */
            

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
object mail_detail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[PMessage,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(mail: PMessage, username: String, userId: String, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.72*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*6.22*/routes/*6.28*/.Assets.at("css/header.css"))),format.raw/*6.56*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*7.59*/("""'></script>
    </head>
    <body>
        <div id="header">"""),_display_(Seq[Any](/*10.27*/fixed/*10.32*/.header(username, Long.parseLong(userId), Long.parseLong(userId), priviledge))),format.raw/*10.109*/("""</div>
        <div class="container">
            <h1>Mail Detail</h1>
            <p>From: """),_display_(Seq[Any](/*13.23*/mail/*13.27*/.getFromUserMail)),format.raw/*13.43*/("""</p>
            <p>To: """),_display_(Seq[Any](/*14.21*/mail/*14.25*/.getToUserMail)),format.raw/*14.39*/("""</p>
            <p>Title: """),_display_(Seq[Any](/*15.24*/mail/*15.28*/.getMailTitle)),format.raw/*15.41*/("""</p>
            <p>Content: """),_display_(Seq[Any](/*16.26*/mail/*16.30*/.getMailContent)),format.raw/*16.45*/("""</p>
            <p>Date: """),_display_(Seq[Any](/*17.23*/mail/*17.27*/.getMailDate)),format.raw/*17.39*/("""</p>

            <h2>Reply</h2>
            """),_display_(Seq[Any](/*20.14*/fixed/*20.19*/.write_message(mail.getFromUserMail))),format.raw/*20.55*/("""
        </div>
    </body>
</html>




"""))}
    }
    
    def render(mail:PMessage,username:String,userId:String,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(mail,username,userId,priviledge)
    
    def f:((PMessage,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (mail,username,userId,priviledge) => apply(mail,username,userId,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/mail_detail.scala.html
                    HASH: 8faa199307e49baa0f92c935f68030b2dea98911
                    MATRIX: 803->1|967->71|1043->112|1057->118|1113->153|1190->195|1204->201|1253->229|1331->272|1345->278|1396->308|1493->369|1507->374|1607->451|1737->545|1750->549|1788->565|1849->590|1862->594|1898->608|1962->636|1975->640|2010->653|2076->683|2089->687|2126->702|2189->729|2202->733|2236->745|2318->791|2332->796|2390->832
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|48->20|48->20|48->20
                    -- GENERATED --
                */
            
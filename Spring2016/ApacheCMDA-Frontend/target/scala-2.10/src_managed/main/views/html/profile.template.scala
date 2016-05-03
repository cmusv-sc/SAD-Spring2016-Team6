
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template10[User,List[User],List[User],List[User],String,String,Boolean,Boolean,Boolean,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User, follows: List[User], followees: List[User], myFriends: List[User], self_name: String, self_id: String, isFollower: Boolean, isFollowee: Boolean, isFriend: Boolean, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.198*/("""

<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*5.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*6.22*/routes/*6.28*/.Assets.at("css/header.css"))),format.raw/*6.56*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/profile.css"))),format.raw/*7.57*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*8.59*/("""'></script>
        <title>Profile</title>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*13.10*/fixed/*13.15*/.header(self_name, user.getId, Long.parseLong(self_id), priviledge))),format.raw/*13.82*/("""
        </div>

        <div class="container">
            """),_display_(Seq[Any](/*17.14*/flashmsg())),format.raw/*17.24*/("""
            <div class="row profile-header">
                <div class="col-md-6">
                    <img src=""""),_display_(Seq[Any](/*20.32*/user/*20.36*/.getAvatar)),format.raw/*20.46*/("""" class="align-right avatar">
                </div>
                <div class="col-md-6">
                    <h1>"""),_display_(Seq[Any](/*23.26*/user/*23.30*/.getUserName())),format.raw/*23.44*/("""</h1>
                    <p>"""),_display_(Seq[Any](/*24.25*/user/*24.29*/.getEmail())),format.raw/*24.40*/("""</p>
                </div>
            </div>
            """),_display_(Seq[Any](/*27.14*/if(self_name != user.getUserName)/*27.47*/ {_display_(Seq[Any](format.raw/*27.49*/("""
                """),_display_(Seq[Any](/*28.18*/if(!isFollower)/*28.33*/ {_display_(Seq[Any](format.raw/*28.35*/("""
                    <p><a href="/follow/"""),_display_(Seq[Any](/*29.42*/user/*29.46*/.getId)),format.raw/*29.52*/("""">Follow</a></p>
                """)))})),format.raw/*30.18*/("""
                """),_display_(Seq[Any](/*31.18*/if(isFollower)/*31.32*/ {_display_(Seq[Any](format.raw/*31.34*/("""
                    <p><a href="/unfollow/"""),_display_(Seq[Any](/*32.44*/user/*32.48*/.getId)),format.raw/*32.54*/("""">Unfollow</a></p>
                """)))})),format.raw/*33.18*/("""
                """),_display_(Seq[Any](/*34.18*/if(!isFriend)/*34.31*/ {_display_(Seq[Any](format.raw/*34.33*/("""
                    <p><a href="/befriend/"""),_display_(Seq[Any](/*35.44*/user/*35.48*/.getId)),format.raw/*35.54*/("""">Send Friend Request</a></p>
                """)))}/*36.19*/else/*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""
                    <p>We are friends.</p>
                    <p><a href="/deletefriend/"""),_display_(Seq[Any](/*38.48*/user/*38.52*/.getId)),format.raw/*38.58*/("""">Delete Friend</a></p>
                """)))})),format.raw/*39.18*/("""
                <p><a href="/">BackHome</a></p>
            """)))})),format.raw/*41.14*/("""
            <div class="row">
                <div class="col-md-4">
                    <div class="well">
                        <h3>Followers</h3>
                        <table class="table">
                        """),_display_(Seq[Any](/*47.26*/for( follower <- follows) yield /*47.51*/ {_display_(Seq[Any](format.raw/*47.53*/("""
                            <tr><td><a href="/profile/"""),_display_(Seq[Any](/*48.56*/follower/*48.64*/.getId)),format.raw/*48.70*/("""">"""),_display_(Seq[Any](/*48.73*/follower/*48.81*/.getUserName)),format.raw/*48.93*/("""</a></td><td>"""),_display_(Seq[Any](/*48.107*/follower/*48.115*/.getEmail)),format.raw/*48.124*/("""</td></tr>
                        """)))})),format.raw/*49.26*/("""
                        </table>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="well">
                        <h3>Followees</h3>
                        <table class="table">
                        """),_display_(Seq[Any](/*57.26*/for( followee <- followees) yield /*57.53*/ {_display_(Seq[Any](format.raw/*57.55*/("""
                            <tr><td><a href="/profile/"""),_display_(Seq[Any](/*58.56*/followee/*58.64*/.getId)),format.raw/*58.70*/("""">"""),_display_(Seq[Any](/*58.73*/followee/*58.81*/.getUserName)),format.raw/*58.93*/("""</a></td><td>"""),_display_(Seq[Any](/*58.107*/followee/*58.115*/.getEmail)),format.raw/*58.124*/("""</td></tr>
                        """)))})),format.raw/*59.26*/("""
                        </table>
                    </div>
                </div>
                """),_display_(Seq[Any](/*63.18*/if(self_name == user.getUserName)/*63.51*/ {_display_(Seq[Any](format.raw/*63.53*/("""
                    <div class="col-md-4">
                        <div class="well">
                            <h3>Friends</h3>
                            <table class="table">
                            """),_display_(Seq[Any](/*68.30*/for( friend <- myFriends) yield /*68.55*/ {_display_(Seq[Any](format.raw/*68.57*/("""
                                <tr><td><a href="/profile/"""),_display_(Seq[Any](/*69.60*/friend/*69.66*/.getId)),format.raw/*69.72*/("""">"""),_display_(Seq[Any](/*69.75*/friend/*69.81*/.getUserName)),format.raw/*69.93*/("""</a></td> <td>"""),_display_(Seq[Any](/*69.108*/friend/*69.114*/.getEmail)),format.raw/*69.123*/("""</td></tr>
                            """)))})),format.raw/*70.30*/("""
                            </table>
                        </div>
                    </div>
                """)))})),format.raw/*74.18*/("""
            </div>
        </div>
    </body>
</html>





"""))}
    }
    
    def render(user:User,follows:List[User],followees:List[User],myFriends:List[User],self_name:String,self_id:String,isFollower:Boolean,isFollowee:Boolean,isFriend:Boolean,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend,priviledge)
    
    def f:((User,List[User],List[User],List[User],String,String,Boolean,Boolean,Boolean,String) => play.api.templates.HtmlFormat.Appendable) = (user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend,priviledge) => apply(user,follows,followees,myFriends,self_name,self_id,isFollower,isFollowee,isFriend,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/profile.scala.html
                    HASH: 290a5b8af13a3d022796ad5bfa977b65ac8745ac
                    MATRIX: 853->1|1144->197|1220->238|1234->244|1290->279|1367->321|1381->327|1430->355|1507->397|1521->403|1571->432|1649->475|1663->481|1714->511|1851->612|1865->617|1954->684|2052->746|2084->756|2236->872|2249->876|2281->886|2434->1003|2447->1007|2483->1021|2549->1051|2562->1055|2595->1066|2691->1126|2733->1159|2773->1161|2827->1179|2851->1194|2891->1196|2969->1238|2982->1242|3010->1248|3076->1282|3130->1300|3153->1314|3193->1316|3273->1360|3286->1364|3314->1370|3382->1406|3436->1424|3458->1437|3498->1439|3578->1483|3591->1487|3619->1493|3685->1541|3698->1546|3737->1547|3864->1638|3877->1642|3905->1648|3978->1689|4072->1751|4331->1974|4372->1999|4412->2001|4504->2057|4521->2065|4549->2071|4588->2074|4605->2082|4639->2094|4690->2108|4708->2116|4740->2125|4808->2161|5120->2437|5163->2464|5203->2466|5295->2522|5312->2530|5340->2536|5379->2539|5396->2547|5430->2559|5481->2573|5499->2581|5531->2590|5599->2626|5736->2727|5778->2760|5818->2762|6065->2973|6106->2998|6146->3000|6242->3060|6257->3066|6285->3072|6324->3075|6339->3081|6373->3093|6425->3108|6441->3114|6473->3123|6545->3163|6690->3276
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|41->13|41->13|41->13|45->17|45->17|48->20|48->20|48->20|51->23|51->23|51->23|52->24|52->24|52->24|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|60->32|60->32|60->32|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|66->38|66->38|66->38|67->39|69->41|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|76->48|77->49|85->57|85->57|85->57|86->58|86->58|86->58|86->58|86->58|86->58|86->58|86->58|86->58|87->59|91->63|91->63|91->63|96->68|96->68|96->68|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|97->69|98->70|102->74
                    -- GENERATED --
                */
            
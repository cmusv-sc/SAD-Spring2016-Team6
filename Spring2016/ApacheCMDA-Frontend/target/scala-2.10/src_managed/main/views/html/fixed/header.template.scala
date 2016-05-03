
package views.html.fixed

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
object header extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Long,Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: Long, sessionUser: Long, priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.73*/("""

<script src='"""),_display_(Seq[Any](/*3.15*/routes/*3.21*/.Assets.at("js/bootstrap.min.js"))),format.raw/*3.54*/("""'></script>
<script src='"""),_display_(Seq[Any](/*4.15*/routes/*4.21*/.Assets.at("js/header.js"))),format.raw/*4.47*/("""'></script>

<nav class="navbar navbar-default header">
    <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span> <span
            class="icon-bar"></span> <span class="icon-bar"></span> <span
            class="icon-bar"></span>
            </button>
            <a class="navbar-brand" style="padding-bottom: 0 ;" href="/"><img src='"""),_display_(Seq[Any](/*16.85*/routes/*16.91*/.Assets.at("images/NASA_JPL_logo.png"))),format.raw/*16.129*/("""' style="height: 40px ; width: 220px ;"></a>
        </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

            """),_display_(Seq[Any](/*22.14*/if(username != "undefined")/*22.41*/ {_display_(Seq[Any](format.raw/*22.43*/("""
                <li class="hide" id="userFlag">This is hidden</li>
                <li class="title_lable"><a href="/">Home <span class="sr-only">(current)</span></a></li>
                <li class="title_lable"><a href="/search">Search</a></li>
                <li class="title_lable"><a href="/workflow">Workflow</a></li>
                <li class="title_lable"><a href="/timeline/0">Timeline</a></li>
                <li class="title_lable">
                    <a href="/notifications">Notification</a>
                    <div class="reddot hide"></div>
                </li>
                <li><a href="/workflow/getPublicWorkflow">Forum</a></li>
            """)))})),format.raw/*33.14*/("""
            </ul>
            <ul class="nav navbar-nav navbar-right">
            """),_display_(Seq[Any](/*36.14*/if(username != "undefined")/*36.41*/ {_display_(Seq[Any](format.raw/*36.43*/("""
                <li class="title_lable"><a href="/">"""),_display_(Seq[Any](/*37.54*/priviledge)),format.raw/*37.64*/("""</a></li>
                <li class="dropdown">
                    <a href="#" id="currentuser" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">"""),_display_(Seq[Any](/*39.155*/username)),format.raw/*39.163*/(""" <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/group/create">Create Group</a ></li>
                        <li><a href="/group/join">Join Group</a ></li>
                        <li><a href="/profile/"""),_display_(Seq[Any](/*43.48*/sessionUser)),format.raw/*43.59*/("""">Profile</a></li>
                        <li><a href="/logout">Logout</a ></li>
                    </ul>
                </li>
            """)))})),format.raw/*47.14*/("""
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
"""))}
    }
    
    def render(username:String,userId:Long,sessionUser:Long,priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(username,userId,sessionUser,priviledge)
    
    def f:((String,Long,Long,String) => play.api.templates.HtmlFormat.Appendable) = (username,userId,sessionUser,priviledge) => apply(username,userId,sessionUser,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:53 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/fixed/header.scala.html
                    HASH: ce7d85b1d4046bb7b6d0a78af4ebcbdb973132f7
                    MATRIX: 798->1|963->72|1014->88|1028->94|1082->127|1143->153|1157->159|1204->185|1845->790|1860->796|1921->834|2234->1111|2270->1138|2310->1140|3010->1808|3131->1893|3167->1920|3207->1922|3297->1976|3329->1986|3568->2188|3599->2196|3908->2469|3941->2480|4116->2623
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|44->16|44->16|44->16|50->22|50->22|50->22|61->33|64->36|64->36|64->36|65->37|65->37|67->39|67->39|71->43|71->43|75->47
                    -- GENERATED --
                */
            

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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,String,List[User],List[Workflow],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(username: String, userId: String, category: String, results: List[User], resultswf: List[Workflow], priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.122*/("""

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*8.63*/("""'
        rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*10.22*/routes/*10.28*/.Assets.at("css/header.css"))),format.raw/*10.56*/("""'
        rel="stylesheet"/>

        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*13.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*17.10*/fixed/*17.15*/.header(username, Long.parseLong(userId), Long.parseLong(userId), priviledge))),format.raw/*17.92*/("""
        </div>
        <div class="container row">
            <div class="col-md-8 col-md-offset-1">
                <form action="/searchResult">
                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><span id="searchLabel">User</span> <span class="caret"></span></button>
                            <ul id="search-category" class="dropdown-menu">
                                <li><a href="javascript:void(0)" data-opt="user">User</a></li>
                                <li><a href="javascript:void(0)" data-opt="workflow">Workflow</a></li>
                                <li><a href="javascript:void(0)" data-opt="tag">Tag</a></li>
                            </ul>
                        </div> <!-- /btn-group -->
                        <input type="hidden" value="user" name="category" id="input-category">
                        <input type="text" class="form-control" placeholder="Search for..." name="keywd" aria-label="...">
                        <span class="input-group-btn">
                            <input class="btn btn-default" type="submit">Search</input>
                        </span>
                    </div> <!-- /input-group -->
                </form>
                """),_display_(Seq[Any](/*38.18*/if((results != null && results.size > 0) || (resultswf != null && resultswf.size > 0))/*38.104*/ {_display_(Seq[Any](format.raw/*38.106*/("""
                    <h3>Search result:</h3>
                    <table class="table">
                        """),_display_(Seq[Any](/*41.26*/if(category.equals("user"))/*41.53*/ {_display_(Seq[Any](format.raw/*41.55*/("""
                            <tr><th>User</th><th>Email</th><th>View</th></tr>
                            """),_display_(Seq[Any](/*43.30*/for( result <- results) yield /*43.53*/ {_display_(Seq[Any](format.raw/*43.55*/("""
                                <tr>
                                    <td>"""),_display_(Seq[Any](/*45.42*/result/*45.48*/.getUserName)),format.raw/*45.60*/("""</td>
                                    <td>"""),_display_(Seq[Any](/*46.42*/result/*46.48*/.getEmail)),format.raw/*46.57*/("""</td>
                                    <td><a href="/profile/"""),_display_(Seq[Any](/*47.60*/result/*47.66*/.getId)),format.raw/*47.72*/("""">More</a></td>
                                </tr>
                            """)))})),format.raw/*49.30*/("""
                        """)))})),format.raw/*50.26*/("""
                        """),_display_(Seq[Any](/*51.26*/if(category.equals("tag") || category.equals("workflow"))/*51.83*/ {_display_(Seq[Any](format.raw/*51.85*/("""
                            <tr><th>Title</th><th>Description</th></tr>
                            """),_display_(Seq[Any](/*53.30*/for( result <- resultswf) yield /*53.55*/ {_display_(Seq[Any](format.raw/*53.57*/("""
                                <tr>
                                    <td><a href="/workflow/get/"""),_display_(Seq[Any](/*55.65*/result/*55.71*/.getId)),format.raw/*55.77*/("""">"""),_display_(Seq[Any](/*55.80*/result/*55.86*/.getWfTitle)),format.raw/*55.97*/("""</a></td>
                                    <td>"""),_display_(Seq[Any](/*56.42*/result/*56.48*/.getWfDesc)),format.raw/*56.58*/("""</td>
                                </tr>
                            """)))})),format.raw/*58.30*/("""
                        """)))})),format.raw/*59.26*/("""
                    </table>

                """)))}/*62.19*/else/*62.24*/{_display_(Seq[Any](format.raw/*62.25*/("""
                    """),_display_(Seq[Any](/*63.22*/if(category != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
                        <h3>We haven't find any matches.</h3>
                    """)))})),format.raw/*65.22*/("""
                """)))})),format.raw/*66.18*/("""
            </div>
        </div>
        <script src='"""),_display_(Seq[Any](/*69.23*/routes/*69.29*/.Assets.at("/js/wf-search.js"))),format.raw/*69.59*/("""'></script>
    </body>
</html>







"""))}
    }
    
    def render(username:String,userId:String,category:String,results:List[User],resultswf:List[Workflow],priviledge:String): play.api.templates.HtmlFormat.Appendable = apply(username,userId,category,results,resultswf,priviledge)
    
    def f:((String,String,String,List[User],List[Workflow],String) => play.api.templates.HtmlFormat.Appendable) = (username,userId,category,results,resultswf,priviledge) => apply(username,userId,category,results,resultswf,priviledge)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 02:45:51 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/search.scala.html
                    HASH: ed1a5a29b8ace5e07a70c00bdc11e30f0d14977e
                    MATRIX: 822->1|1037->121|1202->251|1216->257|1272->292|1358->342|1373->348|1423->376|1511->428|1526->434|1578->464|1684->534|1698->539|1797->616|3245->2028|3341->2114|3382->2116|3530->2228|3566->2255|3606->2257|3750->2365|3789->2388|3829->2390|3944->2469|3959->2475|3993->2487|4076->2534|4091->2540|4122->2549|4223->2614|4238->2620|4266->2626|4381->2709|4439->2735|4501->2761|4567->2818|4607->2820|4745->2922|4786->2947|4826->2949|4964->3051|4979->3057|5007->3063|5046->3066|5061->3072|5094->3083|5181->3134|5196->3140|5228->3150|5333->3223|5391->3249|5458->3298|5471->3303|5510->3304|5568->3326|5597->3346|5637->3348|5753->3432|5803->3450|5896->3507|5911->3513|5963->3543
                    LINES: 26->1|29->1|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|45->17|45->17|45->17|66->38|66->38|66->38|69->41|69->41|69->41|71->43|71->43|71->43|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|77->49|78->50|79->51|79->51|79->51|81->53|81->53|81->53|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|86->58|87->59|90->62|90->62|90->62|91->63|91->63|91->63|93->65|94->66|97->69|97->69|97->69
                    -- GENERATED --
                */
            
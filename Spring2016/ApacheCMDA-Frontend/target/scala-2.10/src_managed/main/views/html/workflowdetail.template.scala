
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
object workflowdetail extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Workflow,List[Comment],List[List[Reply]],List[Suggestion],String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wf: Workflow, comments: List[Comment], replyRes: List[List[Reply]], suggestions: List[Suggestion], userName: String, userId: Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.133*/("""
<html>
    <head>
        <link href='"""),_display_(Seq[Any](/*4.22*/routes/*4.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*4.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*5.22*/routes/*5.28*/.Assets.at("css/header.css"))),format.raw/*5.56*/("""' rel="stylesheet"/>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*6.39*/routes/*6.45*/.Assets.at("css/forum.css"))),format.raw/*6.72*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*7.39*/routes/*7.45*/.Assets.at("css/prism.css"))),format.raw/*7.72*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*8.39*/routes/*8.45*/.Assets.at("css/detail.css"))),format.raw/*8.73*/("""'>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*9.59*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/forum.js"))),format.raw/*10.54*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/prism.js"))),format.raw/*11.54*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*15.10*/fixed/*15.15*/.header(userName, userId, userId, "undefind"))),format.raw/*15.60*/("""
        </div>
        <div class="container">
            <h1>"""),_display_(Seq[Any](/*18.18*/wf/*18.20*/.getWfTitle)),format.raw/*18.31*/("""</h1>
            <hr>
            <div class="row">
                <div class="col-md-6">
                    <h3>Workflow</h3>
                    <img src=""""),_display_(Seq[Any](/*23.32*/wf/*23.34*/.getWfImg)),format.raw/*23.43*/("""" class="img-thumbnail main-img">
                </div>
                <div class="col-md-6">
                    <h3>Description</h3>
                    <ul class="list-group workflow-list main-list">
                        <li class="list-group-item"><span class="badge">Name</span> """),_display_(Seq[Any](/*28.86*/wf/*28.88*/.getUserName)),format.raw/*28.100*/("""</li>
                        <li class="list-group-item"><span class="badge">Category</span> """),_display_(Seq[Any](/*29.90*/wf/*29.92*/.getWfCategory)),format.raw/*29.106*/("""</li>
                        <li class="list-group-item"><span class="badge">Detail</span> """),_display_(Seq[Any](/*30.88*/wf/*30.90*/.getWfDesc)),format.raw/*30.100*/("""</li>
                        <li class="list-group-item"><span class="badge">Input</span> """),_display_(Seq[Any](/*31.87*/wf/*31.89*/.getInputString)),format.raw/*31.104*/("""</li>
                        <li class="list-group-item"><span class="badge">Output</span> """),_display_(Seq[Any](/*32.88*/wf/*32.90*/.getOutputString)),format.raw/*32.106*/("""</li>
                        <li class="list-group-item"><span class="badge">
                            Code</span><br><pre><code class="language-css">"""),_display_(Seq[Any](/*34.77*/wf/*34.79*/.getWfCode)),format.raw/*34.89*/("""</code></pre></li>
                        <li class="list-group-item"><span class="badge">Tags</span>
                            <ul class="tags">
                            """),_display_(Seq[Any](/*37.30*/for( tag <- wf.getTags) yield /*37.53*/ {_display_(Seq[Any](format.raw/*37.55*/("""
                                <li class="detail_tag">"""),_display_(Seq[Any](/*38.57*/tag)),format.raw/*38.60*/("""</li>
                            """)))})),format.raw/*39.30*/("""
                            </ul>
                        </li>
                        """),_display_(Seq[Any](/*42.26*/if(wf.isWfEdit)/*42.41*/ {_display_(Seq[Any](format.raw/*42.43*/("""
                            <li class="list-group-item">
                                <span class="badge">Action</span>
                                <a class="btn-sm btn-primary" href="/workflow/update/"""),_display_(Seq[Any](/*45.87*/wf/*45.89*/.getId)),format.raw/*45.95*/("""">Edit</a>
                                <a class="btn-sm btn-danger" href="/workflow/delete/"""),_display_(Seq[Any](/*46.86*/wf/*46.88*/.getId)),format.raw/*46.94*/("""">Delete</a>
                            </li>
                        """)))})),format.raw/*48.26*/("""

                    </ul>
                    <a class="btn-sm btn-primary" href="/workflow/nextpage/"""),_display_(Seq[Any](/*51.77*/wf/*51.79*/.getId)),format.raw/*51.85*/("""">Next Workflow</a>
                </div>
            </div>

            <div class="row">
                <h3>Suggestions:</h3>
                <ul class="list-group list-view">
                """),_display_(Seq[Any](/*58.18*/for( i <- 0 until suggestions.size) yield /*58.53*/ {_display_(Seq[Any](format.raw/*58.55*/("""
                    <li class="list-group-item list-view outer-list">
                        <div class="row">
                            <div class="col-md-11">
                                <p>"""),_display_(Seq[Any](/*62.37*/suggestions(i)/*62.51*/.getContent())),format.raw/*62.64*/("""</p>
                            </div>
                            <div class="col-md-1">
                                <p class="suggestion-like"><a href="javascript:void(0)" data-sugId=""""),_display_(Seq[Any](/*65.102*/suggestions(i)/*65.116*/.getId)),format.raw/*65.122*/("""" class="like"></a> <span>"""),_display_(Seq[Any](/*65.149*/suggestions(i)/*65.163*/.getsVote)),format.raw/*65.172*/("""</span></p>
                            </div>
                        </div>
                        """),_display_(Seq[Any](/*68.26*/if(suggestions(i).getsTag().length > 0)/*68.65*/{_display_(Seq[Any](format.raw/*68.66*/("""
                            <ul class="list-group list-view">
                                <li class="list-group-item list-view">
                                """),_display_(Seq[Any](/*71.34*/for( tag <- suggestions(i).getsTag()) yield /*71.71*/ {_display_(Seq[Any](format.raw/*71.73*/("""
                                    #"""),_display_(Seq[Any](/*72.39*/tag)),format.raw/*72.42*/("""
                                """)))})),format.raw/*73.34*/("""
                                </li>
                            </ul>
                        """)))})),format.raw/*76.26*/("""
                        <form class="form" action=""""),_display_(Seq[Any](/*77.53*/routes/*77.59*/.WorkflowController.addSuggestionTag(suggestions(i).getId))),format.raw/*77.117*/("""" enctype="multipart/form-data" method="POST">
                            <a href="javascript:void(0)" class="toggle">addTag</a>
                            <div class="ninja hide-hood">
                                <input class="form-control input-sm" type="text" name="sTag">
                                <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                            </div>
                        </form>

                    </li>
                """)))})),format.raw/*86.18*/("""
                </ul>
            </div>
            <div class="row">
                <form class="form" role="form" action=""""),_display_(Seq[Any](/*90.57*/routes/*90.63*/.WorkflowController.addSuggestion(wf.getId))),format.raw/*90.106*/(""""
                enctype="multipart/form-data" method="POST">
                    <div class="form-group">
                        <textarea class="form-control" rows="5" name="sContent"></textarea>
                        <button type="submit" class="btn btn-primary mt-btn" >Suggest</button>
                    </div>
                </form>
            </div>

            <div class="row">
                <h3>Comments:</h3>
                <ul class="list-group list-view">
                """),_display_(Seq[Any](/*102.18*/for( i <- 0 until comments.size) yield /*102.50*/ {_display_(Seq[Any](format.raw/*102.52*/("""
                    <li class="list-group-item list-view outer-list">
                        <h4><span class="red">&#35; """),_display_(Seq[Any](/*104.54*/(i + 1))),format.raw/*104.61*/("""</span> &#64; """),_display_(Seq[Any](/*104.76*/(comments(i).getUserName))),format.raw/*104.101*/(""" <small class="right">"""),_display_(Seq[Any](/*104.124*/(new Date(comments(i).getTimestamp).toString))),format.raw/*104.169*/("""</small></h4>
                        <div class="row">
                            <div class="col-md-10">
                                <p>"""),_display_(Seq[Any](/*107.37*/comments(i)/*107.48*/.getContent)),format.raw/*107.59*/("""</p>
                            </div>
                            <div class="col-md-2">
                                <div class="comment-vote">
                                    <a href="javascript:void(0)" data-act="voteup" data-commentId=""""),_display_(Seq[Any](/*111.101*/comments(i)/*111.112*/.getId)),format.raw/*111.118*/("""" data-wfid=""""),_display_(Seq[Any](/*111.132*/wf/*111.134*/.getId)),format.raw/*111.140*/("""" class="vote-thumb vote-up"></a>
                                    <p class="vote-num">"""),_display_(Seq[Any](/*112.58*/comments(i)/*112.69*/.getThumb)),format.raw/*112.78*/("""</p>
                                    <a href="javascript:void(0)" data-act="votedown" data-commentId=""""),_display_(Seq[Any](/*113.103*/comments(i)/*113.114*/.getId)),format.raw/*113.120*/("""" data-wfid=""""),_display_(Seq[Any](/*113.134*/wf/*113.136*/.getId)),format.raw/*113.142*/("""" class="vote-thumb vote-down"></a>
                                </div>
                            </div>
                        </div>
                        <form class="form" action=""""),_display_(Seq[Any](/*117.53*/routes/*117.59*/.WorkflowController.addReply(comments(i).getUser, comments(i).getId, wf.getId))),format.raw/*117.137*/("""" enctype="multipart/form-data" method="POST">
                            <a href="javascript:void(0)" class="toggle">Reply</a>
                            <div class="ninja hide-hood">
                                <input class="form-control input-sm" type="text" name="content">
                                <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                            </div>
                        </form>
                        <ul class="list-group list-view">
                        """),_display_(Seq[Any](/*125.26*/for( j <- 0 until replyRes.get(i).size) yield /*125.65*/ {_display_(Seq[Any](format.raw/*125.67*/("""
                            <li class="list-group-item list-view">
                                <h5>"""),_display_(Seq[Any](/*127.38*/(replyRes.get(i).get(j).getFromUserName))),format.raw/*127.78*/(""" <span class="shy"> &rarr; """),_display_(Seq[Any](/*127.106*/(replyRes.get(i).get(j).getToUserName))),format.raw/*127.144*/("""</span>
                                <small class="right">"""),_display_(Seq[Any](/*128.55*/(new Date(replyRes.get(i).get(j).getTimestamp).toString))),format.raw/*128.111*/("""</small>
                                </h5>
                                <p>"""),_display_(Seq[Any](/*130.37*/("\t" + replyRes.get(i).get(j).getContent))),format.raw/*130.79*/("""</p>

                                <form class="form" action=""""),_display_(Seq[Any](/*132.61*/routes/*132.67*/.WorkflowController.addReply(replyRes.get(i).get(j).getFromUserId, comments(i).getId, wf.getId))),format.raw/*132.162*/("""" enctype="multipart/form-data" method="POST">
                                    <a href="javascript:void(0)" class="toggle">Reply</a>
                                    <div class="ninja hide-hood">
                                        <input class="form-control input-sm" type="text" name="content">
                                        <button class="btn-xs btn-primary mt-btn" type="submit">Submit</button>
                                    </div>

                                </form>
                            </li>
                        """)))})),format.raw/*141.26*/("""
                        </ul>
                    </li>
                """)))})),format.raw/*144.18*/("""
                </ul>
            </div>


            <div class="row">
                <form class="form" role="form" action=""""),_display_(Seq[Any](/*150.57*/routes/*150.63*/.WorkflowController.addComment(wf.getId))),format.raw/*150.103*/(""""
                enctype="multipart/form-data" method="POST">
                    <div class="form-group">
                        <textarea class="form-control" rows="5" name="content"></textarea>
                        <button type="submit" class="btn btn-primary mt-btn" >Comment</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>"""))}
    }
    
    def render(wf:Workflow,comments:List[Comment],replyRes:List[List[Reply]],suggestions:List[Suggestion],userName:String,userId:Long): play.api.templates.HtmlFormat.Appendable = apply(wf,comments,replyRes,suggestions,userName,userId)
    
    def f:((Workflow,List[Comment],List[List[Reply]],List[Suggestion],String,Long) => play.api.templates.HtmlFormat.Appendable) = (wf,comments,replyRes,suggestions,userName,userId) => apply(wf,comments,replyRes,suggestions,userName,userId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Apr 29 06:33:15 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/workflowdetail.scala.html
                    HASH: 46444989c4318f420eb45f6525c4ba06f4786ec7
                    MATRIX: 846->1|1072->132|1147->172|1161->178|1217->213|1294->255|1308->261|1357->289|1451->348|1465->354|1513->381|1589->422|1603->428|1651->455|1727->496|1741->502|1790->530|1850->555|1864->561|1915->591|1985->625|2000->631|2047->656|2117->690|2132->696|2179->721|2285->791|2299->796|2366->841|2467->906|2478->908|2511->919|2708->1080|2719->1082|2750->1091|3076->1381|3087->1383|3122->1395|3253->1490|3264->1492|3301->1506|3430->1599|3441->1601|3474->1611|3602->1703|3613->1705|3651->1720|3780->1813|3791->1815|3830->1831|4021->1986|4032->1988|4064->1998|4278->2176|4317->2199|4357->2201|4450->2258|4475->2261|4542->2296|4668->2386|4692->2401|4732->2403|4978->2613|4989->2615|5017->2621|5149->2717|5160->2719|5188->2725|5292->2797|5432->2901|5443->2903|5471->2909|5705->3107|5756->3142|5796->3144|6033->3345|6056->3359|6091->3372|6320->3564|6344->3578|6373->3584|6437->3611|6461->3625|6493->3634|6632->3737|6680->3776|6719->3777|6922->3944|6975->3981|7015->3983|7090->4022|7115->4025|7181->4059|7311->4157|7400->4210|7415->4216|7496->4274|8025->4771|8189->4899|8204->4905|8270->4948|8805->5446|8854->5478|8895->5480|9056->5604|9086->5611|9138->5626|9187->5651|9248->5674|9317->5719|9498->5863|9519->5874|9553->5885|9841->6135|9863->6146|9893->6152|9945->6166|9958->6168|9988->6174|10116->6265|10137->6276|10169->6285|10314->6392|10336->6403|10366->6409|10418->6423|10431->6425|10461->6431|10691->6624|10707->6630|10809->6708|11384->7246|11440->7285|11481->7287|11623->7392|11686->7432|11752->7460|11814->7498|11913->7560|11993->7616|12113->7699|12178->7741|12281->7807|12297->7813|12416->7908|13012->8471|13119->8545|13286->8675|13302->8681|13366->8721
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|46->18|46->18|46->18|51->23|51->23|51->23|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|65->37|65->37|65->37|66->38|66->38|67->39|70->42|70->42|70->42|73->45|73->45|73->45|74->46|74->46|74->46|76->48|79->51|79->51|79->51|86->58|86->58|86->58|90->62|90->62|90->62|93->65|93->65|93->65|93->65|93->65|93->65|96->68|96->68|96->68|99->71|99->71|99->71|100->72|100->72|101->73|104->76|105->77|105->77|105->77|114->86|118->90|118->90|118->90|130->102|130->102|130->102|132->104|132->104|132->104|132->104|132->104|132->104|135->107|135->107|135->107|139->111|139->111|139->111|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113|141->113|141->113|141->113|145->117|145->117|145->117|153->125|153->125|153->125|155->127|155->127|155->127|155->127|156->128|156->128|158->130|158->130|160->132|160->132|160->132|169->141|172->144|178->150|178->150|178->150
                    -- GENERATED --
                */
            
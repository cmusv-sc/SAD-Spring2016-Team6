
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
object workflow extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Long,List[Group],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userName: String, userId: Long, groups: List[Group], priviledge: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.75*/("""
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Document</title>
        <link href='"""),_display_(Seq[Any](/*7.22*/routes/*7.28*/.Assets.at("css/bootstrap.min.css"))),format.raw/*7.63*/("""' rel="stylesheet"/>
        <link href='"""),_display_(Seq[Any](/*8.22*/routes/*8.28*/.Assets.at("css/header.css"))),format.raw/*8.56*/("""' rel="stylesheet"/>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/jquery-1.1.js"))),format.raw/*9.59*/("""'></script>
    </head>
    <body>
        <div id="header">
        """),_display_(Seq[Any](/*13.10*/fixed/*13.15*/.header(userName, userId, userId, priviledge))),format.raw/*13.60*/("""
        </div>
        <div class="container">
            """),_display_(Seq[Any](/*16.14*/flashmsg())),format.raw/*16.24*/("""
            <h3>Create new workflow</h3>
            <hr>
            <div class="row">
                <div class="col-md-8">
                    <form class="form-horizontal" action=""""),_display_(Seq[Any](/*21.60*/routes/*21.66*/.WorkflowController.createFlow())),format.raw/*21.98*/("""" enctype="multipart/form-data" method="POST">
                        <input type="hidden" name="userID" value=""""),_display_(Seq[Any](/*22.68*/userId)),format.raw/*22.74*/("""">
                        <div class="form-group">
                            <label for="in-Title" class="col-sm-2 control-label">Title</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTitle" class="form-control" id="in-Title" placeholder="Title">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Category" class="col-sm-2 control-label">Category</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfCategory" class="form-control" id="in-Category" placeholder="Category">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Code" class="col-sm-2 control-label">Code</label>
                            <div class="col-sm-10">
                                <textarea type="text" name="wfCode" class="form-control" id="in-Code" placeholder="Code"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Desc" class="col-sm-2 control-label">Description</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfDesc" class="form-control" id="in-Desc" placeholder="Description">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Input" class="col-sm-2 control-label">Input</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfInput" class="form-control" id="in-Input" placeholder="Input&#09;(Separated by '|')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Output" class="col-sm-2 control-label">Output</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfOutput" class="form-control" id="in-Output" placeholder="Output&#09;(Separated by '|')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Tag" class="col-sm-2 control-label">Tags</label>
                            <div class="col-sm-10">
                                <input type="text" name="wfTag" class="form-control" id="in-Tag" placeholder="Tags   &#09;(Separated by ',')">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-File" class="col-sm-2 control-label">Image</label>
                            <div class="col-sm-10">
                                <input type="file" name="image" class="form-control" id="in-File">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="in-Select" class="col-sm-2 control-label">Group</label>
                            <div class="col-sm-10">
                                <select name="wfVisibility" id="in-Select" class="form-control">
                                    <option value="0">public</option>
                                    """),_display_(Seq[Any](/*76.38*/if(groups != null)/*76.56*/ {_display_(Seq[Any](format.raw/*76.58*/("""
                                        """),_display_(Seq[Any](/*77.42*/for( group <- groups) yield /*77.63*/ {_display_(Seq[Any](format.raw/*77.65*/("""
                                            <option value=""""),_display_(Seq[Any](/*78.61*/group/*78.66*/.getId)),format.raw/*78.72*/("""">"""),_display_(Seq[Any](/*78.75*/group/*78.80*/.getGroupName)),format.raw/*78.93*/("""</option>
                                        """)))})),format.raw/*79.42*/("""
                                    """)))})),format.raw/*80.38*/("""
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                    <h3>Import workflow from MyExperiment</h3>
                    <hr>
                    <form class="form-horizontal"  action="/workflow/import">
                        <div class="form-group">
                            <label for="in-Tag" class="col-sm-2 control-label">Workflow ID</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" name="wid"  placeholder="MyExperiment id">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-default">Submit</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
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
                    DATE: Fri Apr 29 02:45:52 UTC 2016
                    SOURCE: /sharedFolder/SA-D-Final-Code/Spring2016/ApacheCMDA-Frontend/app/views/workflow.scala.html
                    HASH: 2c454fa60b8de029676a0ee482a92d094017688a
                    MATRIX: 801->1|968->74|1132->203|1146->209|1202->244|1279->286|1293->292|1342->320|1420->363|1434->369|1485->399|1591->469|1605->474|1672->519|1769->580|1801->590|2024->777|2039->783|2093->815|2243->929|2271->935|5861->4489|5888->4507|5928->4509|6006->4551|6043->4572|6083->4574|6180->4635|6194->4640|6222->4646|6261->4649|6275->4654|6310->4667|6393->4718|6463->4756
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|41->13|41->13|41->13|44->16|44->16|49->21|49->21|49->21|50->22|50->22|104->76|104->76|104->76|105->77|105->77|105->77|106->78|106->78|106->78|106->78|106->78|106->78|107->79|108->80
                    -- GENERATED --
                */
            
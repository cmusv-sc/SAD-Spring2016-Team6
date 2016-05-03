package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import util.APICall;
import util.Constants;
//view webpage
import views.html.workflow;
import views.html.workflowdetail;
import views.html.timeline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IteratorPatternDemo extends Controller {
	public static Result main(Long wid) {
		PageRepository pageRepository = new PageRepository();
		Iterator iter = pageRepository.getIterator(wid);
		if(iter.hasNext()) {
			Workdetail page = (Workdetail)iter.next();
			return ok(workflowdetail.render(page.wf, page.commentRes, page.replyRes,  page.suggestionList, session("username"), Long.parseLong(session("id"))));
		} else {
			JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + "group/getGroupList/" + session("id") + "/json");
	        ArrayList<Group> groupArr = new ArrayList<Group>();
	        for (JsonNode n: response) {
	            Group g = new Group(n);
	            groupArr.add(g);
	        }
	        return ok(workflow.render(session("username"), Long.parseLong(session("id")), groupArr,session("priviledge")));

		}
	
	}
}
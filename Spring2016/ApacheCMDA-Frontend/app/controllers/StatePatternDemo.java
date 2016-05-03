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

import views.html.nopage;
import views.html.workflow;
import views.html.workflowdetail;
import views.html.timeline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StatePatternDemo extends Controller {
   public static Result main(Long offset) {
      NopageState noPageState = new NopageState(offset);
      ExistpageState existpageState = new ExistpageState(offset);
      long userID = Long.parseLong(session("id"));
      JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + "workflow/getTimeline/" + userID +
                "/offset/" +offset + "/json");
      List<Workflow> timelines;
      int timelineSize = response.get("size").asInt();
      //String responseState = response.get("state").textValue();
      if(timelineSize == 0) {
      	timelines = noPageState.doAction(offset);
         return ok(nopage.render(session("username"), Long.parseLong(session("id")), offset));
      } else {
         timelines = existpageState.doAction(offset);
       return ok(timeline.render(session("username"), Long.parseLong(session("id")), timelines, offset, session("priviledge")));
      }
   }
}
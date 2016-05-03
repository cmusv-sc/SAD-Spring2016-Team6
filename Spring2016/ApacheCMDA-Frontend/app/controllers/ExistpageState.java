package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.impl.conn.SystemDefaultDnsResolver;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import util.APICall;
import util.Constants;
import java.util.ArrayList;
import java.util.List;

import views.html.workflow;
import views.html.workflowdetail;
import views.html.timeline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExistpageState extends Controller implements State {
	final static Form<Workflow> f_wf = Form.form(Workflow.class);
    static int timelineSize = 0;
    Long offset;

    public ExistpageState(Long offset) {
		offset = this.offset;
	}

    @Override
	public List<Workflow> doAction(Long offset) {
		List<Workflow> timelines = getWorkflows(offset);
        return timelines;
	}

    private static List<Workflow> getWorkflows(Long offset) {
        Long userID = Long.parseLong(session("id"));
        JsonNode response = APICall.callAPI(Constants.NEW_BACKEND + "workflow/getTimeline/" + userID +
                "/offset/" +offset + "/json");
        if (response == null || response.has("error")) {
            return null;
        }

        List<Workflow> timelines = new ArrayList<>();
        timelineSize = response.get("size").asInt();
        JsonNode timeline = response.get("timeline");
        for (JsonNode n: timeline) {
            Workflow workflow = new Workflow(n);
            timelines.add(workflow);
        }
        if (timelines.size() == 0) {
            timelines = null;
        }

        return timelines;
    }

}





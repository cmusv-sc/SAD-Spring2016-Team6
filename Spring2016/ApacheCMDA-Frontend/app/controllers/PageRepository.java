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

import views.html.forum;
import views.html.workflow;
import views.html.workflow_edit;
import views.html.workflowdetail;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;



public class PageRepository extends Controller implements Container {

	@Override
	public Iterator getIterator(Long wid) {
		return new PageIterator(wid);
	}

	private class PageIterator implements Iterator {
		Long wid;
		private PageIterator(Long wid) {
			this.wid = wid;
		}
        
		@Override
		public boolean hasNext() {
            Long nextId = wid + 1;
			JsonNode wfres = APICall.callAPI(Constants.NEW_BACKEND + "workflow/get/workflowID/" + nextId.toString() + "/userID/" + session("id") + "/json");
			if(wfres == null || wfres.has("error")){
                flash("error", wfres.get("error").textValue());
	            return false;
	        }
	        return true;
		}

		@Override
		public Workdetail next() {
			if(this.hasNext()){
	        	return workflowDetail(wid + 1);
	        }
	        return null;
		}
	}

	private static Workdetail workflowDetail(Long wid) {
        JsonNode wfres = APICall.callAPI(Constants.NEW_BACKEND + "workflow/get/workflowID/" + wid.toString() + "/userID/" + session("id") + "/json");

        Workflow wf = new Workflow(wfres);

        JsonNode commentList = APICall.callAPI(Constants.NEW_BACKEND + "workflow/getComments/"
                + wid.toString());

        List<Comment> commentRes = new ArrayList<>();
        List<List<Reply>> replyRes = new ArrayList<>();

        for (int i = 0; i < commentList.size(); i++) {
            JsonNode node = commentList.get(i);
            Comment comment = new Comment(node);
            commentRes.add(comment);
            Long commentId = comment.getId();
            JsonNode replyList = APICall.callAPI(Constants.NEW_BACKEND + "Comment/getReply/"
                    + commentId.toString());
            List<Reply> listReply = new ArrayList<>();
            for (int j = 0; j < replyList.size(); j++) {
                JsonNode rNode = replyList.get(j);
                Reply reply = new Reply(rNode);
                listReply.add(reply);
            }
            replyRes.add(listReply);
        }

        JsonNode suggetionNode = APICall.callAPI(Constants.NEW_BACKEND + "suggestion/getSuggestionForWorkflow/" + wid.toString());
        List<Suggestion> suggestionList = new ArrayList<>();
        for (JsonNode n: suggetionNode) {
            Suggestion cur = new Suggestion(n);
            suggestionList.add(cur);
        }
        
        Workdetail detail = new Workdetail(wf, commentRes, replyRes, suggestionList);
        return detail;
    }

}
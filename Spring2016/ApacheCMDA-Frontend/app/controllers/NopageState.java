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

public class NopageState extends Controller implements State {
	Long offset;
	public NopageState(Long offset) {
		offset = this.offset;
	}

	@Override
   public List<Workflow> doAction(Long offset) {
   	return null;      
   }  
}
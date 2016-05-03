package models;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.*;

public class Workdetail {
	public Workflow wf;
	public List<Comment> commentRes;
	public List<List<Reply>> replyRes;
	public List<Suggestion> suggestionList;

	public Workdetail (Workflow wf, List<Comment> commentRes, List<List<Reply>> replyRes, List<Suggestion> suggestionList) {
		this.wf = wf;
		this.commentRes = commentRes;
		this.replyRes = replyRes;
		this.suggestionList = suggestionList;
	}
}
package models;

import java.util.List;
import java.util.ArrayList;

public interface State {
   public List<Workflow> doAction(Long offset);
}
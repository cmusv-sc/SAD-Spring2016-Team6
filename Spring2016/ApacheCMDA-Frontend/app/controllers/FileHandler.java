package controllers;

import play.mvc.Http;

/**
 * Created by Wenlu on 4/22/16.
 */
public interface FileHandler {
    String  handleUploadFile( String type, Http.MultipartFormData.FilePart uploadFile );
}

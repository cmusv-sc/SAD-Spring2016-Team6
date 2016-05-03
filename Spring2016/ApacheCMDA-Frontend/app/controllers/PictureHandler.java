package controllers;

import play.mvc.Http;

/**
 * Created by Wenlu on 4/22/16.
 */
public interface PictureHandler {
    public String handleUploadPicture( String type, Http.MultipartFormData.FilePart uploadFile );
}

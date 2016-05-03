package controllers;

import play.mvc.Http;

/**
 * Created by Wenlu on 4/22/16.
 */
public class UplodeFileAdapter implements PictureHandler {
    FileHandler fileHandler;
    UplodeFileAdapter(String type){
        fileHandler = new File();
    }
    @Override
    public String handleUploadPicture(String type, Http.MultipartFormData.FilePart uploadFile) {
        return fileHandler.handleUploadFile( type, uploadFile );
    }
}

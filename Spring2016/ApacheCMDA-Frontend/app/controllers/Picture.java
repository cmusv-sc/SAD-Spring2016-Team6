package controllers;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import play.mvc.Http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Wenlu on 4/22/16.
 */
public class Picture implements PictureHandler{
        UplodeFileAdapter adapter;

        public String handleUploadPicture( String type, Http.MultipartFormData.FilePart uploadFile ){
            String imgPathToSave = "";

            switch(type) {
                case "picture":
                    if (uploadFile != null) {
                        String fileName = uploadFile.getFilename();
                        // String contentType = image.getContentType();
                        java.io.File file = uploadFile.getFile();
                        String ext = FilenameUtils.getExtension(fileName);
                        imgPathToSave = "public/images/" + "image_" + UUID.randomUUID() + "." + ext;

                        // boolean success = new File("images").mkdirs();
                        try {
                            byte[] bytes = IOUtils.toByteArray(new FileInputStream(file));
                            FileUtils.writeByteArrayToFile(new File(imgPathToSave), bytes);
                            imgPathToSave = "/" + imgPathToSave;
                        } catch (IOException e) {
                            imgPathToSave = "/public/images/service.jpeg";
                        }
                    } else {
                        imgPathToSave = "/public/images/service.jpeg";
                    }
                case "pdf":
                    adapter = new UplodeFileAdapter("pdf");
                    imgPathToSave = adapter.handleUploadPicture("pdf", uploadFile);
            }

            imgPathToSave = imgPathToSave.replaceFirst("public", "assets");
            return imgPathToSave;
        }
}

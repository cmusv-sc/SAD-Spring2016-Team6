package controllers;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import play.mvc.Http;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Wenlu on 4/22/16.
 */
public class File implements FileHandler{

    public  String handleUploadFile( String type, Http.MultipartFormData.FilePart uploadFile ) {
        String filePathToSave = "";

        if (uploadFile != null) {
            String fileName = uploadFile.getFilename();
            // String contentType = image.getContentType();
            java.io.File file = uploadFile.getFile();
            String ext = FilenameUtils.getExtension(fileName);
            filePathToSave = "public/images/" + "image_" + UUID.randomUUID() + "." + ext;

            // boolean success = new File("images").mkdirs();
            try {
                byte[] bytes = IOUtils.toByteArray(new FileInputStream(file));
                FileUtils.writeByteArrayToFile(new java.io.File(filePathToSave), bytes);
                filePathToSave = "/" + filePathToSave;
            } catch (IOException e) {
                filePathToSave = "/public/images/service.jpeg";
            }
        } else {
            filePathToSave = "/public/images/service.jpeg";
        }

        // do something else for pdf resume

        return filePathToSave;
    }
}

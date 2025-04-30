package upload;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UploadTests extends BaseTests {
    @Test
    public void testUploadFile(){
        var uploadPage = homePage.clickUpload();
        uploadPage.uploadFile("/home/mohammad-abbas/Pictures/Screenshots/Screenshot from 2025-02-23 23-45-08.png");
        Assertions.assertEquals(uploadPage.getUploadedFiles(),"Screenshot from 2025-02-23 23-45-08.png");
    }

}

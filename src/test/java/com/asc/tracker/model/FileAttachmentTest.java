package com.asc.tracker.model;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import com.asc.tracker.builders.FileAttachmentBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileAttachmentTest {

  public static final String FILENAME = "filename";

  public static final boolean THUMBNAILABLE = true;

  public static final int HEIGHT = 100;

  public static final int WIDTH = 100;

  public static final int SIZE = 100;

  public static final String HTTP_DOWNLOAD_COM = "http://download.com";

  public static final String CONTENT_TYPE = "content type";

  public static final boolean UPLOADED = true;

  public static final String BIG_URL = "big_url";

  public static final String THUMBNAIL_URL = "thumbnail_url";

  public static final int UPLOADER_ID = 1;

  FileAttachment fileAttachment;

  @Before
  public void setup() {
    fileAttachment = new FileAttachmentBuilder().withFilename(FILENAME)
        .withUploaderId(UPLOADER_ID)
        .withThumbnailable(THUMBNAILABLE)
        .withHeight(HEIGHT)
        .withWidth(WIDTH)
        .withSize(SIZE)
        .withDownloadUrl(HTTP_DOWNLOAD_COM)
        .withContentType(CONTENT_TYPE)
        .withUploaded(UPLOADED)
        .withBigUrl(BIG_URL)
        .withThumbnailUrl(THUMBNAIL_URL)
        .createFileAttachment();
  }

  @Test
  public void testStoryToJson() throws IOException {
    String fileAttachmentJson = fileAttachment.toJson();

    assertThat(fileAttachmentJson).isNotNull();

    Map<String, Object> result = new ObjectMapper().readValue(fileAttachmentJson,
        new TypeReference<HashMap<String, Object>>() {
        });

    assertThat(result.get("filename")).isEqualTo(FILENAME);
    assertThat(result.get("uploader_id")).isEqualTo(UPLOADER_ID);
    assertThat(result.get("thumbnailable")).isEqualTo(THUMBNAILABLE);
    assertThat(result.get("height")).isEqualTo(HEIGHT);
    assertThat(result.get("width")).isEqualTo(WIDTH);
    assertThat(result.get("size")).isEqualTo(SIZE);
    assertThat(result.get("download_url")).isEqualTo(HTTP_DOWNLOAD_COM);
    assertThat(result.get("content_type")).isEqualTo(CONTENT_TYPE);
    assertThat(result.get("uploaded")).isEqualTo(UPLOADED);
    assertThat(result.get("big_url")).isEqualTo(BIG_URL);
    assertThat(result.get("thumbnail_url")).isEqualTo(THUMBNAIL_URL);
  }
}
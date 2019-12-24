package com.uddernetworks.holysheet.socket.payload;

import com.uddernetworks.holysheet.socket.PayloadType;

/**
 * <pre>Client --> Server</pre>
 * A request to upload a given file.
 * <pre>
 *      {
 *          "file": "file:///c:/file.txt",
 *          "upload": "multipart",
 *          "compression": "zip"
 *      }
 * </pre>
 *
 * <table>
 * <thead>
 * <tr><th>Key</th><th>Value</th><th>Description</th></tr></thead>
 * <tbody><tr><td>file</td><td>URL</td><td>The URL of the file to upload</td></tr><tr><td>upload</td><td><code>(multipart\|direct)</code></td><td>Toggles multipart or direct uploading (Multipart recommended)</td></tr><tr><td>compression</td><td><code>(none\|zip)</code></td><td>The compression algorithm to use, if any.</td></tr></tbody>
 * </table>
 *
 * @see PayloadType#UPLOAD_REQUEST
 */
public class UploadRequest extends BasicPayload {

    private String file;
    private String upload;
    private String compression;

    public UploadRequest(int code, String message, String state, String file) {
        super(code, PayloadType.UPLOAD_REQUEST, message, state);
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public String getUpload() {
        return upload;
    }

    public String getCompression() {
        return compression;
    }

    @Override
    public String toString() {
        return "UploadRequest{" +
                "file='" + file + '\'' +
                ", upload='" + upload + '\'' +
                ", compression='" + compression + '\'' +
                '}';
    }
}
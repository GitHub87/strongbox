package org.carlspring.strongbox.services;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mtodorov
 */
public interface ArtifactManagementService
{

    void store(String storageId,
               String repositoryId,
               String path,
               InputStream is)
            throws IOException;

    InputStream resolve(String storageId,
                        String repositoryId,
                        String path)
            throws IOException;

    void delete(String storageId,
                String repositoryId,
                String artifactPath,
                boolean force)
            throws IOException;

    void deleteTrash(String storageId, String repositoryId)
            throws IOException;

    void deleteTrash()
            throws IOException;

}
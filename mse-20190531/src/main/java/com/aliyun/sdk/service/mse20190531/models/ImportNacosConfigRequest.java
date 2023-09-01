// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>ImportNacosConfigRequest</p>
 */
public class ImportNacosConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("FileUrl")
    @Validation(required = true)
    private String fileUrl;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("Policy")
    private String policy;

    private ImportNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.fileUrl = builder.fileUrl;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportNacosConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<ImportNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String fileUrl; 
        private String instanceId; 
        private String namespaceId; 
        private String policy; 

        private Builder() {
            super();
        } 

        private Builder(ImportNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.fileUrl = request.fileUrl;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.policy = request.policy;
        } 

        /**
         * The data structure.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder fileUrl(String fileUrl) {
            this.putQueryParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The policy.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * The URL of the file, which must be the URL generated by MSE. If the URL is not generated by MSE, a message stating that the required permissions on the API are not obtained is displayed. Perform the following steps to obtain the URL:
         * <p>
         * 
         * 1\. Call the GetImportFileUrl operation to obtain the URL.
         * 
         * 2\. Upload the file to the OSS address returned by the GetImportFileUrl operation.
         * 
         * 3\. Call the ImportNacosConfig operation to import the file.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public ImportNacosConfigRequest build() {
            return new ImportNacosConfigRequest(this);
        } 

    } 

}

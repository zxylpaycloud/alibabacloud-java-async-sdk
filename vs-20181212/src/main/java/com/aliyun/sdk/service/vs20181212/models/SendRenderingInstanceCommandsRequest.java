// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendRenderingInstanceCommandsRequest} extends {@link RequestModel}
 *
 * <p>SendRenderingInstanceCommandsRequest</p>
 */
public class SendRenderingInstanceCommandsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Commands")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commands;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private SendRenderingInstanceCommandsRequest(Builder builder) {
        super(builder);
        this.commands = builder.commands;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRenderingInstanceCommandsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commands
     */
    public String getCommands() {
        return this.commands;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<SendRenderingInstanceCommandsRequest, Builder> {
        private String commands; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SendRenderingInstanceCommandsRequest request) {
            super(request);
            this.commands = request.commands;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * Commands.
         */
        public Builder commands(String commands) {
            this.putBodyParameter("Commands", commands);
            this.commands = commands;
            return this;
        }

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public SendRenderingInstanceCommandsRequest build() {
            return new SendRenderingInstanceCommandsRequest(this);
        } 

    } 

}

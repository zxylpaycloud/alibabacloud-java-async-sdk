// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerPlaybookRequest} extends {@link RequestModel}
 *
 * <p>TriggerPlaybookRequest</p>
 */
public class TriggerPlaybookRequest extends Request {
    @Body
    @NameInMap("InputParam")
    @Validation(required = true)
    private String inputParam;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private TriggerPlaybookRequest(Builder builder) {
        super(builder);
        this.inputParam = builder.inputParam;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerPlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputParam
     */
    public String getInputParam() {
        return this.inputParam;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<TriggerPlaybookRequest, Builder> {
        private String inputParam; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(TriggerPlaybookRequest request) {
            super(request);
            this.inputParam = request.inputParam;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * InputParam.
         */
        public Builder inputParam(String inputParam) {
            this.putBodyParameter("InputParam", inputParam);
            this.inputParam = inputParam;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public TriggerPlaybookRequest build() {
            return new TriggerPlaybookRequest(this);
        } 

    } 

}

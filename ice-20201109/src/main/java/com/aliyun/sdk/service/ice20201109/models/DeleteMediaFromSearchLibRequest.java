// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaFromSearchLibRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaFromSearchLibRequest</p>
 */
public class DeleteMediaFromSearchLibRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MsgBody")
    private String msgBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    private DeleteMediaFromSearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.mediaId = builder.mediaId;
        this.msgBody = builder.msgBody;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaFromSearchLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return msgBody
     */
    public String getMsgBody() {
        return this.msgBody;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<DeleteMediaFromSearchLibRequest, Builder> {
        private String regionId; 
        private String mediaId; 
        private String msgBody; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaFromSearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.mediaId = request.mediaId;
            this.msgBody = request.msgBody;
            this.searchLibName = request.searchLibName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MsgBody.
         */
        public Builder msgBody(String msgBody) {
            this.putQueryParameter("MsgBody", msgBody);
            this.msgBody = msgBody;
            return this;
        }

        /**
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public DeleteMediaFromSearchLibRequest build() {
            return new DeleteMediaFromSearchLibRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocStructureResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocStructureResultRequest</p>
 */
public class GetDocStructureResultRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("ImageStrategy")
    private String imageStrategy;

    @Query
    @NameInMap("RevealMarkdown")
    private Boolean revealMarkdown;

    private GetDocStructureResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.imageStrategy = builder.imageStrategy;
        this.revealMarkdown = builder.revealMarkdown;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocStructureResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imageStrategy
     */
    public String getImageStrategy() {
        return this.imageStrategy;
    }

    /**
     * @return revealMarkdown
     */
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

    public static final class Builder extends Request.Builder<GetDocStructureResultRequest, Builder> {
        private String id; 
        private String imageStrategy; 
        private Boolean revealMarkdown; 

        private Builder() {
            super();
        } 

        private Builder(GetDocStructureResultRequest request) {
            super(request);
            this.id = request.id;
            this.imageStrategy = request.imageStrategy;
            this.revealMarkdown = request.revealMarkdown;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ImageStrategy.
         */
        public Builder imageStrategy(String imageStrategy) {
            this.putQueryParameter("ImageStrategy", imageStrategy);
            this.imageStrategy = imageStrategy;
            return this;
        }

        /**
         * RevealMarkdown.
         */
        public Builder revealMarkdown(Boolean revealMarkdown) {
            this.putQueryParameter("RevealMarkdown", revealMarkdown);
            this.revealMarkdown = revealMarkdown;
            return this;
        }

        @Override
        public GetDocStructureResultRequest build() {
            return new GetDocStructureResultRequest(this);
        } 

    } 

}

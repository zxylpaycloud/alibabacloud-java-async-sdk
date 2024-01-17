// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMaterialDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListMaterialDocumentsRequest</p>
 */
public class ListMaterialDocumentsRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("CreateTimeEnd")
    private String createTimeEnd;

    @Body
    @NameInMap("CreateTimeStart")
    private String createTimeStart;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("DocType")
    private String docType;

    @Body
    @NameInMap("DocTypeList")
    private java.util.List < String > docTypeList;

    @Body
    @NameInMap("GeneratePublicUrl")
    private Boolean generatePublicUrl;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("Keywords")
    private java.util.List < String > keywords;

    @Body
    @NameInMap("Query")
    private String query;

    @Body
    @NameInMap("ShareAttr")
    private Integer shareAttr;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("UpdateTimeEnd")
    private String updateTimeEnd;

    @Body
    @NameInMap("UpdateTimeStart")
    private String updateTimeStart;

    private ListMaterialDocumentsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.current = builder.current;
        this.docType = builder.docType;
        this.docTypeList = builder.docTypeList;
        this.generatePublicUrl = builder.generatePublicUrl;
        this.id = builder.id;
        this.keywords = builder.keywords;
        this.query = builder.query;
        this.shareAttr = builder.shareAttr;
        this.size = builder.size;
        this.title = builder.title;
        this.updateTimeEnd = builder.updateTimeEnd;
        this.updateTimeStart = builder.updateTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMaterialDocumentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return docType
     */
    public String getDocType() {
        return this.docType;
    }

    /**
     * @return docTypeList
     */
    public java.util.List < String > getDocTypeList() {
        return this.docTypeList;
    }

    /**
     * @return generatePublicUrl
     */
    public Boolean getGeneratePublicUrl() {
        return this.generatePublicUrl;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return keywords
     */
    public java.util.List < String > getKeywords() {
        return this.keywords;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return shareAttr
     */
    public Integer getShareAttr() {
        return this.shareAttr;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTimeEnd
     */
    public String getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    /**
     * @return updateTimeStart
     */
    public String getUpdateTimeStart() {
        return this.updateTimeStart;
    }

    public static final class Builder extends Request.Builder<ListMaterialDocumentsRequest, Builder> {
        private String agentKey; 
        private String content; 
        private String createTimeEnd; 
        private String createTimeStart; 
        private Integer current; 
        private String docType; 
        private java.util.List < String > docTypeList; 
        private Boolean generatePublicUrl; 
        private Long id; 
        private java.util.List < String > keywords; 
        private String query; 
        private Integer shareAttr; 
        private Integer size; 
        private String title; 
        private String updateTimeEnd; 
        private String updateTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(ListMaterialDocumentsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.current = request.current;
            this.docType = request.docType;
            this.docTypeList = request.docTypeList;
            this.generatePublicUrl = request.generatePublicUrl;
            this.id = request.id;
            this.keywords = request.keywords;
            this.query = request.query;
            this.shareAttr = request.shareAttr;
            this.size = request.size;
            this.title = request.title;
            this.updateTimeEnd = request.updateTimeEnd;
            this.updateTimeStart = request.updateTimeStart;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * CreateTimeEnd.
         */
        public Builder createTimeEnd(String createTimeEnd) {
            this.putBodyParameter("CreateTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * CreateTimeStart.
         */
        public Builder createTimeStart(String createTimeStart) {
            this.putBodyParameter("CreateTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * DocType.
         */
        public Builder docType(String docType) {
            this.putBodyParameter("DocType", docType);
            this.docType = docType;
            return this;
        }

        /**
         * DocTypeList.
         */
        public Builder docTypeList(java.util.List < String > docTypeList) {
            String docTypeListShrink = shrink(docTypeList, "DocTypeList", "json");
            this.putBodyParameter("DocTypeList", docTypeListShrink);
            this.docTypeList = docTypeList;
            return this;
        }

        /**
         * GeneratePublicUrl.
         */
        public Builder generatePublicUrl(Boolean generatePublicUrl) {
            this.putBodyParameter("GeneratePublicUrl", generatePublicUrl);
            this.generatePublicUrl = generatePublicUrl;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List < String > keywords) {
            String keywordsShrink = shrink(keywords, "Keywords", "json");
            this.putBodyParameter("Keywords", keywordsShrink);
            this.keywords = keywords;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * ShareAttr.
         */
        public Builder shareAttr(Integer shareAttr) {
            this.putBodyParameter("ShareAttr", shareAttr);
            this.shareAttr = shareAttr;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UpdateTimeEnd.
         */
        public Builder updateTimeEnd(String updateTimeEnd) {
            this.putBodyParameter("UpdateTimeEnd", updateTimeEnd);
            this.updateTimeEnd = updateTimeEnd;
            return this;
        }

        /**
         * UpdateTimeStart.
         */
        public Builder updateTimeStart(String updateTimeStart) {
            this.putBodyParameter("UpdateTimeStart", updateTimeStart);
            this.updateTimeStart = updateTimeStart;
            return this;
        }

        @Override
        public ListMaterialDocumentsRequest build() {
            return new ListMaterialDocumentsRequest(this);
        } 

    } 

}

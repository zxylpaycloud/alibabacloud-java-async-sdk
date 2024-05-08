// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReportRequest} extends {@link RequestModel}
 *
 * <p>CreateReportRequest</p>
 */
public class CreateReportRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contents")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Contents> contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DdFrom")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ddFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToChat")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean toChat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToCids")
    private java.util.List < String > toCids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToUserids")
    private java.util.List < String > toUserids;

    private CreateReportRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.contents = builder.contents;
        this.ddFrom = builder.ddFrom;
        this.templateId = builder.templateId;
        this.tenantContext = builder.tenantContext;
        this.toChat = builder.toChat;
        this.toCids = builder.toCids;
        this.toUserids = builder.toUserids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return contents
     */
    public java.util.List < Contents> getContents() {
        return this.contents;
    }

    /**
     * @return ddFrom
     */
    public String getDdFrom() {
        return this.ddFrom;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return toChat
     */
    public Boolean getToChat() {
        return this.toChat;
    }

    /**
     * @return toCids
     */
    public java.util.List < String > getToCids() {
        return this.toCids;
    }

    /**
     * @return toUserids
     */
    public java.util.List < String > getToUserids() {
        return this.toUserids;
    }

    public static final class Builder extends Request.Builder<CreateReportRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < Contents> contents; 
        private String ddFrom; 
        private String templateId; 
        private TenantContext tenantContext; 
        private Boolean toChat; 
        private java.util.List < String > toCids; 
        private java.util.List < String > toUserids; 

        private Builder() {
            super();
        } 

        private Builder(CreateReportRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.contents = request.contents;
            this.ddFrom = request.ddFrom;
            this.templateId = request.templateId;
            this.tenantContext = request.tenantContext;
            this.toChat = request.toChat;
            this.toCids = request.toCids;
            this.toUserids = request.toUserids;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * Contents.
         */
        public Builder contents(java.util.List < Contents> contents) {
            String contentsShrink = shrink(contents, "Contents", "json");
            this.putBodyParameter("Contents", contentsShrink);
            this.contents = contents;
            return this;
        }

        /**
         * DdFrom.
         */
        public Builder ddFrom(String ddFrom) {
            this.putBodyParameter("DdFrom", ddFrom);
            this.ddFrom = ddFrom;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * ToChat.
         */
        public Builder toChat(Boolean toChat) {
            this.putBodyParameter("ToChat", toChat);
            this.toChat = toChat;
            return this;
        }

        /**
         * ToCids.
         */
        public Builder toCids(java.util.List < String > toCids) {
            String toCidsShrink = shrink(toCids, "ToCids", "json");
            this.putBodyParameter("ToCids", toCidsShrink);
            this.toCids = toCids;
            return this;
        }

        /**
         * ToUserids.
         */
        public Builder toUserids(java.util.List < String > toUserids) {
            String toUseridsShrink = shrink(toUserids, "ToUserids", "json");
            this.putBodyParameter("ToUserids", toUseridsShrink);
            this.toUserids = toUserids;
            return this;
        }

        @Override
        public CreateReportRequest build() {
            return new CreateReportRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Sort")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long sort;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long type;

        private Contents(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.key = builder.key;
            this.sort = builder.sort;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return sort
         */
        public Long getSort() {
            return this.sort;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private String key; 
            private Long sort; 
            private Long type; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Sort.
             */
            public Builder sort(Long sort) {
                this.sort = sort;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}

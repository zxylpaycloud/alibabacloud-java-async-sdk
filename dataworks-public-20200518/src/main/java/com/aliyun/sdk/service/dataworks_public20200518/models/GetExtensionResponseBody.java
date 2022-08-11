// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExtensionResponseBody} extends {@link TeaModel}
 *
 * <p>GetExtensionResponseBody</p>
 */
public class GetExtensionResponseBody extends TeaModel {
    @NameInMap("Extension")
    private Extension extension;

    @NameInMap("RequestId")
    private String requestId;

    private GetExtensionResponseBody(Builder builder) {
        this.extension = builder.extension;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExtensionResponseBody create() {
        return builder().build();
    }

    /**
     * @return extension
     */
    public Extension getExtension() {
        return this.extension;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Extension extension; 
        private String requestId; 

        /**
         * Extension.
         */
        public Builder extension(Extension extension) {
            this.extension = extension;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExtensionResponseBody build() {
            return new GetExtensionResponseBody(this);
        } 

    } 

    public static class BindEventList extends TeaModel {
        @NameInMap("EventCode")
        private String eventCode;

        @NameInMap("EventName")
        private String eventName;

        private BindEventList(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindEventList create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            public BindEventList build() {
                return new BindEventList(this);
            } 

        } 

    }
    public static class EventCategoryList extends TeaModel {
        @NameInMap("CategoryCode")
        private String categoryCode;

        @NameInMap("CategoryName")
        private String categoryName;

        private EventCategoryList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryName = builder.categoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCategoryList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public String getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        public static final class Builder {
            private String categoryCode; 
            private String categoryName; 

            /**
             * CategoryCode.
             */
            public Builder categoryCode(String categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            public EventCategoryList build() {
                return new EventCategoryList(this);
            } 

        } 

    }
    public static class Extension extends TeaModel {
        @NameInMap("BindEventList")
        private java.util.List < BindEventList> bindEventList;

        @NameInMap("DetailUrl")
        private String detailUrl;

        @NameInMap("EventCategoryList")
        private java.util.List < EventCategoryList> eventCategoryList;

        @NameInMap("ExtensionCode")
        private String extensionCode;

        @NameInMap("ExtensionDesc")
        private String extensionDesc;

        @NameInMap("ExtensionName")
        private String extensionName;

        @NameInMap("HelpDocUrl")
        private String helpDocUrl;

        @NameInMap("OptionSetting")
        private String optionSetting;

        @NameInMap("ParameterSetting")
        private String parameterSetting;

        @NameInMap("ProjectTesting")
        private Long projectTesting;

        @NameInMap("Status")
        private Integer status;

        private Extension(Builder builder) {
            this.bindEventList = builder.bindEventList;
            this.detailUrl = builder.detailUrl;
            this.eventCategoryList = builder.eventCategoryList;
            this.extensionCode = builder.extensionCode;
            this.extensionDesc = builder.extensionDesc;
            this.extensionName = builder.extensionName;
            this.helpDocUrl = builder.helpDocUrl;
            this.optionSetting = builder.optionSetting;
            this.parameterSetting = builder.parameterSetting;
            this.projectTesting = builder.projectTesting;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extension create() {
            return builder().build();
        }

        /**
         * @return bindEventList
         */
        public java.util.List < BindEventList> getBindEventList() {
            return this.bindEventList;
        }

        /**
         * @return detailUrl
         */
        public String getDetailUrl() {
            return this.detailUrl;
        }

        /**
         * @return eventCategoryList
         */
        public java.util.List < EventCategoryList> getEventCategoryList() {
            return this.eventCategoryList;
        }

        /**
         * @return extensionCode
         */
        public String getExtensionCode() {
            return this.extensionCode;
        }

        /**
         * @return extensionDesc
         */
        public String getExtensionDesc() {
            return this.extensionDesc;
        }

        /**
         * @return extensionName
         */
        public String getExtensionName() {
            return this.extensionName;
        }

        /**
         * @return helpDocUrl
         */
        public String getHelpDocUrl() {
            return this.helpDocUrl;
        }

        /**
         * @return optionSetting
         */
        public String getOptionSetting() {
            return this.optionSetting;
        }

        /**
         * @return parameterSetting
         */
        public String getParameterSetting() {
            return this.parameterSetting;
        }

        /**
         * @return projectTesting
         */
        public Long getProjectTesting() {
            return this.projectTesting;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < BindEventList> bindEventList; 
            private String detailUrl; 
            private java.util.List < EventCategoryList> eventCategoryList; 
            private String extensionCode; 
            private String extensionDesc; 
            private String extensionName; 
            private String helpDocUrl; 
            private String optionSetting; 
            private String parameterSetting; 
            private Long projectTesting; 
            private Integer status; 

            /**
             * BindEventList.
             */
            public Builder bindEventList(java.util.List < BindEventList> bindEventList) {
                this.bindEventList = bindEventList;
                return this;
            }

            /**
             * DetailUrl.
             */
            public Builder detailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
                return this;
            }

            /**
             * EventCategoryList.
             */
            public Builder eventCategoryList(java.util.List < EventCategoryList> eventCategoryList) {
                this.eventCategoryList = eventCategoryList;
                return this;
            }

            /**
             * ExtensionCode.
             */
            public Builder extensionCode(String extensionCode) {
                this.extensionCode = extensionCode;
                return this;
            }

            /**
             * ExtensionDesc.
             */
            public Builder extensionDesc(String extensionDesc) {
                this.extensionDesc = extensionDesc;
                return this;
            }

            /**
             * ExtensionName.
             */
            public Builder extensionName(String extensionName) {
                this.extensionName = extensionName;
                return this;
            }

            /**
             * HelpDocUrl.
             */
            public Builder helpDocUrl(String helpDocUrl) {
                this.helpDocUrl = helpDocUrl;
                return this;
            }

            /**
             * OptionSetting.
             */
            public Builder optionSetting(String optionSetting) {
                this.optionSetting = optionSetting;
                return this;
            }

            /**
             * ParameterSetting.
             */
            public Builder parameterSetting(String parameterSetting) {
                this.parameterSetting = parameterSetting;
                return this;
            }

            /**
             * ProjectTesting.
             */
            public Builder projectTesting(Long projectTesting) {
                this.projectTesting = projectTesting;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Extension build() {
                return new Extension(this);
            } 

        } 

    }
}

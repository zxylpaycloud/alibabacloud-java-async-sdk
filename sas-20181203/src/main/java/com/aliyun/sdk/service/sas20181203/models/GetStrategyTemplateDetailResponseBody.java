// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStrategyTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStrategyTemplateDetailResponseBody</p>
 */
public class GetStrategyTemplateDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetStrategyTemplateDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStrategyTemplateDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStrategyTemplateDetailResponseBody build() {
            return new GetStrategyTemplateDetailResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private Item(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Baseline extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        @NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

        private Baseline(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Baseline create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < Item> item; 
            private java.util.List < String > riskLevel; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Baseline build() {
                return new Baseline(this);
            } 

        } 

    }
    public static class MaliciousFileItem extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private MaliciousFileItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaliciousFileItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MaliciousFileItem build() {
                return new MaliciousFileItem(this);
            } 

        } 

    }
    public static class MaliciousFile extends TeaModel {
        @NameInMap("Item")
        private java.util.List < MaliciousFileItem> item;

        @NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

        private MaliciousFile(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaliciousFile create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < MaliciousFileItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < MaliciousFileItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * Item.
             */
            public Builder item(java.util.List < MaliciousFileItem> item) {
                this.item = item;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public MaliciousFile build() {
                return new MaliciousFile(this);
            } 

        } 

    }
    public static class VulItem extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        private VulItem(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulItem create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VulItem build() {
                return new VulItem(this);
            } 

        } 

    }
    public static class Vul extends TeaModel {
        @NameInMap("Item")
        private java.util.List < VulItem> item;

        @NameInMap("RiskLevel")
        private java.util.List < String > riskLevel;

        private Vul(Builder builder) {
            this.item = builder.item;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vul create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < VulItem> getItem() {
            return this.item;
        }

        /**
         * @return riskLevel
         */
        public java.util.List < String > getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List < VulItem> item; 
            private java.util.List < String > riskLevel; 

            /**
             * Item.
             */
            public Builder item(java.util.List < VulItem> item) {
                this.item = item;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(java.util.List < String > riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Vul build() {
                return new Vul(this);
            } 

        } 

    }
    public static class AlarmDetail extends TeaModel {
        @NameInMap("Baseline")
        private Baseline baseline;

        @NameInMap("MaliciousFile")
        private MaliciousFile maliciousFile;

        @NameInMap("Vul")
        private Vul vul;

        private AlarmDetail(Builder builder) {
            this.baseline = builder.baseline;
            this.maliciousFile = builder.maliciousFile;
            this.vul = builder.vul;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmDetail create() {
            return builder().build();
        }

        /**
         * @return baseline
         */
        public Baseline getBaseline() {
            return this.baseline;
        }

        /**
         * @return maliciousFile
         */
        public MaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        /**
         * @return vul
         */
        public Vul getVul() {
            return this.vul;
        }

        public static final class Builder {
            private Baseline baseline; 
            private MaliciousFile maliciousFile; 
            private Vul vul; 

            /**
             * Baseline.
             */
            public Builder baseline(Baseline baseline) {
                this.baseline = baseline;
                return this;
            }

            /**
             * MaliciousFile.
             */
            public Builder maliciousFile(MaliciousFile maliciousFile) {
                this.maliciousFile = maliciousFile;
                return this;
            }

            /**
             * Vul.
             */
            public Builder vul(Vul vul) {
                this.vul = vul;
                return this;
            }

            public AlarmDetail build() {
                return new AlarmDetail(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlarmDetail")
        private AlarmDetail alarmDetail;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageName")
        private java.util.List < String > imageName;

        @NameInMap("Label")
        private java.util.List < String > label;

        @NameInMap("MaliciousImage")
        private Boolean maliciousImage;

        @NameInMap("Namespace")
        private java.util.List < String > namespace;

        @NameInMap("RuleAction")
        private Integer ruleAction;

        @NameInMap("StrategyId")
        private Long strategyId;

        @NameInMap("StrategyName")
        private String strategyName;

        @NameInMap("StrategyTemplateId")
        private Long strategyTemplateId;

        @NameInMap("UnScanedImage")
        private Boolean unScanedImage;

        @NameInMap("WhiteList")
        private java.util.List < String > whiteList;

        private Data(Builder builder) {
            this.alarmDetail = builder.alarmDetail;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.description = builder.description;
            this.imageName = builder.imageName;
            this.label = builder.label;
            this.maliciousImage = builder.maliciousImage;
            this.namespace = builder.namespace;
            this.ruleAction = builder.ruleAction;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.strategyTemplateId = builder.strategyTemplateId;
            this.unScanedImage = builder.unScanedImage;
            this.whiteList = builder.whiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmDetail
         */
        public AlarmDetail getAlarmDetail() {
            return this.alarmDetail;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageName
         */
        public java.util.List < String > getImageName() {
            return this.imageName;
        }

        /**
         * @return label
         */
        public java.util.List < String > getLabel() {
            return this.label;
        }

        /**
         * @return maliciousImage
         */
        public Boolean getMaliciousImage() {
            return this.maliciousImage;
        }

        /**
         * @return namespace
         */
        public java.util.List < String > getNamespace() {
            return this.namespace;
        }

        /**
         * @return ruleAction
         */
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return strategyTemplateId
         */
        public Long getStrategyTemplateId() {
            return this.strategyTemplateId;
        }

        /**
         * @return unScanedImage
         */
        public Boolean getUnScanedImage() {
            return this.unScanedImage;
        }

        /**
         * @return whiteList
         */
        public java.util.List < String > getWhiteList() {
            return this.whiteList;
        }

        public static final class Builder {
            private AlarmDetail alarmDetail; 
            private String clusterId; 
            private String clusterName; 
            private String description; 
            private java.util.List < String > imageName; 
            private java.util.List < String > label; 
            private Boolean maliciousImage; 
            private java.util.List < String > namespace; 
            private Integer ruleAction; 
            private Long strategyId; 
            private String strategyName; 
            private Long strategyTemplateId; 
            private Boolean unScanedImage; 
            private java.util.List < String > whiteList; 

            /**
             * AlarmDetail.
             */
            public Builder alarmDetail(AlarmDetail alarmDetail) {
                this.alarmDetail = alarmDetail;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(java.util.List < String > imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(java.util.List < String > label) {
                this.label = label;
                return this;
            }

            /**
             * MaliciousImage.
             */
            public Builder maliciousImage(Boolean maliciousImage) {
                this.maliciousImage = maliciousImage;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(java.util.List < String > namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RuleAction.
             */
            public Builder ruleAction(Integer ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * StrategyTemplateId.
             */
            public Builder strategyTemplateId(Long strategyTemplateId) {
                this.strategyTemplateId = strategyTemplateId;
                return this;
            }

            /**
             * UnScanedImage.
             */
            public Builder unScanedImage(Boolean unScanedImage) {
                this.unScanedImage = unScanedImage;
                return this;
            }

            /**
             * WhiteList.
             */
            public Builder whiteList(java.util.List < String > whiteList) {
                this.whiteList = whiteList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
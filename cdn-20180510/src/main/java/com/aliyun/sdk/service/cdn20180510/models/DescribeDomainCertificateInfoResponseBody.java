// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCertificateInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCertificateInfoResponseBody</p>
 */
public class DescribeDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    private CertInfos certInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainCertificateInfoResponseBody(Builder builder) {
        this.certInfos = builder.certInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCertificateInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return certInfos
     */
    public CertInfos getCertInfos() {
        return this.certInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CertInfos certInfos; 
        private String requestId; 

        /**
         * The information about the certificate.
         */
        public Builder certInfos(CertInfos certInfos) {
            this.certInfos = certInfos;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainCertificateInfoResponseBody build() {
            return new DescribeDomainCertificateInfoResponseBody(this);
        } 

    } 

    public static class CertInfo extends TeaModel {
        @NameInMap("CertDomainName")
        private String certDomainName;

        @NameInMap("CertExpireTime")
        private String certExpireTime;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("CertLife")
        private String certLife;

        @NameInMap("CertName")
        private String certName;

        @NameInMap("CertOrg")
        private String certOrg;

        @NameInMap("CertRegion")
        private String certRegion;

        @NameInMap("CertStartTime")
        private String certStartTime;

        @NameInMap("CertType")
        private String certType;

        @NameInMap("CertUpdateTime")
        private String certUpdateTime;

        @NameInMap("DomainCnameStatus")
        private String domainCnameStatus;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ServerCertificate")
        private String serverCertificate;

        @NameInMap("ServerCertificateStatus")
        private String serverCertificateStatus;

        @NameInMap("Status")
        private String status;

        private CertInfo(Builder builder) {
            this.certDomainName = builder.certDomainName;
            this.certExpireTime = builder.certExpireTime;
            this.certId = builder.certId;
            this.certLife = builder.certLife;
            this.certName = builder.certName;
            this.certOrg = builder.certOrg;
            this.certRegion = builder.certRegion;
            this.certStartTime = builder.certStartTime;
            this.certType = builder.certType;
            this.certUpdateTime = builder.certUpdateTime;
            this.domainCnameStatus = builder.domainCnameStatus;
            this.domainName = builder.domainName;
            this.serverCertificate = builder.serverCertificate;
            this.serverCertificateStatus = builder.serverCertificateStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certDomainName
         */
        public String getCertDomainName() {
            return this.certDomainName;
        }

        /**
         * @return certExpireTime
         */
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return certLife
         */
        public String getCertLife() {
            return this.certLife;
        }

        /**
         * @return certName
         */
        public String getCertName() {
            return this.certName;
        }

        /**
         * @return certOrg
         */
        public String getCertOrg() {
            return this.certOrg;
        }

        /**
         * @return certRegion
         */
        public String getCertRegion() {
            return this.certRegion;
        }

        /**
         * @return certStartTime
         */
        public String getCertStartTime() {
            return this.certStartTime;
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return certUpdateTime
         */
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        /**
         * @return domainCnameStatus
         */
        public String getDomainCnameStatus() {
            return this.domainCnameStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return serverCertificate
         */
        public String getServerCertificate() {
            return this.serverCertificate;
        }

        /**
         * @return serverCertificateStatus
         */
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certDomainName; 
            private String certExpireTime; 
            private String certId; 
            private String certLife; 
            private String certName; 
            private String certOrg; 
            private String certRegion; 
            private String certStartTime; 
            private String certType; 
            private String certUpdateTime; 
            private String domainCnameStatus; 
            private String domainName; 
            private String serverCertificate; 
            private String serverCertificateStatus; 
            private String status; 

            /**
             * The domain name that matches the certificate.
             */
            public Builder certDomainName(String certDomainName) {
                this.certDomainName = certDomainName;
                return this;
            }

            /**
             * The time at which the certificate expires.
             */
            public Builder certExpireTime(String certExpireTime) {
                this.certExpireTime = certExpireTime;
                return this;
            }

            /**
             * The ID of the certificate.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The unit of the validity period of the certificate. Valid values:
             * <p>
             * 
             * *   **months**
             * *   **years**
             */
            public Builder certLife(String certLife) {
                this.certLife = certLife;
                return this;
            }

            /**
             * The name of the certificate.
             */
            public Builder certName(String certName) {
                this.certName = certName;
                return this;
            }

            /**
             * The name of the certificate authority (CA) that issued the certificate.
             */
            public Builder certOrg(String certOrg) {
                this.certOrg = certOrg;
                return this;
            }

            /**
             * The region where the certificate is used.
             */
            public Builder certRegion(String certRegion) {
                this.certRegion = certRegion;
                return this;
            }

            /**
             * The time when the certificate became effective.
             */
            public Builder certStartTime(String certStartTime) {
                this.certStartTime = certStartTime;
                return this;
            }

            /**
             * The type of the certificate.
             * <p>
             * 
             * *   **free**: a free certificate
             * *   **cas**: a certificate that is purchased by using Certificate Management Service
             * *   **upload**: a custom certificate that you upload
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * The time at which the certificate was updated.
             */
            public Builder certUpdateTime(String certUpdateTime) {
                this.certUpdateTime = certUpdateTime;
                return this;
            }

            /**
             * The CANME status of the domain name.
             * <p>
             * 
             * *   **ok**: The domain name points to the CNAME assigned by Alibaba Cloud CDN.
             * *   **cname_error**: An error occurred and the domain name cannot point to the CNAME.
             * *   **op_domain_cname_error** : An error occurred to the CNAME of the top-level domain. The domain name cannot point to the CNAME.
             * *   **unsupport_wildcard**: The wildcard domain name is not supported.
             */
            public Builder domainCnameStatus(String domainCnameStatus) {
                this.domainCnameStatus = domainCnameStatus;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The public key of the certificate.
             */
            public Builder serverCertificate(String serverCertificate) {
                this.serverCertificate = serverCertificate;
                return this;
            }

            /**
             * The status of HTTPS.
             * <p>
             * 
             * *   **on**
             * *   **off**
             */
            public Builder serverCertificateStatus(String serverCertificateStatus) {
                this.serverCertificateStatus = serverCertificateStatus;
                return this;
            }

            /**
             * The status of the certificate. Valid values:
             * <p>
             * 
             * *   **success**: The certificate has taken effect.
             * *   **checking**: The system is checking whether the domain name is using Alibaba Cloud CDN.
             * *   **cname_error**: No valid CNAME record has been added for the domain name.
             * *   **top_domain_cname_error**: No valid CNAME record has been added for the top-level domain.
             * *   **domain_invalid**: The domain name contains invalid characters.
             * *   **unsupport_wildcard**: The domain name is a wildcard domain name. Wildcard domain names are not supported.
             * *   **applying**: The certificate application is in progress.
             * *   **get_token_timeout**: The certificate application request has timed out.
             * *   **check_token_timeout**: The verification has timed out.
             * *   **get_cert_timeout**: The request to obtain the certificate has timed out.
             * *   **failed**: The certificate application request failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    public static class CertInfos extends TeaModel {
        @NameInMap("CertInfo")
        private java.util.List < CertInfo> certInfo;

        private CertInfos(Builder builder) {
            this.certInfo = builder.certInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfos create() {
            return builder().build();
        }

        /**
         * @return certInfo
         */
        public java.util.List < CertInfo> getCertInfo() {
            return this.certInfo;
        }

        public static final class Builder {
            private java.util.List < CertInfo> certInfo; 

            /**
             * CertInfo.
             */
            public Builder certInfo(java.util.List < CertInfo> certInfo) {
                this.certInfo = certInfo;
                return this;
            }

            public CertInfos build() {
                return new CertInfos(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostgresExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostgresExtensionsResponseBody</p>
 */
public class DescribePostgresExtensionsResponseBody extends TeaModel {
    @NameInMap("InstalledExtensions")
    private java.util.List < InstalledExtensions> installedExtensions;

    @NameInMap("Overview")
    private java.util.Map < String, ? > overview;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UninstalledExtensions")
    private java.util.List < UninstalledExtensions> uninstalledExtensions;

    private DescribePostgresExtensionsResponseBody(Builder builder) {
        this.installedExtensions = builder.installedExtensions;
        this.overview = builder.overview;
        this.requestId = builder.requestId;
        this.uninstalledExtensions = builder.uninstalledExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostgresExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return installedExtensions
     */
    public java.util.List < InstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    /**
     * @return overview
     */
    public java.util.Map < String, ? > getOverview() {
        return this.overview;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uninstalledExtensions
     */
    public java.util.List < UninstalledExtensions> getUninstalledExtensions() {
        return this.uninstalledExtensions;
    }

    public static final class Builder {
        private java.util.List < InstalledExtensions> installedExtensions; 
        private java.util.Map < String, ? > overview; 
        private String requestId; 
        private java.util.List < UninstalledExtensions> uninstalledExtensions; 

        /**
         * InstalledExtensions.
         */
        public Builder installedExtensions(java.util.List < InstalledExtensions> installedExtensions) {
            this.installedExtensions = installedExtensions;
            return this;
        }

        /**
         * Overview.
         */
        public Builder overview(java.util.Map < String, ? > overview) {
            this.overview = overview;
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
         * UninstalledExtensions.
         */
        public Builder uninstalledExtensions(java.util.List < UninstalledExtensions> uninstalledExtensions) {
            this.uninstalledExtensions = uninstalledExtensions;
            return this;
        }

        public DescribePostgresExtensionsResponseBody build() {
            return new DescribePostgresExtensionsResponseBody(this);
        } 

    } 

    public static class InstalledExtensions extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("DefaultVersion")
        private String defaultVersion;

        @NameInMap("InstalledVersion")
        private String installedVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Requires")
        private String requires;

        private InstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstalledExtensions create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return installedVersion
         */
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return requires
         */
        public String getRequires() {
            return this.requires;
        }

        public static final class Builder {
            private String category; 
            private String comment; 
            private String defaultVersion; 
            private String installedVersion; 
            private String name; 
            private String owner; 
            private String priority; 
            private String requires; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * InstalledVersion.
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Requires.
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            public InstalledExtensions build() {
                return new InstalledExtensions(this);
            } 

        } 

    }
    public static class UninstalledExtensions extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("DefaultVersion")
        private String defaultVersion;

        @NameInMap("InstalledVersion")
        private String installedVersion;

        @NameInMap("Name")
        private String name;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("Requires")
        private String requires;

        private UninstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UninstalledExtensions create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return installedVersion
         */
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return requires
         */
        public String getRequires() {
            return this.requires;
        }

        public static final class Builder {
            private String category; 
            private String comment; 
            private String defaultVersion; 
            private String installedVersion; 
            private String name; 
            private String owner; 
            private String priority; 
            private String requires; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * InstalledVersion.
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Requires.
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            public UninstalledExtensions build() {
                return new UninstalledExtensions(this);
            } 

        } 

    }
}
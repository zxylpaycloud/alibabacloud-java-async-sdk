// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Submenu} extends {@link TeaModel}
 *
 * <p>Submenu</p>
 */
public class Submenu extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("SubmenuDesc")
    private String submenuDesc;

    @com.aliyun.core.annotation.NameInMap("SubmenuType")
    private String submenuType;

    @com.aliyun.core.annotation.NameInMap("Submenus")
    private java.util.List < Submenu > submenus;

    private Submenu(Builder builder) {
        this.items = builder.items;
        this.submenuDesc = builder.submenuDesc;
        this.submenuType = builder.submenuType;
        this.submenus = builder.submenus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Submenu create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return submenuDesc
     */
    public String getSubmenuDesc() {
        return this.submenuDesc;
    }

    /**
     * @return submenuType
     */
    public String getSubmenuType() {
        return this.submenuType;
    }

    /**
     * @return submenus
     */
    public java.util.List < Submenu > getSubmenus() {
        return this.submenus;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String submenuDesc; 
        private String submenuType; 
        private java.util.List < Submenu > submenus; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * SubmenuDesc.
         */
        public Builder submenuDesc(String submenuDesc) {
            this.submenuDesc = submenuDesc;
            return this;
        }

        /**
         * SubmenuType.
         */
        public Builder submenuType(String submenuType) {
            this.submenuType = submenuType;
            return this;
        }

        /**
         * Submenus.
         */
        public Builder submenus(java.util.List < Submenu > submenus) {
            this.submenus = submenus;
            return this;
        }

        public Submenu build() {
            return new Submenu(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @com.aliyun.core.annotation.NameInMap("ItemDesc")
        private String itemDesc;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private String itemType;

        @com.aliyun.core.annotation.NameInMap("RelatingItems")
        private java.util.List < String > relatingItems;

        private Items(Builder builder) {
            this.defaultSelected = builder.defaultSelected;
            this.itemDesc = builder.itemDesc;
            this.itemType = builder.itemType;
            this.relatingItems = builder.relatingItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return defaultSelected
         */
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        /**
         * @return itemDesc
         */
        public String getItemDesc() {
            return this.itemDesc;
        }

        /**
         * @return itemType
         */
        public String getItemType() {
            return this.itemType;
        }

        /**
         * @return relatingItems
         */
        public java.util.List < String > getRelatingItems() {
            return this.relatingItems;
        }

        public static final class Builder {
            private Boolean defaultSelected; 
            private String itemDesc; 
            private String itemType; 
            private java.util.List < String > relatingItems; 

            /**
             * DefaultSelected.
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * ItemDesc.
             */
            public Builder itemDesc(String itemDesc) {
                this.itemDesc = itemDesc;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(String itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * RelatingItems.
             */
            public Builder relatingItems(java.util.List < String > relatingItems) {
                this.relatingItems = relatingItems;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}

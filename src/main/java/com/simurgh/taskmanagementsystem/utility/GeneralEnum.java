package com.simurgh.taskmanagementsystem.utility;

public class GeneralEnum {

    public enum Status {

        UserActive(8L),
        UserBanned(10L);

        private final long statusId;

        Status(long statusId) {
            this.statusId = statusId;
        }

        public long getStatusId() {
            return statusId;
        }
    }

    public enum Type {

        GeneralUser(1L);

        private final long typeId;

        Type(long typeId) {
            this.typeId = typeId;
        }

        public long getTypeId() {
            return typeId;
        }
    }

}

package za.ac.cput.Domain;

public class TenantApplication {
    public String tenantId;
    public String tenantStatus;
    public String userTenant;
    public String property;

    private TenantApplication(TenantApplication.Builder builder) {
        this.tenantId = builder.tenantId;
        this.tenantStatus = builder.tenantStatus;
        this.userTenant = builder.userTenant;
        this.property = builder.property;



    }

    public String getTenantId() {
        return tenantId;
    }

    public String getTenantStatus() {
        return tenantStatus;
    }

    public String getUserTenant() {
        return userTenant;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "TenantApplication{" +
                "tenantId='" + tenantId + '\'' +
                ", tenantStatus='" + tenantStatus + '\'' +
                ", userTenant='" + userTenant + '\'' +
                ", property='" + property + '\'' +
                '}';
    }

    public static class Builder {
        private String tenantId;
        private String tenantStatus;
        private String userTenant;
        private String property;

        public Builder() {}

        public Builder setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantStatus(String tenantStatus) {
            this.tenantStatus = tenantStatus;
            return this;
        }

        public Builder setUserTenant(String userTenant) {
            this.userTenant = userTenant;
            return this;
        }

        public Builder setProperty(String property) {
            this.property = property;
            return this;
        }

        public TenantApplication.Builder copy(TenantApplication tenantApplication) {
            this.tenantId = tenantApplication.tenantId;
            this.tenantStatus = tenantApplication.tenantStatus;
            this.userTenant = tenantApplication.userTenant;
            this.property = tenantApplication.property;
            return this;
        }

        public TenantApplication build() {
            return new TenantApplication(this);
        }

    }
}
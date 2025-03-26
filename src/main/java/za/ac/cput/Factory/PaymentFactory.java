package za.ac.cput.Factory;

import za.ac.cput.Domain.Payment;

public class PaymentFactory {
    public static Payment createPayment(String paymentId, String amount, String paymentStatus, String userTenant, String property){
        if (paymentId == null || paymentId.isEmpty()) return null;
        if (amount == null || amount.isEmpty()) return null;
        if (paymentStatus == null || paymentStatus.isEmpty()) return null;
        if(userTenant == null || userTenant.isEmpty()) return null;
        if(property == null || property.isEmpty()) return null;

        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setAmount(amount)
                .setPaymentStatus(paymentStatus)
                .setUserTenant(userTenant)
                .setProperty(property)
                 .build();






    }
}
